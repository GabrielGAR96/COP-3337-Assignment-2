public class Reverser extends Transpose
{
	public Reverser(String s)
	{
		// Complete the constructor
		super(s);
	}
	
	public String reverseText(String word)
	{
		// Complete this method so that it reverses the original string
		
		String[] splitted = word.split("\\s+"); //array with each word of the string
		String result = ""; //reverted text
		int j = splitted.length-1; 
		for (int i = 0;  i < j; i++) { //loop to revert the order of each word
			String temp = splitted[i];
			splitted[i] = splitted[j];
			splitted[j] = temp;
			j--;
		}
		
		for(int i = 0; i < splitted.length-1; i++) { 
			result += splitted[i] + " ";
		}
		result += splitted[splitted.length-1]; //avoid creating another space character
		
		return result;
	}
	
	public String decode(String word)
	{
		// Complete this method so that it reverses the reversed string
		
		return super.decode(word);
	}
}