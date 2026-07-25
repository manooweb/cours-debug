package com.openclassrooms.debugging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Given that we have a DragonSaddleSizeEstimator")
class DragonSaddleSizeEstimatorIntegrationTest {

    @DisplayName("When the year is 2020 Then the saddle size should be 20.19 meters")
    @Test
    void testEstimateSaddleSize() throws Exception {
        DragonSaddleSizeEstimator estimator = DragonSaddleSizeEstimator.INSTANCE;


        double saddleSize = estimator.estimateSaddleSizeInCentiMeters(2020);

        assertEquals(2019.0, saddleSize);
    }

}
