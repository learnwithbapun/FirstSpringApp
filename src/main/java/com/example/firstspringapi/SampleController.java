package com.example.firstspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class SampleController {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello Bapun";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Good Bye";
    }

    @GetMapping("/hello/{name}")
    public  String SayHelloToUser(@PathVariable("name") String name){
        return "Hello "+name;
    }
}
