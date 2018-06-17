package sr.havo1.webapp.studentenvolgsysteem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DENCIO on 6/11/2018.
 */

@Entity
@Table(name = "docenten")
public class Docenten implements Serializable{

    private Long docent_id;
    private String voornaam;
    private String achternaam;
    private String email;
    private String wachtwoord;
    private Rollen rol_id;

    private List<Gebruikers> gebruiker = new ArrayList<Gebruikers>();
    private List<DocentenVakken> docentVak = new ArrayList<DocentenVakken>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docent_id", unique = true)
    public Long getDocent_id() {
        return docent_id;
    }

    public void setDocent_id(Long docent_id) {
        this.docent_id = docent_id;
    }

    @Column(name = "voornaam", nullable = false)
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    @Column(name = "achternaam", nullable = false)
    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "wachtwoord", nullable = false)
    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    @ManyToOne
    @JoinColumn(name = "rol_id")
    public Rollen getRol_id() {
        return rol_id;
    }

    public void setRol_id(Rollen rol_id) {
        this.rol_id = rol_id;
    }

    @OneToMany(mappedBy = "docent_id", fetch = FetchType.LAZY)
    public List<Gebruikers> getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(List<Gebruikers> gebruiker) {
        this.gebruiker = gebruiker;
    }

    @OneToMany(mappedBy = "docent_id", fetch = FetchType.LAZY)
    public List<DocentenVakken> getDocentVak() {
        return docentVak;
    }

    public void setDocentVak(List<DocentenVakken> docentVak) {
        this.docentVak = docentVak;
    }
}
