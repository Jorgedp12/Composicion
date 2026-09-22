public class Asiento {

    private String codigo;
    private boolean ocupado;


    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }


    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }


    public void ocupar() {
        if (ocupado) {
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        } else {
            ocupado = true;
            System.out.println("Asiento " + codigo + " ocupado.");
        }
    }

    public void liberar() {
        if (this.ocupado) {
            ocupado = false;
            System.out.println("Asiento " + codigo + " liberado.");
        } else {
            System.out.println("El Asiento no se encuentra ocupado, y no se puede liberar");
        }
    }

    public void mostrarEstado() {
        System.out.println("Asiento " + codigo + ": " + (ocupado ? "ocupado" : "libre"));
    }

}