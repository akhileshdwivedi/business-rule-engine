package com.rule.engine;

import com.rule.engine.service.BookRuleEngine;
import com.rule.engine.serviceImpl.BookRuleEngineImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookRuleEngineImplTest {
    private BookRuleEngine bookRuleEngine;

    @BeforeEach
    public void steUp() {
        bookRuleEngine = new BookRuleEngineImpl();
    }

    @Test
    public void generatePackingSlip() {
        Assertions.assertThat(bookRuleEngine.generatePackingSlip()).isTrue();
    }

    @Test
    public void generateAgentCommission() {
        Assertions.assertThat(bookRuleEngine.generateAgentCommission()).isTrue();
    }
}
