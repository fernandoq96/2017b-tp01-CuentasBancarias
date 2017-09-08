package test;

import org.junit.Test;

public class CuentasTest {
	
		@Test
		public void TrasnferirA(Cuenta otra){
			this.monto += otra.monto;
		}
}
