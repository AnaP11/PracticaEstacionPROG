package empresaFerroviaria.personal;

public class Mecánico {
    // atributos
    private String nombre;
    private long teléfono;
    private Especialidad especialidad;

    // constructor

    public Mecánico(String nombre, long teléfono, Especialidad especialidad) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.especialidad = especialidad;
    }



    // getters y setters

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public long getTeléfono () {
        return teléfono;
    }

    public void setTeléfono (long teléfono) {
        this.teléfono = teléfono;
    }

    public Especialidad getEspecialidad () {
        return especialidad;
    }

    public void setEspecialidad (Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    // toString

    @Override
    public String toString() {
        return "Mecánico{" +
                "nombre='" + nombre + '\'' +
                ", teléfono=" + teléfono +
                ", especialidad=" + especialidad +
                '}';
    }

    // imprimirDatos()

    public void imprimirDatos(){
        System.out.println(toString());
    }


    // VARIABLE PUBLICA PARA CONTADOR MECÁNICOS

    public static int contadorMecánicos;
}
