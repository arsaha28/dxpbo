package com.dxp.bo.application.controller.event;


import com.dxp.bo.application.exception.InvalidInputparameterException;
import com.dxp.bo.application.executor.PhaseStepExecutor;
import com.dxp.bo.application.model.Customer;
import com.dxp.bo.application.model.EventConfiguration;
import com.dxp.bo.application.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private Map<String, EventConfiguration> eventsMap;

    @Autowired
    private ApplicationContext applicationContext;

    @PostMapping
    public ResponseEntity<String> process(@RequestBody Loan loan,String event) throws InvalidInputparameterException {
        EventConfiguration eventConfiguration = eventsMap.get(event);
        if(null == eventConfiguration){
            throw new InvalidInputparameterException("Event not supported");
        }else {
            String executorStr = eventConfiguration.getEventExecutor();
            PhaseStepExecutor phaseStepExecutor = (PhaseStepExecutor) applicationContext.getBean(executorStr);
            phaseStepExecutor.execute(loan);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
