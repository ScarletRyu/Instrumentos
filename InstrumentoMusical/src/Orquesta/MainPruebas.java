package Orquesta;

public class MainPruebas {

	public static void main(String[] args) {
		Instrumento trompeta = new Instrumento();
		trompeta.setNombre("trompeta");
		trompeta.setTipo("Aire");
		trompeta.setSubtipo("Metal");
		trompeta.setNotaAfinada("Sol");
		trompeta.addMusico("jon");
		
		trompeta.mostrarInfo();
		Orquesta orquesta =  new Orquesta("jojo", 50, 4000, Instrumento);
	}
}
