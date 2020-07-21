package junit;

public class StringHelper {
	public String removeAInFirst2Chars(String str) {
		String First2Chars=str.substring(0,2);
		String afterFirst2Chars=str.substring(2);
		
		return str.replaceAll("A", " ");
	}

}
