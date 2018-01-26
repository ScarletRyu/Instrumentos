package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {
	//OPCIONES DEL MENU
	public final static int CREAR_USUARIO = 1;
	public final static int VER_USUARIO = 2;
	public final static int MODIFICAR_USUARIO = 3;
	public final static int ELIMINAR_USUARIO = 4;
	
	public final static int SALIR = 0;
	
	
	public static void main(String[] args) {
		
		try {
			//se carga el diver
			Class.forName("com.mysql.jdbc.Driver");
			//crear la connexion con la BBDD biblioteca
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
			
			//statement para ejecutar querys
			Statement st = con.createStatement();
			
			//ejecutar query
			ResultSet rs = st.executeQuery("select * from usuarios");
			
			//imprimir en pantalla el resultado de la consulta
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " "
						+ rs.getString("nombre")
						+ " " + rs.getString("apellido") + " "
						+ rs.getInt("edad"));
			}

			//ejecutar un insert
			//st.execute("INSERT INTO usuarios(nombre, apellido, edad) VALUES ('mauricio', 'diaz', 19)");

			//pedir datos por pantalla
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce un nombre");
			String nombre = scan.nextLine();
			System.out.println("Introduce un apellido");
			String apellido = scan.nextLine();
			System.out.println("Introduce una edad");
			int edad = Integer.parseInt(scan.nextLine());
			
			
			//Introducir usuario mediante PREPAREDSTATEMENT
		/*	PreparedStatement pst = con.prepareStatement("INSERT INTO usuarios (nombre,apellido,edad) values(?,?,?");
			pst.setString(1, nombre);
			pst.setString(2, apellido);
			pst.setInt(3, edad);
			
			pst.execute();
			
			*/
			
		//CREAR MENU CON 4 OPCIONES, (CREATE,READ,UPDATE Y DELETE)
			int opcion;
			do {
				System.out.println("------- MENÚ PRINCIPAL -------");
				System.out.println("1. Crear usuario");
				System.out.println("2. Ver usuario");
				System.out.println("3. Modificar usuario");
				System.out.println("4. Eliminar usuario");
				
				System.out.println("0. Salir del menú");
				
				opcion = Integer.parseInt(scan.nextLine());
				switch (opcion) {

				case CREAR_USUARIO: // CREAR USUARIO
					System.out.println("Mete los siguientes datos requeridos.");
					System.out.print("Nombre:");
					String nombre_user = scan.nextLine();
					System.out.print("Apellido:");
					String apellido_user = scan.nextLine();
					System.out.print("Edad:");
					int edad_user = Integer.parseInt(scan.nextLine());
					

					user = new user(nombre,apellido,edad);
					sm.insert(user);
					
					break;
			}
			}while (opcion != 0);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
