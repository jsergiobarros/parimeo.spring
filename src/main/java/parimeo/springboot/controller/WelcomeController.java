package parimeo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import parimeo.springboot.Database;
import parimeo.springboot.MyApp;
import parimeo.springboot.repository.GreetingDatabase;

import java.util.List;


@RestController
@CrossOrigin
public class WelcomeController {
    @Autowired
    private GreetingDatabase spring;

    @GetMapping("/")
    public String hello(){
        return "Hello Spring Boot Controller";
    }
    @GetMapping("/hello")
    public List<Database> welcome(){
        return spring.findAll();
    }
    @PostMapping("/hello")
    public void insert(@RequestBody String message){
        Database data = new Database();
        data.setGreeting(message);
        spring.save(data);
    }
    @DeleteMapping("/hello/{id}")
    public void deleteGreeting(@PathVariable("id") Integer id){
        if(id!=1)
            spring.deleteById(id);
    }
}
