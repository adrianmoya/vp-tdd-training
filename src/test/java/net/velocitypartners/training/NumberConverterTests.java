package net.velocitypartners.training;

import net.velocitypartners.training.exceptions.NumericSystemNotDefinedException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberConverterTests {
	
	private NumberConverter numberConverter;
	
	//Collaborators
	@Mock private ArabicToRomanConverter mockedArabicToRomanConverter;
	@Mock private ArabicToBinaryConverter mockedArabicToBinaryConverter;
	
	//Rules
	@Rule public ExpectedException expectedException = ExpectedException.none();
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		numberConverter = new NumberConverter();
	}
	
	@Test public void testRomanSystemConversion(){
		//Arrange
		numberConverter.setArabicToRomanConverter(mockedArabicToRomanConverter);
		//Stubbing
		when(mockedArabicToRomanConverter.convert(1)).thenReturn("I");
		
		//Act
		String result = numberConverter.convert(1, NumericSystem.ROMAN);
		
		//Assert
		verify(mockedArabicToRomanConverter).convert(1);
		assertEquals("I", result);
		
	}
	
	@Test public void testBinarySystemConversion(){
		//Arrange
		numberConverter.setArabicToBinaryConverter(mockedArabicToBinaryConverter);
		//Stubbing
		when(mockedArabicToBinaryConverter.convert(4)).thenReturn("100");
		
		//Act
		String result = numberConverter.convert(4, NumericSystem.BINARY);
		
		//Assert
		verify(mockedArabicToBinaryConverter).convert(4);
		assertEquals("100", result);
	}
	
	@Test public void testNoNumericSystemPassed(){
		//Arrange 
		expectedException.expect(NumericSystemNotDefinedException.class);
		
		//Act
		numberConverter.convert(1, null);
	}
}
