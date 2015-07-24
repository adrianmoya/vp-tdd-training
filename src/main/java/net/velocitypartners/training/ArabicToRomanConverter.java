package net.velocitypartners.training;

public class ArabicToRomanConverter {
	
	public String convert(int arabicNumber) {
		StringBuilder builder = new StringBuilder();
		
		if(arabicNumber == 9){
			return "IX";
		}
		
		if(arabicNumber == 4){
			builder.append("IV");
		} 
		
		if(arabicNumber == 14){
			builder.append("IV");
		} 
		
		if(arabicNumber >= 10){
			arabicNumber-= 10;
			builder.append("X");
		}
		
		if(arabicNumber >= 5){
			arabicNumber-= 5;
			builder.append("V");
		}
		
		
		for(int x=0; x < arabicNumber; x++)
			builder.append("I");
		return builder.toString();
	}

}
