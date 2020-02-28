package com.epam.logging;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryTest1
{
	@Test
	public void testCalculate() 
	{
	    FactoryMain t= new FactoryMain();
		assertEquals(2400.0,t.calculate("StandardMaterial", 2),0);
		FactoryMain t2= new FactoryMain();
		assertEquals(3600.0,t2.calculate("HighStandardMaterial", 2),0);
		FactoryMain t3= new FactoryMain();
		assertEquals(3000.0,t3.calculate("AboveStandardMaterial", 2),0);
		FactoryMain t4= new FactoryMain();
		assertEquals(5000.0,t4.calculate("HighStandardMaterial and FullyAutomated", 2),0);
	}

}
