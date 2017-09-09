package cuentaBancaria;


public class Cuenta {
	private double monto;

	public Cuenta() {
		this.monto = 0;
	}

	public double saldoDeCuenta() {
		return this.monto;
	}

	public void ingresarMonto(double monto) {
		this.monto += monto;
	}
	
	public void transferirMontoA(double monto, Cuenta otra) {
		if (this.monto >= monto) {
			this.monto -= monto;
			otra.monto += monto;
		}
	}

	public void vaciarCuenta() {
		this.monto = 0;
	}
}
