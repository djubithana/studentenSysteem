package sr.havo1.webapp.studentenvolgsysteem;

import sr.havo1.webapp.studentenvolgsysteem.dao.DocentenDAO;
import sr.havo1.webapp.studentenvolgsysteem.dao.RechtenDAO;
import sr.havo1.webapp.studentenvolgsysteem.dao.RollenDAO;
import sr.havo1.webapp.studentenvolgsysteem.dao.RollenRechtenDAO;
import sr.havo1.webapp.studentenvolgsysteem.entity.Docenten;
import sr.havo1.webapp.studentenvolgsysteem.entity.Rechten;
import sr.havo1.webapp.studentenvolgsysteem.entity.Rollen;
import sr.havo1.webapp.studentenvolgsysteem.entity.RollenRechten;

/**
 * Created by DENCIO on 6/11/2018.
 */
public class App {

    public static void main(String[] args) {

        /*Rechten recht = new Rechten();
        recht.setRechtnaam("Vakken beheren");

        RechtenDAO rechtenDAO = new RechtenDAO();
        rechtenDAO.addRecht(recht);

        Rollen rol = new Rollen();
        rol.setRolnaam("Klassevoogd");

        RollenDAO rollenDAO = new RollenDAO();
        rollenDAO.addRol(rol);*/

        /*RechtenDAO rechtenDAO = new RechtenDAO();
        RollenDAO rollenDAO = new RollenDAO();

        RollenRechten rr = new RollenRechten();
        rr.setRol_id(rollenDAO.getRol(2L));
        rr.setRecht_id(rechtenDAO.getRecht(5L));

        RollenRechtenDAO rrdao = new RollenRechtenDAO();
        rrdao.addRolRecht(rr);*/

        /*Docenten d = new Docenten();
        d.setVoornaam("Patty");
        d.setAchternaam("Martodikromo");
        d.setEmail("patty@live.com");
        d.setTelefoon(8123456);
        d.setMobiel(356293);

        DocentenDAO dd = new DocentenDAO();
        dd.addDocent(d);*/

    }
}
