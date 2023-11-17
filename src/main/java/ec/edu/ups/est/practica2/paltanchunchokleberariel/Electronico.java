
package ec.edu.ups.est.practica2.paltanchunchokleberariel;
//agregamos extends Producto lo cual nos indica que es una clase hija de la calse Producto
public class Electronico extends Producto{
    private int codigo;

    public Electronico() {
    }
//las clases hijas van a tener los mismos atributos y metodos que la clase padre 
//esto tambien se aplica a las otras 2 clases hijas que pertenecen a la misma clase padre
    public Electronico(int codigo, String nombre, String marca, int precio) {
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
        return "Electronico{" + "codigo=" + codigo + '}';
    }
    
    

    
    
    
    
}
