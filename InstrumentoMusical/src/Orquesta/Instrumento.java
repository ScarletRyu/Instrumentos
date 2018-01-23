package Orquesta;
import java.util.ArrayList;
public class Instrumento implements InstrumentoMusical2{
	private String nombre;
	private String tipo;
	private String subtipo;
	private String notaAfinada;
	private ArrayList<String> musicos;
	
	
	public Instrumento(){
		this.musicos = new ArrayList<String>();
	}
	
	public void addMusico(String musico){
		this.musicos.add(musico);
	}
	
	
	//GETTERS & SETTERS
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the subtipo
	 */
	public String getSubtipo() {
		return subtipo;
	}
	/**
	 * @param subtipo the subtipo to set
	 */
	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}
	/**
	 * @return the notaAfinada
	 */
	public String getNotaAfinada() {
		return notaAfinada;
	}
	/**
	 * @param notaAfinada the notaAfinada to set
	 */
	public void setNotaAfinada(String notaAfinada) {
		this.notaAfinada = notaAfinada;
	}
	/**
	 * @return the musicos
	 */
	public ArrayList<String> getMusicos() {
		return musicos;
	}
	/**
	 * @param musicos the musicos to set
	 */
	public void setMusicos(ArrayList<String> musicos) {
		this.musicos = musicos;
	}

	
	
	
	
	
	//METODOS
	
	public void mostrarInfo(){
	System.out.println("----Nombre del Instrumento----" + this.getNombre());
	System.out.println("Tipo" + this.getTipo());
	System.out.println("SubTipo" + this.getSubtipo());
	System.out.println("Nota" + this.getNotaAfinada());
	System.out.println("----MUSICOS TOCANDO------");
	System.out.println("Musicos" +this.getMusicos());
	}
	
	public boolean afinado_a(String nota){
		return this.notaAfinada.equals(nota);
	}
	
	public String tocar(){
		return this.nombre + " esta sonando";
	}
}
