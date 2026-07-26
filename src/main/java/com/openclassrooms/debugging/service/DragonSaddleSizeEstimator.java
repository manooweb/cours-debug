package com.openclassrooms.debugging.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Draggon Saddle Size Estimation based on an ancient ritual
 * This could also serve as a great example for a course on debugging
 * @Author Kal Issy
 */
@Service
public class DragonSaddleSizeEstimator {
    private static Logger logger = LoggerFactory.getLogger(DragonSaddleSizeEstimator.class);

    /**
     * A mystical constant
     */
    public static final double MYSTICAL_CONSTANT = 1;
    public static final int NON_EXISTANT_DRAGON_SIZE = 0;

    @Autowired
    private DragonSaddleSizeVerifier verifier;

    /**
     * Estimates the size of a saddle in centimeters for a given year
     * @param targetYear
     * @return Saddle size
     */
    public Double estimateSaddleSizeInCentiMeters(int targetYear) throws Exception {
        logger.debug("Estimation d'une taille de selle pour {}", targetYear);
        double saddleSizeInCm = calculateSaddleSizeFromYear(targetYear);

        // Verify that we have a valid saddle size
        verifier.verify(saddleSizeInCm);
        logger.info("Taille de selle en cm calculée: {}", saddleSizeInCm);

        return saddleSizeInCm;
    }

    private double calculateSaddleSizeFromYear(int targetYear) {
        logger.trace("A propos du calcul d'une taille de selle avec la constante mystique: {} et l'année cible: {}", MYSTICAL_CONSTANT, targetYear);
        // Count down the number of years it's been alive
        double saddleSizeInCm = targetYear-MYSTICAL_CONSTANT;

        // This is from an era before dragon's were spawned
        if (saddleSizeInCm<0) {
            logger.warn("Taille de selle inférieure à 0 détectée");
            return NON_EXISTANT_DRAGON_SIZE;
        }

        logger.trace("Taille de selle calculée {}cm avec la constante mystique[{}] et l'année cible[{}]", saddleSizeInCm, MYSTICAL_CONSTANT, targetYear);
        // calculate the final saddle size
        return saddleSizeInCm;
    }
}
