package gestion;

import clasesPrincipales.Acrobacia;
import clasesPrincipales.Piloto;
import enumerados.Complejidad;


public class Gestora {
	/**
	 * <b>Precondiciones</b>: array pilotos y objeto p de la clase Piloto 
	 * Postcondiciones:nos devuelve el array con el piloto ya introducido </br></br>
	 * 
	 * @param paginas</br>
	 * @param pagina</br>
	 * 
	 * @return paginas</br>
	 */

	/*
	 * Aclaracion: En el caso en el que pilotos este lleno, se tendra que aumentar
	 * su tamanho, entonces este tomara otra referencia, por eso el metodo devuelve
	 * Pagina[]
	 */
	public static Piloto[] insertarPiloto(Piloto[] pilotos, Piloto piloto) {
		boolean auxiliar = false;
		int i;
		for (i = 0; i < pilotos.length && !auxiliar; i++) {
			if (pilotos[i] == null) {
				pilotos[i] = piloto;
				auxiliar = true;
			}
		}
		if (!auxiliar) {// si la pagina no se ha metido en la lista
			pilotos = Utilidad.aumentarArray(pilotos); // Se creara otra referencia del array
			pilotos[i] = piloto;
		}
		return pilotos;
	}
	
	/**
	 * Cabecera: public static Acrobacia crearAcrobacia()
	 * precondiciones: Ninguna 
	 * Postcondiciones: generamos una acrobacia con unos valores aleatorios
	 * Entrada: Ninguna
	 * Salida: Acrobacia acrobacia
	 * @return
	 */
	
	public static Acrobacia crearAcrobacia() {
		Acrobacia acrobacia;
		Complejidad nivel=null;
		boolean legalidad=true;
		
		int valorNivel = (int) Math.floor(Math.random()*(3)+1);
		int valorVotacion= (int) Math.floor(Math.random()*(6)+0);
		int valorLegalidad= (int) Math.floor(Math.random()*(100)+1);
		
		switch(valorNivel) {
			case 1:
				nivel=Complejidad.SENCILLA;
				break;
			case 2:
				nivel=Complejidad.NORMAL;
				break;
			case 3: 
				nivel=Complejidad.COMPLEJA;
				break;
		}
		if(valorLegalidad>=85) {
			legalidad=false;
		}
		
		acrobacia= new Acrobacia(nivel, valorVotacion, legalidad);
		return acrobacia;
	}
	
	/**
	 * <b>Cabecera</b>: public static double calcularPuntuacion(Piloto piloto)
	 * precondiciones: piloto no sea nulo
	 * postcondiciones: nos devuelve la puntuacion de las acrobacias del piloto 
	 * entrada: Piloto piloto
	 * salida: double puntuacion
	 * @param piloto
	 * @return
	 */
	public static double calcularPuntuacion(Piloto piloto) {
		double puntuacion,puntuacionTotal=0,valorMaximo=6,valorMinimo=6;
		int contadorAcrobacias=0;
		for(int i=0;i<6;i++) {
			if(piloto.getAcrobacia(i).isLegal()) {
				if(valorMaximo==6) {
					valorMaximo=piloto.getAcrobacia(i).getVotacion()*piloto.getAcrobacia(i).getNivel().getValor();
					valorMinimo=piloto.getAcrobacia(i).getVotacion()*piloto.getAcrobacia(i).getNivel().getValor();
					puntuacionTotal=piloto.getAcrobacia(i).getVotacion()*piloto.getAcrobacia(i).getNivel().getValor();
				}else {
					puntuacion=piloto.getAcrobacia(i).getVotacion()*piloto.getAcrobacia(i).getNivel().getValor();
					if(puntuacion>valorMaximo) {
						valorMaximo=puntuacion;
					}else if(puntuacion<valorMinimo) {
						valorMinimo=puntuacion;
					}
					puntuacionTotal+=puntuacion;
				}
				contadorAcrobacias++;
			}
		}
		contadorAcrobacias=contadorAcrobacias-2;
		puntuacionTotal=puntuacionTotal-valorMaximo-valorMinimo;
		puntuacionTotal=puntuacionTotal/contadorAcrobacias;
		return puntuacionTotal;
	}
	/**
	 * cabecera: gestion.Gestora.crearAcrobacias(Piloto[])
	 * precondiciones:ninguna
	 * postcondiciones: nos devuelve la array de pilotos creadas
	 * entrada: Piloto[] pilotos
	 * salida:ninguna
	 * @param pilotos
	 */
	public static void crearAcrobacias(Piloto[] pilotos) {
		for(int i=0;i<pilotos.length&&pilotos[i]!=null;i++) {
			if(pilotos[i]!=null) {
				for(int j=0;j<6;j++) {
					pilotos[i].setAcrobacias(j, crearAcrobacia());
				}
				pilotos[i].setPuntuacion(calcularPuntuacion(pilotos[i]));
			}
		}
		
	}
	/**
	 * Cabcera: public static int calcularPruebasIlegales(Piloto[] pilotos)
	 * precondiciones: la array no debe ser nula
	 * postcondiciones: nos devuelve el numero de pruebas ilegales
	 * entrada: Piloto[] pilotos
	 * salidad: int pruebas ilegales
	 * @param pilotos
	 * @return pruebas ilegales
	 */
	
	public static int calcularPruebasIlegales(Piloto[] pilotos) {
		int pruebasIlegales=0;
		for(int i=0;i<pilotos.length;i++) {
			for(int j=0;j<6;j++) {
				if(!pilotos[i].getAcrobacia(j).isLegal()) {
					pruebasIlegales++;
				}
			}
		}
		return pruebasIlegales;
	}
	/**
	 * Cabecera: public static Piloto calcularMejorPiloto(Piloto[] pilotos)ç
	 * precondciones: ninguna
	 * postcondiciones: nos devuelve el mejor piloto de una array de pilotos
	 * entrada: Pilotos[] piloto
	 * salida: Piloto mejorPìloto
	 * @param pilotos
	 * @return
	 */
	public static Piloto calcularMejorPiloto(Piloto[] pilotos) {
		Piloto mejorPiloto=null;
		int i=0;
		mejorPiloto=pilotos[i];
		for(i=1;i<pilotos.length;i++) {
			if(pilotos[i].getPuntuacion()>mejorPiloto.getPuntuacion()) {
				mejorPiloto=pilotos[i];
			}
		}
		return mejorPiloto;
	}

}
