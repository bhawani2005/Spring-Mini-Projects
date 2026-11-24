package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.SpaceMission;

public interface SpaceMissionRepository extends JpaRepository<SpaceMission, Long> {

}
