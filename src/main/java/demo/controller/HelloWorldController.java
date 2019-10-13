package demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String index() {
        System.out.println("processing request");
        return "Hello world!\n";
    }
    
}