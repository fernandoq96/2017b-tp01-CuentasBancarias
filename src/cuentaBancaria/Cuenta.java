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
		if (monto > 0)
			this.monto += monto;
	}

	public void transferirMontoA(double monto, Cuenta otra) {
		if (monto > 0) {
			if (this.monto >= monto) {
				this.monto -= monto;
				otra.monto += monto;
			}
		}
	}

	public void vaciarCuenta() {
		this.monto = 0;
	}

	public void fusionarCon(Cuenta B) {
		this.monto += B.monto;
		B.monto = 0;
	}

	public void extraerMonto(double monto) {
		if (monto > 0) {
			if (this.monto > 0) {
				this.monto -= monto;
			}
		}
	}
}
