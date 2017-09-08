package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.Cuenta;

public class CuentasTest {
	
		@Test
		public void AbreCuenta(){
			Cuenta account = new Cuenta();
			Assert.assertTrue(account.Estado() == 0);
		}
}
