package empresaFerroviaria.maquinaria;
import empresaFerroviaria.personal.Mecánico;

public class Locomotora {

    // atributos

    String matrícula;
    int potencia;
    int añoFabricación;
    Mecánico mecánico;

    // constructor

    public Locomotora (String matrícula, int potencia, int añoFabricación, Mecánico mecánico) {
        this.matrícula = matrícula;
        this.potencia = potencia;
        this.añoFabricación = añoFabricación;
        this.mecánico = mecánico;
    }

    // getters y setters

    public String getMatrícula () {
        return matrícula;
    }

    public void setMatrícula (String matrícula) {
        this.matrícula = matrícula;
    }

    public int getPotencia () {
        return potencia;
    }

    public void setPotencia (int potencia) {
        this.potencia = potencia;
    }

    public int getAñoFabricación () {
        return añoFabricación;
    }

    public void setAñoFabricación (int añoFabricación) {
        this.añoFabricación = añoFabricación;
    }

    public Mecánico getMecánico () {
        return mecánico;
    }

    public void setMecánico (Mecánico mecánico) {
        this.mecánico = mecánico;
    }

    // toString

    @Override
    public String toString() {
        return "Locomotora{" +
                "matrícula='" + matrícula + '\'' +
                ", potencia=" + potencia +
                ", añoFabricación=" + añoFabricación +
                ", mecánico=" + mecánico +
                '}';
    }


    // imprimirDatos

    public void imprimirDatos(){
        System.out.println(toString());
    }


    // VARIABLE PUBLICA PARA CONTADOR LOCOMOTORAS

    public static int contadorLocomotoras = 0;
}
