package ec.edu.ups.est.practica2.paltanchunchokleberariel;

import java.util.List;

public class Carrito {
    private double precioFinal;   
    //creamos una lista en la cual se guardaran los objetos de producto
    private List<Producto> listaProductos;


    public Carrito() {
    }

    public Carrito(double precioFinal, List<Producto> listaProductos) {
        this.precioFinal = precioFinal;
        this.listaProductos = listaProductos;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "Carrito{" + "precioFinal=" + precioFinal + ", listaProductos=" + listaProductos + '}';
    }
    
    
    
    
}
