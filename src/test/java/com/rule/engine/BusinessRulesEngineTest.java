package com.rule.engine;

import com.rule.engine.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessRulesEngineTest {

    private BusinessRulesEngine businessRulesEngine;

    @BeforeEach
    public void setUp(){
        businessRulesEngine = new BusinessRulesEngine();
    }

    @Test
    public void processMembership(){
        boolean memberShipActivated = businessRulesEngine.processMember(Product.MEMBERSHIP, true, false);

    }

}
