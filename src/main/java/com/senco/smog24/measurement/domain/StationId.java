package com.senco.smog24.measurement.domain;

import java.util.Objects;
import java.util.UUID;

class StationId {

    private final UUID id;

    public StationId(UUID id) {
        this.id = id;
    }

    public static StationId newOne() {
        return new StationId(UUID.randomUUID());
    }

    public UUID id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationId that = (StationId) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public String toString() {
        return "SubscriptionId{" +
                "id=" + id +
                '}';
    }
}