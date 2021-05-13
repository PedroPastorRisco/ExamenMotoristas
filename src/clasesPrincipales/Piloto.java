package clasesPrincipales;

/**
 * <b></b>Nombre: Piloto</br>
 * <b></b>Propiedades:</br>
 *  <b></b>Basicas:</br>
 *   nombre:String, consultable y modificable</br>
 *   apellidos:String, consultable y modificable</br>
 *   procedencia: enumerado ComunidadAutonoma, consultable y modificable</br>
 *   puntuacion: double, consultable y modificable</br>
 *   patrocinador: Patrocinador, consultable y modificable;</br>
 *   Acrobacia[] acrobacia= array de acrobacias, consultable y modificable;</br>
 *</br>
 * Derivadas: Ninguna</br>
 *</br>
 * Compartida: Ninguna</br>
 *</br>
 * Metodos principales:</br>
 * 						-nombre:v
 *  						public String getNombre() </br>
 *  						public void setNombre(String nombre) </br>
 *  					-apellidos:</br>
 *  						public String getApellidos()</br>
 *  						public void setApellidos(String apellidos)</br>
 * 						-procedencia:</br>
 *  						public ComunidadAutonoma getProcedencia()</br>
 *  						public void setProcedencia(ComunidadAutonoma procedencia)</br>
 *  					-puntuacion: </br>
 *  						public double getPuntuacion()</br>
 *  						public void setPuntuacion(double puntuacion)</br>
 *  					-patrocinador: </br>
 *  						public Patrocinador getPatrocinador()</br>
 *  						public void setPatrocinador(Patrocinador patrocinador)</br>
 *  					-acrobacias: </br>
 *  						public Acrobacia getAcrobacia(int posicion) </br>
 *  						public void setAcrobacias(int posicion,Acrobacia acrobacia) </br>			
 * Metodos anhadidos:</br>
 * 		-private boolean equalsTo(Piloto piloto)</br>
 * 		-private void permutarPatrocinador(Piloto p)</br>
 *</br>
 * Metodos heredados: Ninguno</br>
 *
 */

import enumerados.Tipo;

public class Piloto {
	
	private String nombre;
	private String apellidos;
	private Tipo procedencia;
	private double puntuacion;
	private Patrocinador patrocinador;
	Acrobacia[] acrobacias=new Acrobacia[6];
	
	
	//Constructor por parametros
	public Piloto(String nombre,String apellidos,Tipo procedencia,Patrocinador patrocinador) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.procedencia=procedencia;
		this.patrocinador=patrocinador;
		
	}
	//Getter y setters de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Tipo getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(Tipo procedencia) {
		this.procedencia = procedencia;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
	
	public Acrobacia getAcrobacia(int posicion) {
		return acrobacias[posicion];
	}

	public void setAcrobacias(int posicion,Acrobacia acrobacia) {
		this.acrobacias[posicion]=acrobacia;
	}
	/**
	 * <b>Cabecera</b>:public boolean equalsTo(Piloto piloto) </br>
	 * <b>Descripcion</b>: este metodo nos devuelve un boolean que será verdadero </br>
	 * si los pilotos son iguales.</br>
	 * <b>Precondiciones</b>: Ninguna</br>
	 * <b>Postcondiciones</b>: Nos devuelve verdadero o falso dependiendo de si es </br>
	 * el mismo piloto o no.</br>
	 * <b>Entrada</b>: Piloto piloto</br>
	 * <b>Salida</b>: boolean mismoPiloto</br>
	 * @param piloto</br>
	 * @return mismoPiloto</br>
	 */

	public boolean equalsTo(Piloto piloto) {
		boolean mismoPiloto=false;
		if(this == piloto) {
			mismoPiloto=true;
		}else {
			if(piloto != null ) {
				if(this.nombre.equals(piloto.nombre) && this.apellidos.equals(piloto.apellidos)) {
					mismoPiloto=true;
				}
				
			}
		}
		return mismoPiloto;
	}
	
	/**
	 * <b>Cabecera</b>: public void permutarPatrocinador(Piloto p) </br>
	 * <b>Descripcion</b>: permutas los patrocinadores de dos pilotos. </br>
	 * Para ello les cambias el nombre y la procedencia.</br>
	 * <b>Precondiciones</b>: Ninguna</br>
	 * <b>Postcondiciones</b>: El metodo permutara los patrocinadores. En caso de que </br>
	 * el piloto que nos den sea nulo, no hara nada.</br>
	 * <b>Entrada</b>: Piloto p</br>
	 * <b>Salida</b>: Ninguna</br>
	 * 
	 * @param p</br>
	 */
	
	public void permutarPatrocinador(Piloto p) {
		String almacenNombre;
		Tipo almacenComunidad;
		if(p!=null) {
			almacenNombre=this.nombre;
			this.patrocinador.setNombre(p.patrocinador.getNombre());
			p.setNombre(almacenNombre);
			
			almacenComunidad=this.procedencia;
			this.patrocinador.setProcedencia(p.patrocinador.getProcedencia());
			p.patrocinador.setProcedencia(almacenComunidad);
		}
	}

	
	//Metodo toString
	@Override
	public String toString() {
		return "-Nombre Completo: "+this.nombre+" "+this.apellidos+"\n"
				+ "-Patrocinador: "+this.patrocinador.getNombre()+"\n"
				+ "-Acrobacias Realizadas -> Puntuacion Total: "+this.puntuacion;	
		}
	
	
	
	
}
