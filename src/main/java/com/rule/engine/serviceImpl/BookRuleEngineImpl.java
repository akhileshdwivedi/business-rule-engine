package com.rule.engine.serviceImpl;

import com.rule.engine.service.BookRuleEngine;

public class BookRuleEngineImpl implements BookRuleEngine {

    @Override
    public boolean generatePackingSlip() {
        return true;
    }

    @Override
    public boolean generateAgentCommission() {
        return true;
    }
}
