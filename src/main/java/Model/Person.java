package Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private int weight;
    private int height;
    private int sex;

    //@OneToMany(mappedBy = "result", cascade = CascadeType.DETACH, orphanRemoval = true)
    //private List<Result> results;
}
