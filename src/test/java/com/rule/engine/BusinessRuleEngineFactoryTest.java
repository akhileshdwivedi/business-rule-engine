package com.rule.engine;

import com.rule.engine.model.Product;
import com.rule.engine.service.MemberShipRuleEngine;
import com.rule.engine.service.PhysicalProductEngine;
import com.rule.engine.service.ProductRuleEngine;
import com.rule.engine.service.VideoRuleEngine;
import com.rule.engine.serviceImpl.MemberShipRuleEngineImpl;
import com.rule.engine.serviceImpl.PhysicalProductEngineImpl;
import com.rule.engine.serviceImpl.ProductRuleEngineImpl;
import com.rule.engine.serviceImpl.VideoRuleEngineEngineImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessRuleEngineFactoryTest {
    BusinessRuleEngineFactory businessRuleEngineFactory;

    @BeforeEach
    public void setUp(){
        businessRuleEngineFactory = new BusinessRuleEngineFactory();
    }

    @Test
    public void getRuleEngineFromFactory(){
        Object obj = businessRuleEngineFactory.getRuleEngine(Product.BOOK);
        Assertions.assertThat(obj).isNotNull();
    }

    @Test
    public void throwExceptionWhenProductTypePassIsNull(){
        Assertions.assertThatThrownBy(() -> businessRuleEngineFactory.getRuleEngine(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid product");
    }

    @Test
    public void getBookRuleEngine(){
        ProductRuleEngine productRuleEngine = (ProductRuleEngine)businessRuleEngineFactory.getRuleEngine(Product.BOOK);
        Assertions.assertThat(productRuleEngine).isInstanceOf(ProductRuleEngineImpl.class);
        Assertions.assertThat(productRuleEngine).isNotNull();
    }

    @Test
    public void getPhysicalProductRuleEngine(){
        PhysicalProductEngine physicalProductEngine =  (PhysicalProductEngine)businessRuleEngineFactory.getRuleEngine(Product.PHYSICAL_PRODUCT);
        Assertions.assertThat(physicalProductEngine).isInstanceOf(PhysicalProductEngineImpl.class);
        Assertions.assertThat(physicalProductEngine).isNotNull();
    }

    @Test
    public void getMemberShipRuleEngine(){
        MemberShipRuleEngine memberShipRuleEngine =  (MemberShipRuleEngine)businessRuleEngineFactory.getRuleEngine(Product.MEMBERSHIP);
        Assertions.assertThat(memberShipRuleEngine).isInstanceOf(MemberShipRuleEngineImpl.class);
        Assertions.assertThat(memberShipRuleEngine).isNotNull();
    }

    @Test
    public void getVideoRuleEngine(){
        VideoRuleEngine videoRuleEngineEngine =  (VideoRuleEngine)businessRuleEngineFactory.getRuleEngine(Product.VIDEO);
        Assertions.assertThat(videoRuleEngineEngine).isInstanceOf(VideoRuleEngineEngineImpl.class);
        Assertions.assertThat(videoRuleEngineEngine).isNotNull();
    }

}
