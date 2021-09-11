package l.pkg3.pkg2.macasjardel;


public class Cliente {
    
    private String Nombre;
    private String Apeliido;
    private String Dia;
    private String Mes;
    private String Año;
    private int Edad;

    public Cliente(String Nombre, String Apeliido, String Dia, String Mes, String Año, int Edad) {
        this.Nombre = Nombre;
        this.Apeliido = Apeliido;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
        this.Edad = Edad;
    }

    public Cliente() {
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApeliido() {
        return Apeliido;
    }

    public void setApeliido(String Apeliido) {
        this.Apeliido = Apeliido;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    
    
}
