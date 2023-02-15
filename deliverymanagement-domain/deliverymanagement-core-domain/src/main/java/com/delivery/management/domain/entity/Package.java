package com.delivery.management.domain.entity;

import com.delivery.management.domain.base.entity.AggregateRoot;
import com.delivery.management.domain.valueobject.Barcode;
import com.delivery.management.domain.valueobject.DeliveryPoint;
import com.delivery.management.domain.valueobject.PackageId;
import com.delivery.management.domain.valueobject.VolumetricWeight;

public class Package extends AggregateRoot<PackageId> {

    private final Barcode barcode;

    private final DeliveryPoint deliveryPoint;

    private final VolumetricWeight volumetricWeight;

    public Package(PackageBuilder builder){
        super.setId(builder.packageId);
        this.barcode = builder.barcode;
        this.deliveryPoint = builder.deliveryPoint;
        this.volumetricWeight = builder.volumetricWeight;
    }

    public static final class PackageBuilder {
        private PackageId packageId;
        private Barcode barcode;
        private DeliveryPoint deliveryPoint;
        private VolumetricWeight volumetricWeight;

        private PackageBuilder() {
        }

        public static PackageBuilder aPackage() {
            return new PackageBuilder();
        }

        public PackageBuilder withPackageId(PackageId packageId) {
            this.packageId = packageId;
            return this;
        }

        public PackageBuilder withBarcode(Barcode barcode) {
            this.barcode = barcode;
            return this;
        }

        public PackageBuilder withDeliveryPoint(DeliveryPoint deliveryPoint) {
            this.deliveryPoint = deliveryPoint;
            return this;
        }

        public PackageBuilder withVolumetricWeight(VolumetricWeight volumetricWeight) {
            this.volumetricWeight = volumetricWeight;
            return this;
        }

        public Package build() {
            return new Package(this);
        }
    }
}
