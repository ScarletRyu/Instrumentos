package vista;

import java.util.Scanner;

import modelo.Libro;
import modelo.LibroModelo;
import modelo.Prestamo;
import modelo.Usuario;
import modelo.UsuarioModelo;


public class PrestamoVista{
 static final int TOMAR_PRESTADO = 1;
 static final int ENTREGAR = 2;
 static final int SALIR = 3;
 
 
 
 public void menuPrestamo(){
	 int opcion;
	 Scanner scan = new Scanner(System.in);
	 do{
		 System.out.println("--PRESTAMOS--");
		 System.out.println(TOMAR_PRESTADO + "tomar prestado un libro");
		 System.out.println(ENTREGAR + "entregar un libro");
		 opcion = Integer.parseInt(scan.nextLine());
		 
		 
		 switch (opcion) {
		 case TOMAR_PRESTADO:
			 realizarPrestamo(scan); //introducimos el parametro scan para poder pasarlo al metodo que hemos creado abajo
			 break;
		 case ENTREGAR:
			 //pedir el dni
			 //pedir el titulo
			 //conseguir el libro
			 //conseguir el prestamo de la bbd
			 //cambiar el objeto prestamo a entregado
			 //hacer el update en la bbd
			 break;
			 default:
				 break;
				 
		 }
	 }while(opcion != SALIR);
 }



private void realizarPrestamo(Scanner scan){
	System.out.println("Introduce el titulo del libro");
	String titulo = scan.nextLine();
	LibroModelo libroModelo = new LibroModelo("biblioteca");
	Libro libro = libroModelo.select(titulo);
	
	if(libro != null){//el libro existe
		System.out.println("Introduce el DNI");
		String dni = scan.nextLine();
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		Usuario usuario = UsuarioModelo.select(dni);
		
		//crear el objeto prestamo
		Prestamo prestamo = new Prestamo();
		prestamo.setId_libro(libro.getId());
		
		
		//crear el objeto modeloPrestamo
		
		//insertar prestamo utilizando modeloPrestamo
		
		
		
		
		
	}else{//el libro no existe
		
	}
	
	
	
}
}
