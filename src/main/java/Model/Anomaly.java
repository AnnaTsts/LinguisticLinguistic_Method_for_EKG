package Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "anomaly")
public class Anomaly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "anomaly_string")
    private String anomalyString;

    public Anomaly(String anomalyString) {
        this.anomalyString = anomalyString;
    }
}

