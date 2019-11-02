/**
 * 
 */
package com.spring.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author avadheshkumar
 *
 */
@RestController
public class OpenshiftController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to springg boot openshift!!";
    }
}
