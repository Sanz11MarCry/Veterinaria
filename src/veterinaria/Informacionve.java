
package veterinaria;

/**
 *
 * @author AbelSanz
 */
public class Informacionve {

    private String Nombre;
    private String Apellidopat;
    private String Apellidomat;
    private String DNI;
    
public  Informacionve(String Nombre, String Apellidopat, String Apellidomat, String DNI) {
        this.Nombre = Nombre;
        this.Apellidopat = Apellidopat;
        this.Apellidomat = Apellidomat;
        this.DNI = DNI;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellidopat
     */
    public String getApellidopat() {
        return Apellidopat;
    }

    /**
     * @param Apellidopat the Apellidopat to set
     */
    public void setApellidopat(String Apellidopat) {
        this.Apellidopat = Apellidopat;
    }

    /**
     * @return the Apellidomat
     */
    public String getApellidomat() {
        return Apellidomat;
    }

    /**
     * @param Apellidomat the Apellidomat to set
     */
    public void setApellidomat(String Apellidomat) {
        this.Apellidomat = Apellidomat;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the DNI
     */
    

   
}