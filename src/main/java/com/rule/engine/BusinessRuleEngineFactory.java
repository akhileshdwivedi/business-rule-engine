package com.rule.engine;

import com.rule.engine.model.Product;
import com.rule.engine.serviceImpl.MemberShipRuleEngineImpl;
import com.rule.engine.serviceImpl.PhysicalProductRuleEngineImpl;
import com.rule.engine.serviceImpl.BookRuleEngineImpl;
import com.rule.engine.serviceImpl.VideoRuleEngineImpl;

public class BusinessRuleEngineFactory {
    public Object getRuleEngine(Product product) {
        if(product == null){
            throw new IllegalArgumentException("Invalid product");
        }

        if(product.equals(Product.BOOK)){
            return new BookRuleEngineImpl();
        } else if(product.equals(Product.PHYSICAL_PRODUCT)){
            return new PhysicalProductRuleEngineImpl();
        } else if(product.equals(Product.MEMBERSHIP)){
            return new MemberShipRuleEngineImpl();
        } else if(product.equals(Product.VIDEO)){
            return new VideoRuleEngineImpl();
        }
        return null;
    }
}
