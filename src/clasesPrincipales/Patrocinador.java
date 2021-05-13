package clasesPrincipales;
/**
 * <b></b>Nombre: Patrocinador</br>
 * <b></b>Propiedades:</br>
 *  <b></b>Basicas:</br>
 *   nombre:String, consultable y modificable</br>
 *   procedencia: enumerado ComunidadAutonoma, consultable y modificable</br>
 *</br>
 * Derivadas: Ninguna</br>
 *</br>
 * Compartida: Ninguna</br>
 *</br>
 * Metodos principales:</br>
 * 						-nombre:</br>
 *  						public String getNombre() </br>
 *  						public void setNombre(String nombre) </br>
 * 						-procedencia:</br>
 *  						public ComunidadAutonoma getProcedencia()</br>
 *  						public void setProcedencia(ComunidadAutonoma procedencia)</br>
 * 						
 * Metodos anhadidos:</br>
 *</br>
 * Metodos heredados: Ninguno</br>
 *
 */

import enumerados.Tipo;

public class Patrocinador {
	//Atributos
	private String nombre;
	private Tipo procedencia;
	
	//Constructor
	
	public Patrocinador(String nombre,Tipo procedencia) {
		this.nombre=nombre;
		this.procedencia=procedencia;
	}
	//Metodos getter y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Tipo procedencia) {
		this.procedencia = procedencia;
	}
	

}
