package com.delivery.management.domain.valueobject;

import java.util.UUID;

public class DeliveryPoint {

    private final UUID deliveryPointId;

    private final String deliveryPointName;

    private final int value;


    public DeliveryPoint(DeliveryPointBuilder builder){
        this.deliveryPointId = builder.deliveryPointId;
        this.deliveryPointName = builder.deliveryPointName;
        this.value = builder.value;
    }

    public static final class DeliveryPointBuilder {
        private UUID deliveryPointId;
        private String deliveryPointName;
        private int value;

        private DeliveryPointBuilder() {
        }

        public static DeliveryPointBuilder aDeliveryPoint() {
            return new DeliveryPointBuilder();
        }

        public DeliveryPointBuilder withDeliveryPointId(UUID deliveryPointId) {
            this.deliveryPointId = deliveryPointId;
            return this;
        }

        public DeliveryPointBuilder withDeliveryPointName(String deliveryPointName) {
            this.deliveryPointName = deliveryPointName;
            return this;
        }

        public DeliveryPointBuilder withValue(int value) {
            this.value = value;
            return this;
        }

        public DeliveryPoint build() {
            return new DeliveryPoint(this);
        }
    }
}
