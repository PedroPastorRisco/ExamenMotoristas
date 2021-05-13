package clasesPrincipales;
/**
 * <b></b>Nombre: Acrobacia</br>
 * <b></b>Propiedades:</br>
 *  <b></b>Basicas:</br>
 *   nivel: enumerado Complejidad, consultable y modificable</br>
 *   votacion:int, consultable y modificable</br>
 *   legal: boolean, consultable y modificable</br>
 *</br>
 * Derivadas: Ninguna</br>
 *</br>
 * Compartida: Ninguna</br>
 *</br>
 * Metodos principales:</br>
 * 						-nivel:</br>
 *  						public Complejidad getNivel()</br>
 *  						public void setNivel(Complejidad nivel)</br>
 * 						-votacion:</br>
 *  						public int getVotacion()</br>
 *  						public void setVotacion(int votacion) </br>
 * 						-legal:</br>
 * 							 public boolean isLegal() </br>
 * 							 public void setLegal(boolean legal)</br>
 * Metodos anhadidos:</br>
 *</br>
 * Metodos heredados: Ninguno</br>
 *
 */

import enumerados.Complejidad;

public class Acrobacia {
	
	private Complejidad nivel;
	private int votacion;
	private boolean legal;
	
	//Constructor con parametros
	
	public Acrobacia(Complejidad nivel,int votacion,boolean legal) {
		this.nivel=nivel;
		this.votacion=votacion;
		this.legal=legal;
	}

	public Complejidad getNivel() {
		return nivel;
	}

	public void setNivel(Complejidad nivel) {
		this.nivel = nivel;
	}

	public int getVotacion() {
		return votacion;
	}

	public void setVotacion(int votacion) {
		this.votacion = votacion;
	}

	public boolean isLegal() {
		return legal;
	}

	public void setLegal(boolean legal) {
		this.legal = legal;
	}
	
	/**
	 * <b>Cabecera</b>: public String toString()
	 *<b>precondiciones</b>: ninguna
	 *<b>postcondociones</b>: nos devuelve una string con los atributos del objeto Acrobacia
	 *<b>Entrada</b>: ninguna
	 *<b>Salida</b>: String  
	 */

	@Override
	public String toString() {
		String esLegal="no es legal";
		if(this.legal) {
			esLegal="es legal";
		}
		return "Nivel de Complejidad: "+this.nivel+", "+esLegal+", votacion: "+this.votacion;
	}
	

}
