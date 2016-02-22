package cse360assign3;

/* * Calculator class should act like a calculator with basic functions such as add, subtract, multiply, and divide.
 * @author Jessie Datu 
 * PIN 226
 * @version Feb 22, 2016.
 * */

public class Calculator 
{

	private int total;
	private String history;
	
	/** Calculator() default constructor that initializes with total = 0
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";	//history initialized to "0"
	}
	
	
	/** getTotal should return the calculated total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/** The add method should add the parameter to the total variable
	 * @param value being the int to be added
	 */
	public void add (int value) 
	{
		total = total + value; 
		history = history + " + " + value; //adds onto history similarly done in the other mathematical functions
	}
	
	/** The subtract method should subtract the parameter from the total variable
	 * @param value being the int to be subtracted
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	
	/** The multiply method should multiply the total by the total by the parameter
	 * @param value being the int to be multiplied
	 */
	public void multiply (int value) 
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	
	/** The divide method should divide the total by the parameter. Use integer division. 
	 * If the parameter is zero, set the total to zero. Do not print an error message.
	 * @param value being the int to divide by
	 */
	public void divide (int value) 
	{
		if(value == 0)	//check if divisor is 0
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		
		history = history + " / " + value;
	}
	
	/** getHistory method will return a history of all actions as a String.
	 */
	public String getHistory () 
	{
		return history;
	}
}
