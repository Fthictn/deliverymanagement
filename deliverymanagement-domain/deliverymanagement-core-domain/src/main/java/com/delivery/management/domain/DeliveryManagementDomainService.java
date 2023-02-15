package com.delivery.management.domain;

import com.delivery.management.domain.entity.Bag;
import com.delivery.management.domain.entity.Package;
import com.delivery.management.domain.event.BagDeliveryEvent;
import com.delivery.management.domain.event.PackageDeliveryEvent;

import java.util.List;

public class DeliveryManagementDomainService {

    public PackageDeliveryEvent deliverPackage(List<Package> aPackages){
        return null;
    }

    public BagDeliveryEvent deliverBag(List<Bag> bags){
        return null;
    }

}
