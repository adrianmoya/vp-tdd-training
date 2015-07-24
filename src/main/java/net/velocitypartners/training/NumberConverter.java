package net.velocitypartners.training;

public class NumberConverter {

	private ArabicToRomanConverter arabicToRomanConverter;
	
	public String convert(int arabicNumber, String targetNumericSystem) {
		
		return arabicToRomanConverter.convert(arabicNumber);
		
	}

	public void setArabicToRomanConverter(
			ArabicToRomanConverter anAarabicToRomanConverter) {
		arabicToRomanConverter = anAarabicToRomanConverter; 
		
	}

}
