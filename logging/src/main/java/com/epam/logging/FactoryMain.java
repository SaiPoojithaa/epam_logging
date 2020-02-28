package com.epam.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.tools.Generate;

public class FactoryMain
{
	private static final Logger LOGGER = LogManager . getLogger(Generate.class);
	  public double calculate(String s,int cost1)
	  {  
	      GetMaterial planFactory = new GetMaterial();    
	      TotalCost object = planFactory.Type(s);  
	      object.getCost();
	      double d=object.Calculate(cost1); 
          LOGGER . debug("Total price"+d );
  		return d;
	            }  

}
