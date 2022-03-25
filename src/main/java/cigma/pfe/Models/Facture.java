package cigma.pfe.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date ;

@Setter
@Getter
@Entity

public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Date date;

    @Column
    private Double amount;


    public Facture(java.util.Date date, int i, int i1)
    {}

    public Facture(Double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public Facture(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }


    public Facture(java.util.Date date, double v) {
    }
}
