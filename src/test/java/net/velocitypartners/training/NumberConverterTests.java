package net.velocitypartners.training;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberConverterTests {
	
	private NumberConverter numberConverter;
	
	//Collaborators
	@Mock private ArabicToRomanConverter mockedArabicToRomanConverter;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		numberConverter = new NumberConverter();
	}
	
	@Test public void testRomanSystemConvertion(){
		//Arrange
		numberConverter.setArabicToRomanConverter(mockedArabicToRomanConverter);
		//Stubbing
		when(mockedArabicToRomanConverter.convert(1)).thenReturn("I");
		
		//Act
		String result = numberConverter.convert(1, "ROMAN");
		
		//Assert
		verify(mockedArabicToRomanConverter).convert(1);
		assertEquals("I", result);
		
	}
}
