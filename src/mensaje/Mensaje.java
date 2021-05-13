package mensaje;

import clasesPrincipales.Piloto;

public class Mensaje {
		public static void menuPrincipal() {
			System.out.println("******************************\n"
					+ "1.- Agregar un piloto\n"
					+ "2.- Realizar vuelos\n"
					+ "3.- Ver estadisticas\n"
					+ "******************************");
		}
		
		public static void mostrarEstadisticas(Piloto p,int pruebasIlegales) {
			System.out.println(p.toString());
			for (int i=0;i<6;i++) {
				System.out.println(p.getAcrobacia(i).toString());
			}
			System.out.println("El numero de pruebas ilegales realizadas \n"
					+ "por todos los pilotos es: "+pruebasIlegales);
			
		}

	


}
