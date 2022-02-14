package empresaFerroviaria;

import empresaFerroviaria.maquinaria.Locomotora;
import empresaFerroviaria.maquinaria.Tren;
import empresaFerroviaria.personal.Especialidad;
import empresaFerroviaria.personal.JefeEstación;
import empresaFerroviaria.personal.Maquinista;
import empresaFerroviaria.personal.Mecánico;


public class Main {
    public static void main(String[] args) {

        // Emojis, para visualizar mejor los cambios

        String emojiLoc = "\uD83D\uDE82";
        String emojiTren = "\uD83D\uDE85";
        String emojiMec = "\uD83D\uDD27";
        String emojiVagon = "\uD83D\uDE8E";
        String emojiJefe = "\uD83D\uDC6E";

        // Simulamos una estación: creamos objetos de diversos tipos:

        // dos maquinistas

        Maquinista maquinista1 = new Maquinista("Pepe", "11111111P", 42000, 1);
        Maquinista.contadorMaquinistas++;

        Maquinista maquinista2 = new Maquinista("Marta", "22222222M", 42000, 1);
        Maquinista.contadorMaquinistas++;

        // imprimimos los datos de los dos maquinistas

        System.out.println("Datos del maquinista " + maquinista1.getNombre() + " :");
        maquinista1.imprimirDatos();

        System.out.println("\nDatos del maquinista " + maquinista2.getNombre() + " :");
        maquinista2.imprimirDatos();

        // un mecánico de cada especialidad

        Mecánico mecánico1 = new Mecánico("F. Frenador", 389177612, Especialidad.FRENOS);
        Mecánico.contadorMecánicos++;

        Mecánico mecánico2 = new Mecánico("H. Hidráulico", 389177613, Especialidad.HIDRÁULICA);
        Mecánico.contadorMecánicos++;

        Mecánico mecánico3 = new Mecánico("E. Electricista", 12345767, Especialidad.ELECTRICIDAD);
        Mecánico.contadorMecánicos++;

        Mecánico mecánico4 = new Mecánico("M. Motorista", 1451254234213L, Especialidad.MOTOR);
        Mecánico.contadorMecánicos++;

        // imprimimos los datos de cada mecánico

        System.out.println("\nDatos del mecánico " + mecánico1.getNombre() + " : " + emojiMec);
        mecánico1.imprimirDatos();

        System.out.println("\nDatos del mecánico " + mecánico2.getNombre() + " : " + emojiMec);
        mecánico2.imprimirDatos();

        System.out.println("\nDatos del mecánico " + mecánico3.getNombre() + " : " + emojiMec);
        mecánico3.imprimirDatos();

        System.out.println("\nDatos del mecánico " + mecánico4.getNombre() + " : " + emojiMec);
        mecánico4.imprimirDatos();

        // Un jefe de estación

        JefeEstación jefazo = new JefeEstación("El Boss", "22222222D", "2019-12-01");
        JefeEstación.contadorJefes++;

        // Imprimimos los datos del jefe de estación

        System.out.println("\nDatos del jefe de estación : " + emojiJefe);
        jefazo.imprimirDatos();

        // Una locomotora

        Locomotora locmot = new Locomotora("M3085", 350, 2020, mecánico1);
        Locomotora.contadorLocomotoras++;

        // imprimimos los datos de la locomotora

        System.out.println("\nDatos de locomotora : " + emojiLoc);
        locmot.imprimirDatos();

        // Creamos un tren con la locomotora que acabamos de crear

        Tren miTren = new Tren(locmot);
        Tren.contadorTrenes++;

        System.out.println("\nDatos del tren : " + emojiTren);
        System.out.println(emojiLoc);
        miTren.imprimirDatos();

        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");

         miTren.añadirVagón();

        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n*****     Le asignamos un maquinista *****");
        miTren.setMaquinista(maquinista1);

        // Mostramos el número de vagones del tren

        System.out.println("Número de vagones: " + miTren.getVagones());

        // Mostramos los datos del tren creado
        System.out.println("\nDatos del tren : " + emojiTren);
        System.out.println(emojiLoc + "-" + emojiVagon + "-" + emojiVagon + "-" + emojiVagon + "-" + emojiVagon + "-" + emojiVagon);

        miTren.imprimirDatos();

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");

        miTren.eliminarUltimoVagon();

        // mostramos el número de vagones del tren
        System.out.println("Número de vagones: " + miTren.getVagones());

        // Mostramos los datos del tren creado

        System.out.println("\nDatos del tren : " + emojiTren);

        System.out.println(emojiLoc + "-" + emojiVagon + "-" + emojiVagon + "-" + emojiVagon + "-" + emojiVagon);
        miTren.imprimirDatos();

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");
        System.out.println(JefeEstación.contadorJefes + " Jefe de Estación");
        System.out.println(Maquinista.contadorMaquinistas + " maquinistas");
        System.out.println(Mecánico.contadorMecánicos + " mecánicos");
        System.out.println(Locomotora.contadorLocomotoras + " locomotoras");
        System.out.println(Tren.contadorTrenes + " trenes");


    }
}
