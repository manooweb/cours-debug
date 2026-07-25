package com.openclassrooms.debugging;

import java.util.Calendar;

/**
 * Guesses the size of a dragon's saddle.
 * TODO: Wise-elder Raf's feedback form the year 0 AD needs to eventually be addressed.
 *
 * @Author Kal Isee
 * @Date 1st January 0 BC
 */
public class DragonSaddleSizeGuesser {

    public static void main(String[] args) throws Exception {
        DragonSaddleSizeEstimator estimator = DragonSaddleSizeEstimator.INSTANCE;
        // Loop needlessly to replicate and ancient ritual
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
        }

        int targetYear = Calendar.getInstance().get(Calendar.YEAR);

        // Take the year from the command line arguments
        if (args.length != 0) {
            targetYear = Integer.parseInt(args[0]);
        }

        System.out.println("En cours de calcul de taille de selle pour un dragon en l'an " + targetYear);

        // Estimate the saddle size of a dragon,
        // relative to the year "One" when all extent dragons were born.
        double saddleSize = DragonSaddleSizeEstimator.INSTANCE.estimateSaddleSizeInCentiMeters(targetYear);

        // Report
        new SaddleSizeReporter(targetYear, saddleSize).report();
    }

}
