package equipo;

public class Administrador {
    String idAdministrador;
    String nombreAdministrador;

    public Administrador(String idAdministrador, String nombreAdministrador) {
        this.idAdministrador= idAdministrador;
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }
    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    public String getNombre() {
        return nombreAdministrador;
    }
    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }
   
}
