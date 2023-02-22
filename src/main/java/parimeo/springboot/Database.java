package parimeo.springboot;


import jakarta.persistence.*;


@Entity
@Table(name = "greeting")
public class Database {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "greeting_id")
    private Integer id;
    @Column(length = 50,nullable = false)
    private String greeting;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", greeting:" + greeting + '\'' +
                '}';
    }
}
