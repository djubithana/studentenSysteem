package sr.havo1.webapp.studentenvolgsysteem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by DENCIO on 6/11/2018.
 */

@Entity
@Table(name = "cijfers")
public class Cijfers implements Serializable{

    private Long cijfer_id;
    private int cijfer;
    private KlassenStudenten klas_student_id;
    private Repetities repetitie_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cijfer_id", unique = true)
    public Long getCijfer_id() {
        return cijfer_id;
    }

    public void setCijfer_id(Long cijfer_id) {
        this.cijfer_id = cijfer_id;
    }

    @Column(name = "cijfer", nullable = false)
    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

    @ManyToOne
    @JoinColumn(name = "klas_student_id")
    public KlassenStudenten getKlas_student_id() {
        return klas_student_id;
    }

    public void setKlas_student_id(KlassenStudenten klas_student_id) {
        this.klas_student_id = klas_student_id;
    }

    @ManyToOne
    @JoinColumn(name = "repetitie_id")
    public Repetities getRepetitie_id() {
        return repetitie_id;
    }

    public void setRepetitie_id(Repetities repetitie_id) {
        this.repetitie_id = repetitie_id;
    }
}
