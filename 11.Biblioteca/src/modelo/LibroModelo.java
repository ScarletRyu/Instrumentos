package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Clase LibroModelo que se extiende a la clase Conector
public class LibroModelo extends Conector{

	public LibroModelo(String dbIzena) {
		super(dbIzena);
		
	}

	//Arraylist donde devuelve todos los datos de libros
	public ArrayList<libro> selectAll(){
		ArrayList<libro> libros = new ArrayList<libro>();
		
		try{
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros");
			while(rs.next()){
				libros.add(new libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return libros;
		
	}
	
	//Select para que devuelva un libro con cierta ID
	public libro select(int id){
		PreparedStatement pst;
		try {
			pst = this.conexion.prepareStatement("select * from libros where id =?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			rs.next();
			return new libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"));
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	//Select de titulo
	public ArrayList<libro> select(String titulo){
		ArrayList<libro> libros = new ArrayList<libro>(); 
		try{
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros where titulo ='" +titulo+ "'");
			while(rs.next()){
				libros.add(new libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor")));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		
		return libros;
		
	}
	
	
//INSERT DE LIBROS
	public void insert(libro libro){
		try {
			PreparedStatement ps = this.conexion.prepareStatement("insert into libros (titulo, autor) values(?,?)");
			
			ps.setString(1, libro.getTitulo()); 
			ps.setString(2, libro.getAutor()); 
			
		
			ps.execute();
	
}catch (SQLException e) {
	e.printStackTrace();
}
	}
	
//UPDATE DE LIBROS
	public int update(libro libro){
		PreparedStatement ps;
		try {
			ps = this.conexion.prepareStatement("update libros set titulo=?, autor=? where id=?");
			//set
			ps.setString(1, libro.getTitulo());
			ps.setString(2, libro.getAutor());
			
			//where
			ps.setInt(3, libro.getId());
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
//DELETE DE LIBROS
	public void delete(int id_libro){
		try {
			Statement st = this.conexion.createStatement();
			st.execute("delete from libros where id=" + id_libro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
