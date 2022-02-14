package empresaFerroviaria.maquinaria;

class Vagón {

    // atributos

    int id;
    double cargaMáxima;
    double cargaActual;
    Mercancía mercancía;

    // constructor

            // " Entre las clases relativas a la maquinaria sólo será posible construir, desde clases
            //   externas, objetos de tipo Tren y de tipo Locomotora. "

    Vagón(int id, double cargaMáxima, double cargaActual, Mercancía mercancía) {
        this.id = id;
        this.cargaMáxima = cargaMáxima;
        this.cargaActual = cargaActual;
        this.mercancía = mercancía;
    }


    // getters y setters

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public double getCargaMáxima () {
        return cargaMáxima;
    }

    public void setCargaMáxima (double cargaMáxima) {
        this.cargaMáxima = cargaMáxima;
    }

    public double getCargaActual () {
        return cargaActual;
    }

    public void setCargaActual (double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public Mercancía getMercancía () {
        return mercancía;
    }

    public void setMercancía (Mercancía mercancía) {
        this.mercancía = mercancía;
    }

    // toString

    @Override
    public String toString() {
        return "Vagón{" +
                "id=" + id +
                ", cargaMáxima=" + cargaMáxima +
                ", cargaActual=" + cargaActual +
                ", mercancía=" + mercancía +
                '}';
    }


    // imprimirDatos()

    public void imprimirDatos(){
        System.out.println(toString());
    }

    // VARIABLE PUBLICA PARA CONTADOR VAGONES

    public static int contadorVagones;


}
