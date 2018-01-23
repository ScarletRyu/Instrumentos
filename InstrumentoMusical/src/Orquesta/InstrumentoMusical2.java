package Orquesta;

public interface InstrumentoMusical2 {
final static String NOTA_AFINACION = "Mi";

void mostrarInfo(); 
boolean afinado_a(String nota);
String tocar();
}