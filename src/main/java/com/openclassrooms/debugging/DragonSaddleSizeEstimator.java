package com.openclassrooms.debugging;

/**
 * Dragon Saddle Size Estimation based on an ancient ritual
 * This could also serve as a great example for a course on debugging
 * @Author Kal Issy
 */
public class DragonSaddleSizeEstimator {

    /**
     * The universal constant which is 42.
    */
   public static int UNIVERSAL_CONSTANT = 42;

   // The year when dragons were first spawned on Earth in 1 AD
   public static final int DRAGON_SPAWN_YEAR = 1;

   /**
    * This number is lucky to dragons.
   */
  public static final int UNIVERSAL_LUCKY_NUMBER = 41;

  // Singleton instance of the Dragon Size Estimator
  public static final DragonSaddleSizeEstimator INSTANCE = new DragonSaddleSizeEstimator();

    private int copyOfUniversalConstant;
    private int yearOfBirth;
    private DragonSaddleSizeVerifier verifier;

    public DragonSaddleSizeEstimator() {
        copyOfUniversalConstant = UNIVERSAL_CONSTANT;
        yearOfBirth = DRAGON_SPAWN_YEAR;
        verifier = new DragonSaddleSizeVerifier();

    }

    public static void setUniversalConstant(int universalConstant){
        UNIVERSAL_CONSTANT = universalConstant;
    }

    /**
     * Estimates the size of a saddle in centimeters for a given year
     * @param targetYear
     * @return Saddle size
     */
    public Double estimateSaddleSizeInCentiMeters(int targetYear) throws Exception {
        double roundedSaddleSize = calculateSaddleSizeFromYear(targetYear);

        // slow down the magic
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw e;
        }

        // Verify that we have a valid saddle size
        verifier.verify(roundedSaddleSize);

        return roundedSaddleSize;
    }

    private double calculateSaddleSizeFromYear(int targetYear) {
        // ((42-1)/41.0)
        double universalLuckyNumber = new Double(UNIVERSAL_LUCKY_NUMBER);
        double mysticalMultiplier = (copyOfUniversalConstant - yearOfBirth)/ universalLuckyNumber;
        // Start by setting the saddle size to the dragon's current age
        int saddleSizeFactor = 0;
        // Count down the number of years it's been alive
        for (int i = targetYear; i>DRAGON_SPAWN_YEAR; i--) {
            saddleSizeFactor++;
            if (i < UNIVERSAL_CONSTANT) {
                int modifier = enchant();
                saddleSizeFactor += modifier;
            }
        }
        // calculate the final saddle size
        double exactSaddleSize = (saddleSizeFactor * mysticalMultiplier) - mysticalMultiplier /10;
        return (double) Math.round(exactSaddleSize);
    }

    private int enchant() {
        return 0; // TODO - find a subject matter expert in enchangment
    }

    /**
     * Sets the universal constant. This should be 42.
     * @param copyOfUniversalConstant
     */
    public void setCopyOfUniversalConstant(int copyOfUniversalConstant) {
        this.copyOfUniversalConstant = copyOfUniversalConstant;
    }

    /**
     * Sets the dragon's year of birth. This is always 1 AD.
     * @param yearOfBirth
     */

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Sets the DragonSaddleSizeVerifier
     * @param verifier
     */
    public void setVerifier(DragonSaddleSizeVerifier verifier) {
        this.verifier = verifier;
    }
}
