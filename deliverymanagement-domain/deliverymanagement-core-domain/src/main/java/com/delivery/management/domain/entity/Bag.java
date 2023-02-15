package com.delivery.management.domain.entity;

import com.delivery.management.domain.base.entity.AggregateRoot;
import com.delivery.management.domain.valueobject.BagState;
import com.delivery.management.domain.valueobject.BagId;
import com.delivery.management.domain.valueobject.DeliveryPoint;

public class Bag extends AggregateRoot<BagId> {

    private BagState bagState;

    private DeliveryPoint deliveryPoint;

    private final String barcode;

    public Bag(BagBuilder builder){
        super.setId(builder.bagId);
        this.bagState = builder.bagState;
        this.barcode = builder.barcode;
        this.deliveryPoint = builder.deliveryPoint;
    }

    public static final class BagBuilder {
        private BagId bagId;
        private BagState bagState;
        private DeliveryPoint deliveryPoint;
        private String barcode;

        private BagBuilder() {
        }

        public static BagBuilder aBag() {
            return new BagBuilder();
        }

        public BagBuilder withBagId(BagId bagId) {
            this.bagId = bagId;
            return this;
        }

        public BagBuilder withBagState(BagState bagState) {
            this.bagState = bagState;
            return this;
        }

        public BagBuilder withDeliveryPoint(DeliveryPoint deliveryPoint) {
            this.deliveryPoint = deliveryPoint;
            return this;
        }

        public BagBuilder withBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        public Bag build() {
            return new Bag(this);
        }
    }
}
