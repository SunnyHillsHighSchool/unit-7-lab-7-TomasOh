//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tomas Oh

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    for(String w: wordList)
    {
      words.add(new Word (w));
    }
	}

	public int countWordsWithXChars(int size)
	{
    //Create an int variable called count and set equal to 0
		int count = 0;
    //Create a for loop to iterate through all of the words in the ArrayList (int x)
    for(int x = 0; x < words.size(); x++)
    {
      //Create an if-statement to check if the number of characters in the word at position x == to number of characters passed, using getLength()
      if(words.get(x).getLength() == size)
      {
        //Add 1 to count
        count++;
      }
    }

		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    //Create an int variable called numVowelsRemoved and set equal to 0
    int numVowelsRemoved = 0;

    //Create a for loop to iterate through all of the elements in the ArrayList (int x)
    for(int x = words.size() - 1; x >= 0; x--)
    {
      //Create if-statement to check if the length of the word at position x == size
      if(words.get(x).getLength() == size)
      {
        //Count the number of vowels and add it to numVowelsRemoved
        numVowelsRemoved += words.get(x).getNumVowels();
        //Remove the word at position x of the ArrayList
        words.remove(x);
      }
    }
    return numVowelsRemoved;
	}

	public int countWordsWithXVowels(int numVowels)
	{
    //Create an int variable called sum and set equal to 0
		int sum = 0;

    //Create a for loop to iterate through all of the words in the ArrayList (int x)
    for(int x = 0; x < words.size(); x++)
    {
      //Create if statemet to check if the number of vowels of the word at position x == numVowels
      if(words.get(x).getNumVowels() == numVowels)
      {
        //Add 1 to sum
        sum++;
      }
    }

		return sum;
	}
	
	//add in a toString
  public String toString()
  {
    return "" + words;
  }
}