package empresaFerroviaria.maquinaria;
import empresaFerroviaria.personal.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;

public class Tren {
    // atributos

    Locomotora locomotora;
    ArrayList<Vagón> vagones = new ArrayList<>(5);
    Maquinista maquinista;

    // constructor

    // Debes añadir constructores parametrizados que inicialicen todos los atributos al crear
    //objetos en todas las clases excepto en la clase tren. Los trenes se crean inicialmente
    //sólo con una locomotora.

    public Tren (Locomotora locomotora) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
    }

    // getters y setters

    public Locomotora getLocomotora () {
        return locomotora;
    }

    public void setLocomotora (Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    // Modifica en la clase tren el método getVagones() para que devuelva el número de
    //vagones que componen el tren.

    public int getVagones() {
        return vagones.size();
    }

    public void setVagones(ArrayList<Vagón> vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista () {
        return maquinista;
    }

    public void setMaquinista (Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    // toString

    @Override
    public String toString() {
        return "Tren:\n" +
                "locomotora=\n" + locomotora +
                ", \nvagones=" + vagones +
                ", \nmaquinista=" + maquinista +
                '}';
    }

    // imprimirDatos()

    public void imprimirDatos(){
        System.out.println(toString());
    }

    // VARIABLE PUBLICA PARA CONTADOR TRENES

    public static int contadorTrenes;

    // La clase tren contiene un método añadirVagón():void, que mira los vagones que
    //tiene el tren y si es 5 indicamos que no se puede añadir ningún vagón más; en caso
    //contrario, en el método se crea un vagón con los siguientes datos:

    public void añadirVagón(){

            for (int i = 0; i < 5 ; i++) {

            System.out.println("Creando vagón...");
                Vagón nuevoVagón = new Vagón(0, 0, 0, null);

                // carga máxima y tipo de mercancía se piden por teclado

                Scanner sc = new Scanner(System.in);
                System.out.println("¿Cuál es la carga máxima?");
                nuevoVagón.setCargaMáxima(sc.nextInt());
                System.out.println("¿Qué tipo de mercancía lleva?");
                System.out.println("1. Perecedera\n" + "2. No perecedera\n" + "3. Frágil\n" + "4. Peligrosa\n" + "5. Dimensional");

                int scOpcionTipo = sc.nextInt();
                switch (scOpcionTipo) {
                    case 1 :
                        nuevoVagón.setMercancía(Mercancía.PERECEDERA);
                        break;
                    case 2 :
                        nuevoVagón.setMercancía(Mercancía.NO_PERECEDERA);
                        break;
                    case 3 :
                        nuevoVagón.setMercancía(Mercancía.FRÁGIL);
                        break;
                    case 4 :
                        nuevoVagón.setMercancía(Mercancía.PELIGROSA);
                        break;
                    case 5 :
                        nuevoVagón.setMercancía(Mercancía.DIMENSIONAL);
                }

                // los vagones se crean con una carga actual igual a 0
                nuevoVagón.setCargaActual(0);

                // en cuanto al identificador, a cada vagón que se crea se le asigna un
                //identificador que es: el número de trenes creados hasta el momento, más el
                //número de vagones que tenga el tren actualmente.

                Vagón.contadorVagones++;

                nuevoVagón.setId(contadorTrenes + Vagón.contadorVagones);

                // Por último, este método añade el vagón creado al tren.
                vagones.add(i, nuevoVagón);
            }

        System.out.println("No se puede añadir más vagones al tren.");
    }

    // La clase tren también contiene un método que elimina el último vagon del tren.

    public void eliminarUltimoVagon(){
        this.vagones.remove(getVagones() - 1);
    }

}
