package cuentasBanco;

/**
 * @author Bernardo Jose Perea Menchero
 * @version 0.1
 * 
 */
public class CCuenta {

	/**
	 * Parametros de la clase CCuenta
	 * 
	 * @param nombre      (Para guardar el nombre del propietario de la cuenta
	 *                    corriente)
	 * @param cuenta      (Almacena el IBAN de la cuenta corriente)
	 * @param saldo       (Almacena el saldo de la cuenta corriente)
	 * @param tipoInteres (Almacena el tipo de interes que tiene la cuenta
	 *                    corriente)
	 */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Constructor vacio
	 */
	public CCuenta() {
	}

	/**
	 * Constructor con todos los atributos de la clase
	 * 
	 * @param nom  (Almacena el nombre)
	 * @param cue  (Almacena el IBAN)
	 * @param sal  (Almacena el saldo)
	 * @param tipo (Almacena el tipo de Interes)
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Obtiene el saldo de la cuenta
	 * 
	 * @return Un valor double del saldo
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Realiza un ingreso en la cuenta corriente, ingresando un valor double y
	 * mostrando una excepcion en caso de algun error, controla que el parametro
	 * cantidad no sea negativo, mostrando un mensaje en este caso.
	 *
	 * @param cantidad Valor double con la cantidad para ingresar en la cuenta
	 * @throws Exception Genera una excepcion generica ante cualquier error
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Realiza una retirada de saldo de la cuenta corriente, ingresando un valor
	 * double y mostrando una exception en caso de algun error, controla que el
	 * parametro cantidad no sea negatico y que haya mas saldo en la cuenta que el
	 * que le solicitamos retirar mediante el parametro cantidad, mostrando un
	 * mensaje en ambos casos.
	 * 
	 * @param cantidad Valor double con la cantidad para hacer el retiro de la
	 *                 cuenta
	 * @throws Exception Excepcion generica ante cualquier error
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Obtiene el nombre del propietario de la cuenta corriente
	 * 
	 * @return Devuelve el nombre del propietario de la cuenta corriente
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del propietario de la cuenta corriente
	 * 
	 * @param nombre Contiene el nombre del propietario de la cuenta corriente para
	 *               asignarlo
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el IBAN de la cuenta corriente
	 * 
	 * @return Devuelve el IBAN de la cuenta corriente
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el IBAN de la cuenta corriente
	 * 
	 * @param cuenta Contiene el IBAN de la cuenta corriente para asignarlo
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtiene el saldo de la cuenta corriente
	 * 
	 * @return Devuelve el saldo de la cuenta corriente
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta corriente
	 * 
	 * @param saldo Contiene el saldo de la cuenta para asignarlo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el tipo de interes de la cuenta corriente
	 * 
	 * @return Devuelve el tipo de interes de la cuenta corriente
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Establece el tipo de interes que contendra la cuenta corriente
	 * 
	 * @param tipoInteres Contiene el tipo de interes que se le asignara a la cuenta
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
