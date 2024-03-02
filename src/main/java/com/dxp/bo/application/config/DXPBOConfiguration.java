package com.dxp.bo.application.config;


import com.dxp.bo.application.model.EventConfiguration;
import com.dxp.bo.application.repository.EventConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class DXPBOConfiguration {

    @Autowired
    private EventConfigurationRepository eventConfigurationRepository;

    @Bean
    public Map<String, EventConfiguration> eventConfig(){
        List<EventConfiguration> eventConfigurationList = eventConfigurationRepository.findAll();
        return  eventConfigurationList.stream().collect(Collectors.toMap(EventConfiguration::getEventName,ec->ec));
    }
}
