package ec.edu.ups.est.practica2.paltanchunchokleberariel;

public class Usuario {
    private String nombre;
    private String apellido;
    private int contraseña;
    private String email;
    //instanciamos un objeto de la clase carrito en la clase usuario para usar la agregacion
    private Carrito carro;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int contraseña, String email, Carrito carro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.email = email;
        this.carro = carro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Carrito getCarro() {
        return carro;
    }

    public void setCarro(Carrito carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrase\u00f1a=" 
               + contraseña + ", email=" + email + ", carro=" + carro + '}';
        
    }
    
    
    
   
    
    
    
    
    
}
