
package ec.edu.ups.est.practica2.paltanchunchokleberariel;

public class Ropa extends Producto{
    private int codigo;

    public Ropa() {
    }

    public Ropa(int codigo, String nombre, String marca, int precio) {
        super(nombre, marca, precio);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Ropa{" + "codigo=" + codigo + '}';
    }
    
    
    
}
