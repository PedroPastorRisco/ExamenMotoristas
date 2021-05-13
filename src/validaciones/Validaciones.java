package validaciones;

import java.util.Scanner;


import enumerados.Tipo;

public class Validaciones {
	private static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Cabecera: public static String leerDescripcion()<br>
	 * <br>
	 * Comentario: Este metodo se encarga de leer una cadena, que sera la descripcion de una pagina<br>
	 * <br>
	 * Precondiciones: Ninguna<br>
	 * <br>
	 * Entrada: Ninguna<br>
	 * <br>
	 * Salida: String(cadena)<br>
	 * <br>
	 * Postcondiciones: Este metodo se trata de una funcion ya que devulve un tipo de dato, en este caso una cadena.<br>
	 *  <br>
	 * @return nombre<br>
     */
	public static String leerNombre() {
		String nombre;
		System.out.println("Ingrese el nombre");
		nombre=teclado.next();
    	return nombre;
	}
	/**
	 * Cabecera: public static String leerDescripcion()<br>
	 * <br>
	 * Comentario: Este metodo se encarga de leer una cadena, que seran los apellidos de un alumno<br>
	 * <br>
	 * Precondiciones: Ninguna<br>
	 * <br>
	 * Entrada: Ninguna<br>
	 * <br>
	 * Salida: String(cadena)<br>
	 * <br>
	 * Postcondiciones: Este metodo se trata de una funcion ya que devulve un tipo de dato, en este caso una cadena.<br>
	 *  <br>
	 * @return apellidos<br>
     */
	public static String leerApellidos() {
		String apellidos;
		System.out.println("Ingrese los apellidos del alumno");
		apellidos=teclado.next();
    	return apellidos;
	}
	/**     
     * <b>Cabecera:</b> public static int leerValidarNumeroEntreRango(int valorInicial, int valorFinal)<br>
     *   <br>
     * <b>Comentario:</b> Este metodo se encarga de leer y validar que un numero este entre un rango.<br>
     *   <br>
     * <b>Precondiciones:</b> El numero valorInicial tiene que ser menor que valorFinal<br>
     *   <br>
     * <b>Entradas:</b> int valorInicial, int valorFinal<br>
     *   <br>
	 * <b>Salidas:</b> int numero <br>
     *   <br>
     * <b>Postcondiciones:</b> Este metodo se trata de un funcion ya que devuelve un tipo de dato, entero(numero) en este caso,
     *   				 el cual estara entre un rango(valorInicial y valorFinal)<br>
     *   <br>
     * @param valorInicial
     * @param valorFinal<br>
     * <br>
     * @return numero<br>
     */
    public static int leerValidarNumeroEntreRango(int valorInicial, int valorFinal){
        int numero=valorInicial-1;
        
        System.out.println("Ingrese un numero entre "+valorInicial+" y "+valorFinal+":");
		while(numero < valorInicial || numero > valorFinal) {
        	try {
				numero = Integer.parseInt(teclado.nextLine());
				if (numero < valorInicial || numero > valorFinal) {
					System.out.println("Numero ingresado no valido, vuelva intentarlo: ");
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un numero");
			}
        }
        
        return numero;
    }
    /**
     * Precondciones: ninguna</br>
     * Postcondiciones: nos devuelve un valor que vale para un enum</br>
     * entrada: ninguna</br>
     * salida:Asignaturas asignatura</br>
     * @return
     */
    public static Tipo obtenerComunidad() {
		Tipo comunidad = null;
		String respuesta;
		boolean datoValido;
		System.out.println("Introduce la comunidad autonoma. Puede ser Andalucia,Galicia o Extremadura");
		do {
			respuesta=teclado.next();
			respuesta=respuesta.toUpperCase();
			try {
				comunidad=Tipo.valueOf(respuesta);
				datoValido=true;
			}catch(Exception e) {
				System.out.println("Comunidad introducida no valida, intentelo de nuevo");
				datoValido=false;
			}
		}while(!datoValido);
		return comunidad;
	
    }

}
