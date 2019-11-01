package com.senco.smog24.measurement.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marcin Świerczyński
 * @since 01/11/2019
 */
class Measurements {

    static Measurements newOne() {
        return new Measurements(new HashSet<>());
    }

    private final Set<Measurement> measurements;

    private Measurements(Set<Measurement> measurements) {
        this.measurements = measurements;
    }

    Measurements measure(Measurement measurement) {
        Set<Measurement> measurements = new HashSet<>(this.measurements);
        measurements.add(measurement);
        return new Measurements(measurements);
    }

    boolean allreadyContains(Measurement measurement) {
        return measurements.contains(measurement);
    }

}
