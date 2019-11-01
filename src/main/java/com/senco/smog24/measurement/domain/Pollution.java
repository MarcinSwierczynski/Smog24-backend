package com.senco.smog24.measurement.domain;

import java.util.Objects;

import static java.lang.String.format;

/**
 * @author Marcin Świerczyński
 * @since 01/11/2019
 */
class Pollution {

    private final double value;
    private final PollutionType pollutionType;

    private Pollution(double value, PollutionType pollutionType) {
        this.value = value;
        this.pollutionType = pollutionType;
    }

    static Pollution of(double value, PollutionType pollutionType) {
        if (value < 0) {
            throw new IllegalArgumentException(format("Pollution value (%s) cannot be a negative number", value));
        }

        return new Pollution(value, pollutionType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pollution)) return false;
        Pollution pollution = (Pollution) o;
        return Double.compare(pollution.value, value) == 0 &&
                pollutionType == pollution.pollutionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, pollutionType);
    }

    @Override
    public String toString() {
        return "Pollution{" +
                "value=" + value +
                ", pollutionType=" + pollutionType +
                '}';
    }

    enum PollutionType {
        PM10, PM25, SulfurDioxide, NitrogenDioxide
    }

}
