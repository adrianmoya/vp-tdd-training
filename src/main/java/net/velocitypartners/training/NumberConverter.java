package net.velocitypartners.training;

import net.velocitypartners.training.exceptions.NumericSystemNotDefinedException;

public class NumberConverter {

	private ArabicToRomanConverter arabicToRomanConverter;
	private ArabicToBinaryConverter arabicToBinaryConverter;
	
	public String convert(int arabicNumber, NumericSystem numericSystem) throws NumericSystemNotDefinedException {
		
		if(numericSystem == null){
			throw new NumericSystemNotDefinedException();
		}
		
		switch(numericSystem){
		
		case ROMAN: return arabicToRomanConverter.convert(arabicNumber);
		case BINARY:
			return arabicToBinaryConverter.convert(arabicNumber);
		}
		return null;
		
		
	}

	public void setArabicToRomanConverter(
			ArabicToRomanConverter anAarabicToRomanConverter) {
		arabicToRomanConverter = anAarabicToRomanConverter; 
		
	}

	public void setArabicToBinaryConverter(
			ArabicToBinaryConverter anArabicToBinaryConverter) {
		arabicToBinaryConverter = anArabicToBinaryConverter;
		
	}

}
