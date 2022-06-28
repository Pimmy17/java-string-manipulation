package com.qa.string;

public class Runner {

	public static void main(String[] args) {

//		Create two Strings where one string has a value of “yesterday it was raining” 
//		and the other string with a value of “today it is sunny”
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";

//		Concatenate both values, capitalise both strings and print out the result.
//		The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		String str3 = (str2 + ", " + str1).toUpperCase();
//		System.out.println(str3);

//		Now use the substring method to print out: `TODAY IT IS RAINING`
		String str4 = str3.substring(0, 11) + str3.substring(35);
//		System.out.println(str4);

//		For this task you are to implement 4 methods that manipulate String objects. For all parts of 
//		this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using 
//		arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:

//		Method 1 - When given a String, count and return how many words there are in that String.
//		String str5 = "Do my eyes deceive me? Or is this Java I see before me?";
//		int count = 1;
//
//		for (int i = 0; i < str5.length(); i++) {
//			if (str5.substring(i, i + 1).equals(" ")) {
//				count++;
//			}
//		}
//		System.out.println(count);

//		Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
//		String str6 = "Friends, Romans, Countrymen, lend me your earphones";
//		int count = 0;
//		String verticalSentence = "";
//		String endSentence = "";
//
//		for (int i = 0; i < str6.length(); i++) {
//			if (str6.substring(i, i + 1).equals(" ")) {
//				verticalSentence += str6.substring(count, i) + "\n";
//				endSentence = str6.substring(i + 1);
//				count = i + 1;
//			}
//		}
//
//		System.out.println(verticalSentence + endSentence);

//		Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on 
//		a different line.
//		String str7 = "Are you as intrigued as I am";
//		int count = str7.length() - 1;
//		String verticalSentence = "";
//		String endSentence = "";
//
//		for (int i = str7.length() - 1; i > 0; i--) {
//			if (str7.substring(i - 1, i).equals(" ")) {
//				verticalSentence += str7.substring(i, count + 1) + "\n";
//				endSentence = str7.substring(0, i);
//				count = i - 1;
//			}
//		}
//
//		System.out.println(verticalSentence + endSentence);

//		Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want 
//		to find in the message. A boolean value should be returned to indicate whether or not the second String has 
//		been found in the message.

		String message = "This is meant to be a very long message, but I can't be bothered to type it all out";
		String findMe = "to";

		System.out.println(message.contains(findMe));

	}

}
