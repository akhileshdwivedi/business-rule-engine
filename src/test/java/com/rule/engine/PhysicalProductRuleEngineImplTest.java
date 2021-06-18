package com.rule.engine;

import com.rule.engine.service.PhysicalProductRuleEngine;
import com.rule.engine.serviceImpl.PhysicalProductRuleEngineImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhysicalProductRuleEngineImplTest {
    PhysicalProductRuleEngine physicalProductRuleEngine;

    @BeforeEach
    public void steUp(){
        physicalProductRuleEngine = new PhysicalProductRuleEngineImpl();
    }

    @Test
    public void generatePackingSlip(){
        Assertions.assertThat(physicalProductRuleEngine.generatePackingSlip()).isTrue();
    }

    @Test
    public void generateAgentCommission(){
        Assertions.assertThat(physicalProductRuleEngine.generateAgentCommission()).isTrue();
    }
}
