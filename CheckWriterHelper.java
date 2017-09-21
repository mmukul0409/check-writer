package com.app.checkwriter;

/**
 * Helper class contains Methods to Covert Number to Words/Concatanate Fractions
 * @author Mukul Mangla
 *
 */

public class CheckWriterHelper {

	/**
	 * Helper method to Concatenate decimal number with the fractional Part
	 * @param beforeDecimal,fractionalPart
	 * @return English Equivalent 
	 */
	
    String concatanateFractions(String beforeDecimal, int fractionalPart) {
    		if(fractionalPart>0){
				return beforeDecimal+" "+ Constants.AND +" "+fractionalPart+Constants.DIVIDE_BY_HUNDRED;
			}
			else return beforeDecimal + " "+Constants.ONLY;
		}
    
	
	/**
	 * Helper method to convert number to word.
	 * @param number to be converted to its English Equivalent
	 * @return English Equivalent 
	 */
    
    String convertNumberToWords(int num) {
        String result = new String();
        if (num < 10) result = Constants.NUMBERS_BELOW_TEN[num];
        else if (num < 20) result = Constants.NUMBERS_BELOW_TWENTY[num -10];
        else if (num < 100) result = Constants.NUMBERS_BELOW_HUNDRED[num/10] + " " + convertNumberToWords(num % 10);
        else if (num < 1000) result = convertNumberToWords(num/100) + " "+ Constants.HUNDRED + " " +convertNumberToWords(num % 100);
        else if (num < 1000000) result = convertNumberToWords(num/1000) + " "+ Constants.THOUSAND + " "+ convertNumberToWords(num % 1000);
        else if (num < 1000000000) result = convertNumberToWords(num/1000000)  + " "+  Constants.MILLION   + " "+  convertNumberToWords(num % 1000000);
        else result = convertNumberToWords(num/1000000000) + " "+  Constants.BILLION   + " "+  convertNumberToWords(num % 1000000000);
        return result.trim();
    }
    
	
}
