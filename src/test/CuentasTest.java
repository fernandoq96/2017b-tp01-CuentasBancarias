package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.Cuenta;

public class CuentasTest {

	@Test
	// Verifica que abra una nueva cuenta con monto en 0
	public void AbreCuenta() {
		Cuenta account = new Cuenta();
		Assert.assertTrue(account.Estado() == 0);
	}

	@Test
	// Verifica que se sume un monto determinado a una cuenta;
	public void SumarMonto() {
		Cuenta cuentaA = new Cuenta();
		cuentaA.SumarMonto(40);
		Assert.assertTrue(cuentaA.Estado() == 40);
	}

	@Test
	// Verifica que se transfiera un monto de una cuenta a otra.
	public void TransferirMontoA() {
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.SumarMonto(100);
		cuentaA.TransferirMontoA(100,cuentaB);
		Assert.assertTrue(cuentaB.Estado() == 100 && cuentaA.Estado() == 0);
	}

}
