package com.dxp.bo.application.repository;

import com.dxp.bo.application.model.EventConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventConfigurationRepository extends JpaRepository<EventConfiguration, Integer> {
}
