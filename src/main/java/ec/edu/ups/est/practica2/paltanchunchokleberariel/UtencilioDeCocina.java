
package ec.edu.ups.est.practica2.paltanchunchokleberariel;

public class UtencilioDeCocina extends Producto{
    private int codigo;

    public UtencilioDeCocina() {
    }

    public UtencilioDeCocina(int codigo, String nombre, String marca, int precio) {
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
        return "UtencilioDeCocina{" + "codigo=" + codigo + '}';
    }
    
    
    
    
}
