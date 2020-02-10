public class Caesar extends Cipher
{
	public Caesar(String s)
	{
		super(s);
	}

	@Override
	public String encode(String word) {
		return code(word, Constants.ENCODE_SHIFT);
	}

	@Override
	public String decode(String word) {
		// Complete this method so that it decodes the encoded string
		return code(word, Constants.DECODE_SHIFT);
	}
	String code(String word, int SHIFT)
	{
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < word.length(); i++)
		{
			char ch = word.charAt(i);
			ch = determineCharacter(ch, SHIFT); 
			result.append(ch);
		}
		return result.toString();
	}
	
	public char determineCharacter(char ch, final int shift)
	{
		if(Character.isUpperCase(ch))
			ch = (char)('A' + (ch - 'A' + shift) % Constants.WRAP_AROUND);
			// Complete the if/else so that lower case letters are accounted for
		else ch = (char)('a' + (ch - 'a' + shift) % Constants.WRAP_AROUND);
			return ch;
	}
}