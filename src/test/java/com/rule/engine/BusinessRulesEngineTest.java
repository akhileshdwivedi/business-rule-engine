package com.rule.engine;

import com.rule.engine.model.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessRulesEngineTest {

    private BusinessRulesEngine businessRulesEngine;

    private BusinessRuleEngineFactory businessRuleEngineFactory;

    @BeforeEach
    public void setUp(){
        businessRuleEngineFactory = new BusinessRuleEngineFactory();
        businessRulesEngine = new BusinessRulesEngine(businessRuleEngineFactory);
    }

    @Test
    public void businessRulesEngineInitialized(){
        Assertions.assertThat(businessRulesEngine).isNotNull();
    }

    @Test
    public void processMembership(){
        boolean memberShipActivated = businessRulesEngine.processMember(Product.MEMBERSHIP, true, false);
        Assertions.assertThat(memberShipActivated).isTrue();

        boolean memberShipUpgraded = businessRulesEngine.processMember(Product.MEMBERSHIP, false, true);
        Assertions.assertThat(memberShipUpgraded).isTrue();
    }

    @Test
    public void processBook(){
        boolean bookProcessed = businessRulesEngine.processBook(Product.BOOK);
        Assertions.assertThat(bookProcessed).isTrue();
    }

    @Test
    public void processPhysicalProduct(){
        boolean physicalProductProcessed = businessRulesEngine.processPhysicalProduct(Product.PHYSICAL_PRODUCT);
        Assertions.assertThat(physicalProductProcessed).isTrue();
    }
    @Test

    public void processVideo(){
        Assertions.assertThat(businessRulesEngine.processVideo(Product.VIDEO)).isTrue();
    }

}
