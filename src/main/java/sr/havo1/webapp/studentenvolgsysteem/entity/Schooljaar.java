package sr.havo1.webapp.studentenvolgsysteem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DENCIO on 6/11/2018.
 */

@Entity
@Table(name = "schooljaar")
public class Schooljaar implements Serializable{

    private Long schooljaar_id;
    private Year schooljaar;
    private String status;

    private List<Klassen> klas = new ArrayList<Klassen>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schooljaar_id", unique = true)
    public Long getSchooljaar_id() {
        return schooljaar_id;
    }

    public void setSchooljaar_id(Long schooljaar_id) {
        this.schooljaar_id = schooljaar_id;
    }

    @Column(name = "schooljaar", nullable = false)
    public Year getSchooljaar() {
        return schooljaar;
    }

    public void setSchooljaar(Year schooljaar) {
        this.schooljaar = schooljaar;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(mappedBy = "schooljaar_id", fetch = FetchType.LAZY)
    public List<Klassen> getKlas() {
        return klas;
    }

    public void setKlas(List<Klassen> klas) {
        this.klas = klas;
    }
}
