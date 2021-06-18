package com.rule.engine.service;

public interface MemberShipRuleEngine {
    boolean activateMembership();

    boolean upgradeMembership();

    boolean sendEmail();
}
