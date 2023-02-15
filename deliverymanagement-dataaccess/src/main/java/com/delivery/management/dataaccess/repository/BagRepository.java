package com.delivery.management.dataaccess.repository;

import com.delivery.management.dataaccess.entity.BagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BagRepository extends JpaRepository<BagEntity, UUID> {
}
