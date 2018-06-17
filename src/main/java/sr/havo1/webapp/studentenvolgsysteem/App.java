package sr.havo1.webapp.studentenvolgsysteem;

import sr.havo1.webapp.studentenvolgsysteem.dao.DocentenDAO;
import sr.havo1.webapp.studentenvolgsysteem.dao.RechtenDAO;
import sr.havo1.webapp.studentenvolgsysteem.dao.RollenDAO;
import sr.havo1.webapp.studentenvolgsysteem.entity.Docenten;
import sr.havo1.webapp.studentenvolgsysteem.entity.Rechten;
import sr.havo1.webapp.studentenvolgsysteem.entity.Rollen;

/**
 * Created by DENCIO on 6/11/2018.
 */
public class App {

    public static void main(String[] args) {

        /*Rechten r = new Rechten();
        r.setRechtnaam("Toekennen van rollen aan gebruikers");

        RechtenDAO rdao = new RechtenDAO();
        rd.addRecht(r);
*/
        /*RechtenDAO rechtenDAO = new RechtenDAO();

        Rollen rol = new Rollen();
        rol.setRolnaam("Administrator");
        rol.setRecht_id(rechtenDAO.getRecht(1L));

        RollenDAO rollenDAO = new RollenDAO();
        rollenDAO.addRol(rol);*/

        RollenDAO rollenDAO = new RollenDAO();
        Docenten d = new Docenten();
        d.setVoornaam("Dencio");
        d.setAchternaam("Martodikromo");
        d.setEmail("dencii@live.com");
        d.setWachtwoord("1234");
        d.setRol_id(rollenDAO.getRol(1L));

        DocentenDAO dd = new DocentenDAO();
        dd.addDocent(d);

    }
}
