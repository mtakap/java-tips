package tips;

public class IntegerTest {

    public static void main(String[] args) {
		int value = 0xAAAAAAAA;
		String valueString = Integer.toHexString(value);
		System.out.println("Hex String: " + valueString);
		value = Integer.parseInt(valueString, 16);
	}

}

