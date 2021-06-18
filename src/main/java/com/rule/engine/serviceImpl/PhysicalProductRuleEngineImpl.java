package com.rule.engine.serviceImpl;

import com.rule.engine.service.PhysicalProductRuleEngine;

public class PhysicalProductRuleEngineImpl implements PhysicalProductRuleEngine {
    @Override
    public boolean generatePackingSlip() {
        return true;
    }

    @Override
    public boolean generateAgentCommission() {
        return true;
    }
}
