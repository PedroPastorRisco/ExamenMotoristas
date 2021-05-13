package principal;

import clasesPrincipales.Patrocinador;
import clasesPrincipales.Piloto;
import enumerados.Tipo;
import gestion.Gestora;
import mensaje.Mensaje;
import validaciones.Validaciones;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * IMPORTANTE: No me ha dado tiempo a documentar la clase Mensaje ni el main.
		 * 
		 */
		
		Piloto[] pilotos=new Piloto[10];
		
		Piloto piloto;
		String nombre,apellidos;
		Tipo comunidad;
		Patrocinador patrocinador;
		
		String nombrePatrocinador;
		Tipo comunidadPatrocinador;
		
		boolean continuar=true,acrobaciasRealizadas=false;
		int opcion;
		
		
		do {
			Mensaje.menuPrincipal();
			opcion=Validaciones.leerValidarNumeroEntreRango(1, 3);
			switch(opcion) {
			case 1:
				nombre=Validaciones.leerNombre();
				apellidos=Validaciones.leerApellidos();
				comunidad=Validaciones.obtenerComunidad();
				System.out.println("Introduce los datos de su patrocinador");
				nombrePatrocinador=Validaciones.leerNombre();
				comunidadPatrocinador=Validaciones.obtenerComunidad();
				patrocinador=new Patrocinador(nombrePatrocinador, comunidadPatrocinador);
				piloto=new Piloto(nombre, apellidos, comunidad, patrocinador);
				pilotos=Gestora.insertarPiloto(pilotos, piloto);
				break;
			case 2:
				if(pilotos[0]!=null) {
					Gestora.crearAcrobacias(pilotos);
					acrobaciasRealizadas=true;
				}
				break;
			case 3:
				if(acrobaciasRealizadas) {
					Mensaje.mostrarEstadisticas(Gestora.calcularMejorPiloto(pilotos),Gestora.calcularPruebasIlegales(pilotos));
					continuar=false;
				}else {
					System.out.println("No puedes calcular la puntuacion porque todavia no se han hecho\n"
							+ "las acrobacias pertinentes");
				}
			}
			System.out.println();
		}while(continuar);
		

	}

}
