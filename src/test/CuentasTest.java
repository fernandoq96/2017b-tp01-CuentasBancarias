package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.Cuenta;

public class CuentasTest {

	@Test
	// Verifica que abra una nueva cuenta con monto en 0
	public void abrirCuenta() {
		Cuenta account = new Cuenta();
		Assert.assertTrue(account.saldoDeCuenta() == 0);
	}

	@Test
	// Verifica que se sume un monto determinado a una cuenta;
	public void sumarUnMonto() {
		Cuenta cuentaA = new Cuenta();
		cuentaA.ingresarMonto(40);
		Assert.assertTrue(cuentaA.saldoDeCuenta() == 40);
	}

	@Test
	// Verifica que se transfiera un monto de una cuenta a otra.
	public void transferirMontoA() {
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.ingresarMonto(100);
		cuentaA.transferirMontoA(100, cuentaB);
		Assert.assertTrue(cuentaB.saldoDeCuenta() == 100 && cuentaA.saldoDeCuenta() == 0);
	}

	@Test
	// Verifica que si quiero transferir mas del monto que posee una cuenta no
	// opera
	public void transferirMasDelCapital() {
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.ingresarMonto(100);
		cuentaA.transferirMontoA(400, cuentaB);
		Assert.assertTrue(cuentaB.saldoDeCuenta() == 0 && cuentaA.saldoDeCuenta() == 100);
	}

	@Test
	public void vaciarCuenta() { // Verifica que si vacio una cuenta, ponga su
									// monto en 0
		Cuenta cuentaA = new Cuenta();
		cuentaA.ingresarMonto(1500);
		cuentaA.vaciarCuenta();
		Assert.assertTrue(cuentaA.saldoDeCuenta() == 0);
	}

	@Test
	// Verifica que se fusionen 2 cuentas(una se le incrementa el monto, la otra
	// queda en 0)
	public void fusionarCuentas() {
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.ingresarMonto(250);
		cuentaB.ingresarMonto(310);
		cuentaA.fusionarCon(cuentaB);
		Assert.assertTrue(cuentaA.saldoDeCuenta() == 560 && cuentaB.saldoDeCuenta() == 0);
	}

	@Test
	// Verifica que se reste correctamente un monto a una determinada cuenta
	public void restarMonto() {
		Cuenta cuentaA = new Cuenta();
		cuentaA.ingresarMonto(100);
		cuentaA.extraerMonto(150);
		Assert.assertTrue(cuentaA.saldoDeCuenta() == -50);
	}
}
