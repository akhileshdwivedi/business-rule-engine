package com.rule.engine;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessRuleEngineApplicationTest {

    private BusinessRuleEngineApplication businessRuleEngineApplication;

    @BeforeEach
     public void setUp(){
        businessRuleEngineApplication = new BusinessRuleEngineApplication();
    }

    @Test
    public void testBusinessRuleEngineApplication(){
        assertThat(businessRuleEngineApplication).isNotNull();
        assertThat(businessRuleEngineApplication.getClass()).isEqualTo(BusinessRuleEngineApplication.class);
    }
}
