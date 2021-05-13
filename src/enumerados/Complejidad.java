package enumerados;

/**
 * <b>Nombre</b>: Complejidad</br>
 * <b>Enumerados disponibles</b>: Sencilla, Normal, Compleja</br>
 * <b>Atributos</b>: double valor, consultable</br>
 * 
 * <b>Descripcion</b>: Este enumerado es utilizado para determinar el nivel de complejidad</br>
 * de las acrobacias realizadas por los pilotos.</br>
 * @author ppastor
 *
 */

public enum Complejidad { SENCILLA(1),NORMAL(1.5),COMPLEJA(2);

	private double valor;
	
	Complejidad(double valor){
		this.valor=valor;
	}
	public double getValor() {
		return valor;
	}	
	
}
