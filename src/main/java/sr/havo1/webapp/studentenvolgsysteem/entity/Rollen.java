package sr.havo1.webapp.studentenvolgsysteem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DENCIO on 6/11/2018.
 */

@Entity
@Table(name = "rollen")
public class Rollen implements Serializable{

    private Long rol_id;
    private String rolnaam;
    private Rechten recht_id;

    private List<Docenten> docent = new ArrayList<Docenten>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id", unique = true)
    public Long getRol_id() {
        return rol_id;
    }

    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }

    @Column(name = "rolnaam", nullable = false)
    public String getRolnaam() {
        return rolnaam;
    }

    public void setRolnaam(String rolnaam) {
        this.rolnaam = rolnaam;
    }

    @ManyToOne
    @JoinColumn(name = "recht_id")
    public Rechten getRecht_id() {
        return recht_id;
    }

    public void setRecht_id(Rechten recht_id) {
        this.recht_id = recht_id;
    }

    @OneToMany(mappedBy = "rol_id", fetch = FetchType.LAZY)
    public List<Docenten> getDocent() {
        return docent;
    }

    public void setDocent(List<Docenten> docent) {
        this.docent = docent;
    }
}
