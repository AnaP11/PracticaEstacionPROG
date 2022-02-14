package empresaFerroviaria.personal;

import java.text.DateFormat;
import java.util.Date;

public class JefeEstación {
    // atributos
    private String nombre;
    private String DNI;
    private String fechaNombramiento; // Es String, puesto que tengo problemas con la variable tipo Date


    // constructor

    public JefeEstación(String nombre, String DNI, String fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
    }


    // getters y setters

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNombramiento () {
        return fechaNombramiento;
    }

    public void setFechaNombramiento (String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    // toString

    @Override
    public String toString() {
        return "JefeEstación{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }

    // imprimirDatos

    public void imprimirDatos(){
        System.out.println(toString());
    }


    // VARIABLE PUBLICA PARA CONTADOR JEFES

    public static int contadorJefes;
}
