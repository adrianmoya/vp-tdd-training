package net.velocitypartners.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArabicToRomanConverterTest {

	private ArabicToRomanConverter converter;
	
	@Before public void setup(){
		converter = new ArabicToRomanConverter();
	}
	
	@Test public void should_convert_1_to_I(){
		//Act
		String romanNumber = converter.convert(1);
		//Assert
		Assert.assertEquals("I", romanNumber);
		
	}
	
	@Test public void should_convert_2_to_II(){
		//Act
		String romanNumber = converter.convert(2);
		//Assert
		Assert.assertEquals("II", romanNumber);
		
	}
	
	@Test public void should_convert_3_to_III(){
		//Act
		String romanNumber = converter.convert(3);
		//Assert
		Assert.assertEquals("III", romanNumber);
		
	}
	
	@Test public void should_convert_4_to_IV(){
		//Act
		String romanNumber = converter.convert(4);
		//Assert
		Assert.assertEquals("IV", romanNumber);
		
	}	
	
	@Test public void should_convert_5_to_V(){
		//Act
		String romanNumber = converter.convert(5);
		//Assert
		Assert.assertEquals("V", romanNumber);
		
	}
	
	@Test public void should_convert_6_to_VI(){
		//Act
		String romanNumber = converter.convert(6);
		//Assert
		Assert.assertEquals("VI", romanNumber);
		
	}
	
	@Test public void should_convert_7_to_VII(){
		//Act
		String romanNumber = converter.convert(7);
		//Assert
		Assert.assertEquals("VII", romanNumber);
		
	}
	
	@Test public void should_convert_8_to_VIII(){
		//Act
		String romanNumber = converter.convert(8);
		//Assert
		Assert.assertEquals("VIII", romanNumber);
		
	}
	
	@Test public void should_convert_9_to_IX(){
		//Act
		String romanNumber = converter.convert(9);
		//Assert
		Assert.assertEquals("IX", romanNumber);
		
	}	
	
	@Test public void should_convert_10_to_X(){
		//Act
		String romanNumber = converter.convert(10);
		//Assert
		Assert.assertEquals("X", romanNumber);
		
	}
	
	@Test public void should_convert_11_to_XI(){
		//Act
		String romanNumber = converter.convert(14);
		//Assert
		Assert.assertEquals("XIV", romanNumber);
		
	}
}
