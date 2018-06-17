package sr.havo1.webapp.studentenvolgsysteem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DENCIO on 6/11/2018.
 */

@Entity
@Table(name = "gebruikers")
public class Gebruikers implements Serializable{

    private Long gebruiker_id;
    private Docenten docent_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gebruiker_id", unique = true)
    public Long getGebruiker_id() {
        return gebruiker_id;
    }

    public void setGebruiker_id(Long gebruiker_id) {
        this.gebruiker_id = gebruiker_id;
    }

    @ManyToOne
    @JoinColumn(name = "docent_id")
    public Docenten getDocent_id() {
        return docent_id;
    }

    public void setDocent_id(Docenten docent_id) {
        this.docent_id = docent_id;
    }
}
