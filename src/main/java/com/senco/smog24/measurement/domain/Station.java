package com.senco.smog24.measurement.domain;

import com.senco.smog24.common.Result;

import static com.senco.smog24.measurement.domain.MeasurementResult.Measurred;

/**
 * @author Marcin Świerczyński
 * @since 01/11/2019
 */
class Station {

    private final StationId stationId;
    private final Measurements measurements;

    Station(StationId stationId, Measurements measurements) {
        this.stationId = stationId;
        this.measurements = measurements;
    }

    MeasurementResult meassure(Measurement measurement) {
        if (measurements.allreadyContains(measurement)) {
            return Measurred;
        }

        measurements.measure(measurement);
        return Measurred;
    }

}
