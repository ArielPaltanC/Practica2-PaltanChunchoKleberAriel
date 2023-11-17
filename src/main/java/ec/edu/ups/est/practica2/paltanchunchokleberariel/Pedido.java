package ec.edu.ups.est.practica2.paltanchunchokleberariel;

public class Pedido {
    private int nuemroDePedido;
    private String direccion;
    private int numeroTelefonico;
    

    public Pedido() {
    }

    public Pedido(int nuemroDePedido, String direccion, int numeroTelefonico) {
        this.nuemroDePedido = nuemroDePedido;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        
    }

    public int getNuemroDePedido() {
        return nuemroDePedido;
    }

    public void setNuemroDePedido(int nuemroDePedido) {
        this.nuemroDePedido = nuemroDePedido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nuemroDePedido=" + nuemroDePedido + ", direccion=" + direccion
                + ", numeroTelefonico=" + numeroTelefonico + '}';
    }
    
    
    
    
    
}
