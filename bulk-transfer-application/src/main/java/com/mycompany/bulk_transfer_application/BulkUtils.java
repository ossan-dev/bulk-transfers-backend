package com.mycompany.bulk_transfer_application;

public class BulkUtils {

    /**
	 * The function converts a String that represents a value in euros to
	 * an Integer that represents the same value in cents of euros
	 * 
	 * @param euros String value in euros
	 * @return integer value representing cents of euros of the input param
	 */
	public static Integer getCentsOfEuros(String euros) {
        // TODO: if a pass in a string like "abc"?
        // How will the exception be managed? If any is fired...
        // Write unit tests for this function.
		Float centsOfEuros = Float.parseFloat(euros) * 100;
		
		return centsOfEuros.intValue();
	}
}
