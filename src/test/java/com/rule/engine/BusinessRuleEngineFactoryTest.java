package com.rule.engine;

import com.rule.engine.model.Product;
import com.rule.engine.service.MemberShipRuleEngine;
import com.rule.engine.service.PhysicalProductRuleEngine;
import com.rule.engine.service.BookRuleEngine;
import com.rule.engine.service.VideoRuleEngine;
import com.rule.engine.serviceImpl.MemberShipRuleEngineImpl;
import com.rule.engine.serviceImpl.PhysicalProductRuleEngineImpl;
import com.rule.engine.serviceImpl.BookRuleEngineImpl;
import com.rule.engine.serviceImpl.VideoRuleEngineImpl;
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
        BookRuleEngine bookRuleEngine = (BookRuleEngine)businessRuleEngineFactory.getRuleEngine(Product.BOOK);
        Assertions.assertThat(bookRuleEngine).isInstanceOf(BookRuleEngineImpl.class);
        Assertions.assertThat(bookRuleEngine).isNotNull();
    }

    @Test
    public void getPhysicalProductRuleEngine(){
        PhysicalProductRuleEngine physicalProductRuleEngine =  (PhysicalProductRuleEngine)businessRuleEngineFactory.getRuleEngine(Product.PHYSICAL_PRODUCT);
        Assertions.assertThat(physicalProductRuleEngine).isInstanceOf(PhysicalProductRuleEngineImpl.class);
        Assertions.assertThat(physicalProductRuleEngine).isNotNull();
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
        Assertions.assertThat(videoRuleEngineEngine).isInstanceOf(VideoRuleEngineImpl.class);
        Assertions.assertThat(videoRuleEngineEngine).isNotNull();
    }

}
