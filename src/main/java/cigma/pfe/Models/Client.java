package cigma.pfe.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@ToString
@Table(name ="Clients")

//@DiscriminatorColumn(name="client_type")
//@DiscriminatorValue("client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;


    public Client(String name) {
        this.name = name;
    }

    public Client() {
    }

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }


}
