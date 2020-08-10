package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Agent;
import com.lambdaschool.orders.repositories.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServicesImpl implements AgentServices {

    @Autowired
    AgentRepo agentrepo;

    @Override
    public Agent save(Agent agent){
        return agentrepo.save(agent);
    }
}
