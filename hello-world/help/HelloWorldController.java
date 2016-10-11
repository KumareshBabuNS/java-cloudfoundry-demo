package io.pcfsolutions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by benwilcock on 11/10/2016.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello!";
    }

}
