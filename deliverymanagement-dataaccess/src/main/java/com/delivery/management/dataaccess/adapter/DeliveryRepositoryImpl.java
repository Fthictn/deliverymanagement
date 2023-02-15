package com.delivery.management.dataaccess.adapter;

import com.delivery.management.dataaccess.repository.PackageRepository;
import com.delivery.management.domain.ports.output.DeliveryRepository;
import com.delivery.management.dataaccess.repository.BagRepository;

public class DeliveryRepositoryImpl implements DeliveryRepository {

    private final BagRepository bagRepository;
    private final PackageRepository packageRepository;

    public DeliveryRepositoryImpl(BagRepository bagRepository, PackageRepository packageRepository) {
        this.bagRepository = bagRepository;
        this.packageRepository = packageRepository;
    }
}
