package com.inch;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Test;

public class InchTest {

    @Test
    void loggingTest() {
        LogCaptor logCaptor = LogCaptor.forClass(Inch.class);
        String respContent = "Here is a test string for you";
        Inch.logSomething(respContent);
        assert (logCaptor.getInfoLogs().stream().anyMatch(s -> s.contains(respContent + " was logged")));
    }
}
