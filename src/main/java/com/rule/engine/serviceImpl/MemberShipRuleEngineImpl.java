package com.rule.engine.serviceImpl;

import com.rule.engine.service.MemberShipRuleEngine;

public class MemberShipRuleEngineImpl implements MemberShipRuleEngine {
    @Override
    public boolean activateMembership() {
        return true;
    }

    @Override
    public boolean upgradeMembership() {
        return true;
    }

    @Override
    public boolean sendEmail() {
        return true;
    }
}
