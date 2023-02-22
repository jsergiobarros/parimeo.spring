package parimeo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import parimeo.springboot.controller.WelcomeController;
import parimeo.springboot.repository.GreetingDatabase;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private HelloSpringBoot Hello;
    @Autowired
    private WelcomeController welcome;
    @Autowired
    public GreetingDatabase getSpring() {
        return spring;
    }

    @Autowired
    private GreetingDatabase spring;
    @Override
    public void run(String... args) throws Exception{
            Hello.hello();
   /*         Database data = new Database();
            data.setGreeting("Hello Database World.");
            spring.save(data);*/
            //System.out.println(spring.findAll());
            for (Database u: spring.findAll())
                System.out.println(u.getGreeting());
    }
}
