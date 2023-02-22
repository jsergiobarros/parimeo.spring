package parimeo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import parimeo.springboot.Database;

public interface GreetingDatabase extends JpaRepository<Database,Integer> {

}
