package com.aclc.InventoryManagementSystem.repository;

import com.aclc.InventoryManagementSystem.model.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Integer> {
}