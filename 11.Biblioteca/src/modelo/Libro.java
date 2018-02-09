package modelo;

public class libro {
	private int id;
	private String titulo;
	private String autor;
	
	
	public libro(int id, String titulo, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		
	}
	
	public void mostrarInfo(){
		System.out.println("id: "+ this.id
				+ " titulo: " + this.titulo
				+ " autor: " + this.autor);
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


	
	
}
