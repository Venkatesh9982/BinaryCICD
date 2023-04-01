package com.poc.aws.awspoc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
    public String hello() { return "Hello Binary Semantics"; }
}
