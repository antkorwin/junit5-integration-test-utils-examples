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
public class BTest {

    @Autowired
    private BFeign bFeign;

    @Test
    void testB() {
        // Arrange
        // Act
        String test = bFeign.test();
        // Assert
        assertThat(test).isEqualTo("B");
    }

    @TestConfiguration
    public static class TestConfig {

        @RestController
        @RequestMapping("test")
        public class B implements BFeign {

            @Override
            public String test() {
                return "B";
            }
        }
    }
}
