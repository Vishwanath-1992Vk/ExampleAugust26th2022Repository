package com.sgtesting.actitime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingTest {
  public static  Logger Log=LogManager.getLogger(LoggingTest.class);
  
  @Test
  public void displaNumbers()
  {
	  for(int i =20; i<=40;i++)
	  {
		  Log.info("The Genarated Number is"+i);
	  }
  }
}
