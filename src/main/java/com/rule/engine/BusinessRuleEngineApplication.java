package com.rule.engine;

import static com.rule.engine.model.Product.*;
import static com.rule.engine.model.Product.VIDEO;

public class BusinessRuleEngineApplication {
    public static void main(String[] args) {
        System.out.println("================Business Rule Engine Started======");

        BusinessRulesEngine businessRulesEngine = new BusinessRulesEngine(new BusinessRuleEngineFactory());
        boolean videoProcessed = businessRulesEngine.processVideo(VIDEO);
        System.out.println("Video processed==>"+ videoProcessed);
        boolean memberActivated = businessRulesEngine.processMember(MEMBERSHIP, true, false);
        System.out.println("Member activated==>"+ memberActivated);
        boolean memberUpgraded = businessRulesEngine.processMember(MEMBERSHIP, false, true);
        System.out.println("Member upgraded==>"+ memberUpgraded);
        boolean bookCompleted = businessRulesEngine.processBook(BOOK);
        System.out.println("Book processed==>"+ bookCompleted);
        boolean physicalProductProcessed = businessRulesEngine.processPhysicalProduct(PHYSICAL_PRODUCT);
        System.out.println("Physical product processed==>"+ physicalProductProcessed);

        System.out.println("================Business Rule Engine Completed======");
    }
}
