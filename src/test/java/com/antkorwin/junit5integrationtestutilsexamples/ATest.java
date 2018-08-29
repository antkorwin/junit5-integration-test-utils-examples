package com.antkorwin.junit5integrationtestutilsexamples;

import com.antkorwin.junit5integrationtestutils.test.runners.EnableTestsWithEmbeddedWebServer;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 29.08.2018.
 *
 * TODO: replace on javadoc
 *
 * @author Korovin Anatoliy
 */
@EnableTestsWithEmbeddedWebServer
public class ATest {

    @Autowired
    private AFeign aFeign;

    @Test
    void testA() {
        // Arrange
        // Act
        String test = aFeign.test();
        // Assert
        assertThat(test).isEqualTo("A");
    }

    @TestConfiguration
    public static class TestConfig {

        @RestController
        @RequestMapping("test")
        public class A implements AFeign {

            @Override
            public String test() {
                return "A";
            }
        }
    }
}
