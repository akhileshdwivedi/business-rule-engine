package com.rule.engine;

import com.rule.engine.model.Product;
import com.rule.engine.service.BookRuleEngine;
import com.rule.engine.service.MemberShipRuleEngine;
import com.rule.engine.service.PhysicalProductRuleEngine;
import com.rule.engine.service.VideoRuleEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessRulesEngine {

    Logger logger = LoggerFactory.getLogger(BusinessRulesEngine.class);

    private final BusinessRuleEngineFactory businessRuleEngineFactory;

    public BusinessRulesEngine(BusinessRuleEngineFactory businessRuleEngineFactory) {
        this.businessRuleEngineFactory = businessRuleEngineFactory;
    }

    public boolean processMember(Product product, boolean activate, boolean upgrade){
        MemberShipRuleEngine memberShipRuleEngine =  (MemberShipRuleEngine) businessRuleEngineFactory.getRuleEngine(product);
        if(activate){
            boolean membershipActivated = memberShipRuleEngine.activateMembership();
            logger.info("Member activated: {}", membershipActivated);
            return true;
        }
        if(upgrade){
            boolean membershipUpgraded = memberShipRuleEngine.upgradeMembership();
            boolean emailSent = memberShipRuleEngine.sendEmail();
            logger.info("Member upgraded: {} and email sent: {}", membershipUpgraded, emailSent);
            return true;
        }
        return false;
    }

    public boolean processBook(Product product) {
        BookRuleEngine bookRuleEngine =  (BookRuleEngine) businessRuleEngineFactory.getRuleEngine(product);
        boolean packingSlipGenerated = bookRuleEngine.generatePackingSlip();
        boolean commissionGenerated =  bookRuleEngine.generateAgentCommission();

        return packingSlipGenerated && commissionGenerated;
    }

    public boolean processPhysicalProduct(Product product) {
        PhysicalProductRuleEngine physicalProductRuleEngine =  (PhysicalProductRuleEngine)
                businessRuleEngineFactory.getRuleEngine(product);
        boolean packingSlipGenerated =  physicalProductRuleEngine.generatePackingSlip();
        boolean commissionGenerated = physicalProductRuleEngine.generateAgentCommission();

        return packingSlipGenerated && commissionGenerated;
    }

    public boolean processVideo(Product product) {
        VideoRuleEngine videoRuleEngine =  (VideoRuleEngine)
                businessRuleEngineFactory.getRuleEngine(product);
        return videoRuleEngine.sendVideo();
    }
}
