package cuentasBanco;

/**
 * @author Bernardo Jose Perea Menchero
 * @version 0.2
 * Cambiamos la version para realizar el segundo commit de git
 */
public class Main {

	/**
	 * Metodo main que contiene una invocacion al metodo operativaCuenta
	 * 
	 */
	
	public static void main(String[] args) {
		

		operativaCuenta(0.0f);
	}

	/**
	 * Declara el objeto cuentaPersonal, el atributo saldoActual, inicializa el objeto cuentaPersonal mediante el constructor con datos
	 * y llama a al metodo estado del objeto creado, mostrando por pantalla el saldo actual de la cuenta.
	 * Por otro lado intenta retirar 2300 euros e ingresar 695 euros, todo esto controlado por try catch que muestra un mensaje en caso de error.
	 * @param cantidad Parametro float para introducir al metodo
	 * @param cuentaPersonal Objeto de la clase CCuenta
	 * @param saldoActual Variable double para almacenar el saldo actual de la cuenta
	 */
	private static void operativaCuenta(float cantidad) {
		CCuenta cuentaPersonal;
		double saldoActual;
		cuentaPersonal = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuentaPersonal.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuentaPersonal.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuentaPersonal.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
