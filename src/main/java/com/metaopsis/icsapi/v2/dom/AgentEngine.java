package com.metaopsis.icsapi.v2.dom;

import java.util.Arrays;

public class AgentEngine {
    private AgentEngineStatus agentEngineStatus;
    private AgentEngineConfig[] agentEngineConfigs;
    private String[] packages;

    public AgentEngine() {
    }

    public AgentEngineStatus getAgentEngineStatus() {
        return agentEngineStatus;
    }

    public void setAgentEngineStatus(AgentEngineStatus agentEngineStatus) {
        this.agentEngineStatus = agentEngineStatus;
    }

    public AgentEngineConfig[] getAgentEngineConfigs() {
        return agentEngineConfigs;
    }

    public void setAgentEngineConfigs(AgentEngineConfig[] agentEngineConfigs) {
        this.agentEngineConfigs = agentEngineConfigs;
    }

    public String[] getPackages() {
        return packages;
    }

    public void setPackages(String[] packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "AgentEngine{" +
                "agentEngineStatus=" + agentEngineStatus +
                ", agentEngineConfigs=" + Arrays.toString(agentEngineConfigs) +
                ", packages=" + Arrays.toString(packages) +
                '}';
    }
}
