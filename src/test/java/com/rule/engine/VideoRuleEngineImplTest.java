package com.rule.engine;

import com.rule.engine.service.PhysicalProductRuleEngine;
import com.rule.engine.service.VideoRuleEngine;
import com.rule.engine.serviceImpl.PhysicalProductRuleEngineImpl;
import com.rule.engine.serviceImpl.VideoRuleEngineImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoRuleEngineImplTest {
    private VideoRuleEngine videoRuleEngine;

    @BeforeEach
    public void steUp(){
        videoRuleEngine = new VideoRuleEngineImpl();
    }

    @Test
    public void generatePackingSlip(){
        Assertions.assertThat(videoRuleEngine.sendVideo()).isTrue();
    }

}
