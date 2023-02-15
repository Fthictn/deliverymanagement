package com.delivery.management.dataaccess.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bags")
@Entity
public class BagEntity {

    @Id
    private UUID id;

    @Column(name = "state")
    private String state;

    @Column(name = "barcode")
    private String barcode;

    @OneToMany(mappedBy = "bagId",cascade = CascadeType.MERGE)
    private List<PackageEntity> packageList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_point_id")
    private DeliveryPoint deliveryPoint;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagEntity that = (BagEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
