package com.example.dataexplorer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestControllerTest {

        @GetMapping("test")
        public String test() {
            return "test";
        }

    }
