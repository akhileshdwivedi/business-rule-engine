package com.rule.engine;

import com.rule.engine.service.MemberShipRuleEngine;
import com.rule.engine.serviceImpl.MemberShipRuleEngineImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberShipRuleEngineImplTest {

    MemberShipRuleEngine memberShipRuleEngine;

    @BeforeEach
    public void steUp(){
        memberShipRuleEngine = new MemberShipRuleEngineImpl();
    }

    @Test
    public void activateMembership(){
        Assertions.assertThat(memberShipRuleEngine.activateMembership()).isTrue();
    }

    @Test
    public void upgradeMembership(){
        Assertions.assertThat(memberShipRuleEngine.upgradeMembership()).isTrue();
    }

    @Test
    public void upgradeMembershipEmailSend(){
        Assertions.assertThat(memberShipRuleEngine.sendEmail()).isTrue();
    }
}
