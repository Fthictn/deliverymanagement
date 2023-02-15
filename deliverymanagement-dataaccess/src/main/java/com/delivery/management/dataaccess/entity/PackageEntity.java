package com.delivery.management.dataaccess.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "packages")
@Entity
public class PackageEntity {

    @Id
    private UUID id;

    @Column(name = "state")
    private String state;

    @Column(name = "barcode")
    private String barcode;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "bag_id")
    private BagEntity bagId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_point_id")
    private DeliveryPoint deliveryPoint;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageEntity that = (PackageEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
