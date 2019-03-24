package Chapter1;

import java.util.*;

public class Urlify {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int counter = 0;
		for (char ch : str.toCharArray()) {
			if (ch == ' ')
				counter++;
		}

		char cArray[] = new char[str.length() + 2 * counter];
		int prevLen = str.length() - 1;
		int newLen = cArray.length - 1;
		while (newLen >= 0) {
			if (str.charAt(prevLen) == ' ') {

				cArray[newLen--] = '0';

				cArray[newLen--] = '2';

				cArray[newLen--] = '%';
				prevLen--;
			} else {
				cArray[newLen] = str.charAt(prevLen);
				prevLen--;
				newLen--;
			}
		}

		System.out.println(new String(cArray));
	}

}
