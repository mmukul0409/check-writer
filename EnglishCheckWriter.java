package com.app.checkwriter;

import java.text.DecimalFormat;

import com.app.checkwriter.CheckWriterHelper;
import com.app.checkwriter.Constants;

/**
 * Implements CheckWriter Interface
 * @author Mukul Mangla
 *
 */


public class EnglishCheckWriter implements CheckWriter {
		
		/**
		 *  Method to convert number to Word
		 * @param number to be converted to its English Equivalent
		 * @return English Equivalent 
		 */
	
		@Override
		public String numberToWords(int number) {
			CheckWriterHelper txtHelper = new CheckWriterHelper();
	        if (number == 0) return Constants.ZERO;
	        return txtHelper.convertNumberToWords(number); 
			
		}
		
		/**
		 * Method to Convert Number to Words and to Concatenate the Decimal part
		 * @param number to be converted to its English Equivalent
		 * @return final Concatenated String 
		 */

		@Override
		public String processNumber(double number) {
			String finalWord;
			String integerInWords;
			CheckWriterHelper txtHelper = new CheckWriterHelper();
			String roundedVal = new DecimalFormat(".##").format(number);
			String[] arr = roundedVal.split(Constants.SPLIT_DELIMETER);
		    int integerPart = Integer.parseInt(arr[0]); 
		    int decimalPart = Integer.parseInt(arr[1]);
			if(integerPart>0){
				integerInWords  = numberToWords(integerPart);
				finalWord  = txtHelper.concatanateFractions(integerInWords,decimalPart);
			}else{
				finalWord = Constants.INPUT_POSITIVE_NUMBERS;	
			}
			return finalWord;
			
		}

}
