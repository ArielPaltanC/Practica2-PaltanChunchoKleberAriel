package ec.edu.ups.est.practica2.paltanchunchokleberariel;
//importamos las clases ArrayList, List y Scanner, las cuales usaremos para
//ordenar los objetos en listas y poder ingresar datos por la consola
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica2PaltanChunchoKleberAriel {

    public static void main(String[] args) {
        //Creamos la variable escanner como una variable
        Scanner sc = new Scanner(System.in);
        //Creamos una lista para guardar los productos que luego usaremos 
        List<Producto> listaProducto= new ArrayList<Producto>();
        //Creamos productos y los colocamos en la lista anteriormente creada
        Electronico laptop = new Electronico();
        laptop.setNombre("laptop");
        laptop.setMarca("dell");
        laptop.setPrecio(450);
        laptop.setCodigo(111);
        
        UtencilioDeCocina cuchillo = new UtencilioDeCocina();
        cuchillo.setNombre("cuchillo");
        cuchillo.setMarca("Umco");
        cuchillo.setPrecio(8);
        cuchillo.setCodigo(123);
        
        Ropa camiseta = new Ropa();
        camiseta.setNombre("camiseta");
        camiseta.setMarca("Nike");
        camiseta.setPrecio(30);
        camiseta.setCodigo(222);
        
        listaProducto.add(laptop);
        listaProducto.add(cuchillo);
        listaProducto.add(camiseta);
        //Pedimos al usuario que registre sus datos por medio de scanner
        System.out.println("Ingrese su usuario: ");
        System.out.println("nombre:");
        String scannerNombre = sc.next();
        System.out.println("apellido: ");
        String scannerApellido = sc.next();
        System.out.println("contraseña: ");
        int scannerContraseña = sc.nextInt();
        System.out.println("email: ");
        String scannerEmmail = sc.next();
        
        Usuario usuario = new Usuario();
        usuario.setNombre(scannerNombre);
        usuario.setApellido(scannerApellido);
        usuario.setContraseña(scannerContraseña);
        usuario.setEmail(scannerEmmail);
        /*mostramos la lista de los productos, el usuario podra
        elegir cuales productos añadira a su carrito y tambien podra realizar el pedido
        de los productos con su respectiva informacion personal y costo de los productos
        */
        System.out.println("Los productos a disposicion son: " + listaProducto);
        
        System.out.println("cuales productos desea agregar a su carrito? ");
        int numero=0;
        Carrito carro1 = new Carrito();
        while(numero!=4){
             System.out.println("1. laptop");
             System.out.println("2. cuchillo");
             System.out.println("3. camiseta");
             System.out.println("4. continuar");
             numero = sc.nextInt();
            if (numero == 1){
                carro1.setListaProductos;
            }
            else if (numero == 2){
                carro1.setListaProductos();
            }
             else if (numero == 3){
                carro1.setListaProductos();
            }
            else if(numero ==4){
                
            }
        }
                
        
        
        
        
        
        
        
    }
}
