public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[]asientos;

    public Vuelo(){

    }

    public Vuelo(String numero , String origen , String destino){
        this.numero = numero;
        this.origen = origen;
        this.destino =  destino;
    }
    
    public Vuelo (String numero, String origen, String destino, int capacidadMaxima){
        this.numero = numero;
        this.origen = origen;
        this.destino =  destino;
        this.capacidadMaxima = capacidadMaxima;
        
        asientos = new Asiento[capacidadMaxima];
        for(int i = 0; i < capacidadMaxima; i++){
            asientos[i] = new Asiento("A"+(i+1));
        }
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void mostrarInfo(){
        System.out.println("-------------Vuelo "+numero+"--------------");
        System.out.println("Ruta: " + origen + " -> "+ destino);
        System.out.println("Capacidad: "+capacidadMaxima+" asientos");
    }

    public void mostarAsiento(){
        System.out.println("Estado de asientos - Vuelo "+numero+": ");
        for(Asiento a : asientos){
            a.mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento){
        for(Asiento a : asientos){
            if(a.getCodigo().equals(codigoAsiento)){
                a.ocupar();
                return;
            }
        }
        System.out.println("Asiento " + codigoAsiento + "no encontrado en el vuelo "+numero+".");
    }

    public void desembarcar(String codigoAsiento){
    }
}