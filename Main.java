// (c) A+ Computer Science
// www.apluscompsci.com
// Name - Tomas Oh

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		String[] wrds1 = "one two three four five six seven alligator".split(" ");
		Words test1 = new Words( wrds1 );
		out.println(test1);
		out.println("word with 2 vowels = "+test1.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test1.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test1.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test1.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test1.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test1.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test1.countWordsWithXChars(5));
		int vowelsRemoved = test1.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test1);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");		
				
		//add more test1 cases

    String[] wrds2 = "fun fly four six times ten plus eight".split(" ");
		Words test2 = new Words( wrds2 );
		out.println(test2);
		out.println("word with 2 vowels = "+test2.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test2.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test2.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test2.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test2.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test2.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test2.countWordsWithXChars(5));
		int vowelsRemoved2 = test2.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test2);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved2);
		out.println("\n\n");

    String[] wrds3 = "alligator chicken dog cat pig buffalo".split(" ");
		Words test3 = new Words( wrds3 );
		out.println(test3);
		out.println("word with 2 vowels = "+test3.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test3.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test3.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test3.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test3.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test3.countWordsWithXChars(4));
		out.println("word with 9 chars = "+test3.countWordsWithXChars(9));
		int vowelsRemoved3 = test3.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test3);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved3);
		out.println("\n\n");


	
	}
}