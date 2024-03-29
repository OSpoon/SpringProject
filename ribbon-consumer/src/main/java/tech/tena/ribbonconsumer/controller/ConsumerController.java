package tech.tena.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;
//    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
//    public String helloController() {
//        return restTemplate.getForEntity("http://WELCOME-SERVICE/hello", String.class).getBody();
//    }

    @Autowired
    private HelloService helloService;
    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloController() {
        return helloService.hello();
    }
}
