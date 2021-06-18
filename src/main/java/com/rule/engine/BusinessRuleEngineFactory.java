package com.rule.engine;

import com.rule.engine.model.Product;
import com.rule.engine.serviceImpl.MemberShipRuleEngineImpl;
import com.rule.engine.serviceImpl.PhysicalProductEngineImpl;
import com.rule.engine.serviceImpl.ProductRuleEngineImpl;
import com.rule.engine.serviceImpl.VideoRuleEngineEngineImpl;

public class BusinessRuleEngineFactory {
    public Object getRuleEngine(Product product) {
        if(product == null){
            throw new IllegalArgumentException("Invalid product");
        }

        if(product.equals(Product.BOOK)){
            return new ProductRuleEngineImpl();
        } else if(product.equals(Product.PHYSICAL_PRODUCT)){
            return new PhysicalProductEngineImpl();
        } else if(product.equals(Product.MEMBERSHIP)){
            return new MemberShipRuleEngineImpl();
        } else if(product.equals(Product.VIDEO)){
            return new VideoRuleEngineEngineImpl();
        }
        return null;
    }
}
