package com.antkorwin.junit5integrationtestutilsexamples;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 29.08.2018.
 *
 * TODO: replace on javadoc
 *
 * @author Korovin Anatoliy
 */
@FeignClient(value = "b-service", url = "${b-url}", path = "test")
public interface BFeign {

    @GetMapping("/tst")
    String test();
}
