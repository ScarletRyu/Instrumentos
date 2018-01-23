package Orquesta;

import java.util.ArrayList;

public class Orquesta {
private String Nombre;
private int Miembros;
private double Presupuesto;
ArrayList<Instrumento> Instrumentos;



public Orquesta(String nombre, int miembros, double Presupuesto, ArrayList<Instrumento> instrumentos) {
	super();
	this.Nombre = nombre;
	this.Miembros = miembros;
	this.Presupuesto = Presupuesto;
	this.Instrumentos = instrumentos;
}

public Orquesta (){
	this.Instrumentos = new ArrayList<Instrumento>();
	
}

public void addInstrumento(Instrumento instrumento){
	this.Instrumentos.add(instrumento);
}


public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
	Instrumentos = instrumentos;
}


//GETTERS & SETTERS
/**
 * @return the nombre
 */
public String getNombre() {
	return Nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	Nombre = nombre;
}

/**
 * @return the miembros
 */
public int getMiembros() {
	return Miembros;
}

/**
 * @param miembros the miembros to set
 */
public void setMiembros(int miembros) {
	Miembros = miembros;
}

/**
 * @return the presupuesto
 */
public double getPresupuesto() {
	return Presupuesto;
}

/**
 * @param presupuesto the presupuesto to set
 */
public void setPresupuesto(double presupuesto) {
	Presupuesto = presupuesto;
}

/**
 * @return the instrumentos
 */
public ArrayList<Instrumento> getInstrumentos() {
	return Instrumentos;
}

/**
 * @param instrumentos the instrumentos to set
 */
}
