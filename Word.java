import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
   private String s;

	//create 2 constructor
  public Word()
  {
    s = "";
  }

  public Word(String str)
  {
    s = str;
  }

  //setter method
  public void setWord(String r)
  {
    s = r;
  }

  //getter method
  public String getWord()
  {
    return s;
  }

  //getNumVowels
  public int getNumVowels()
  {
   //Create an int variable called numVowels and set it equal = 0
   int numVowels = 0;

   //Create a loop to iterate through all of the characters in the word passed (int x)
   for(int x = 0; x < s.length(); x++)
   {
     //Create an if statement to check if a word at position x has a vowel
     if(vowels.contains(s.charAt(x) + ""))
     {
       //If true, then set numVowels + 1
       numVowels++;
     }
   }
   //Close if and loop, return numVowels
   return numVowels;

  }

  //getLength
  public int getLength()
  {
    //create an int variable called numChars and set it equal to the number of characters in the word, using length() method.
    int numChars = s.length();
    
    return numChars;
  }

	//create a toString method
  public String toString()
  {
    return "" + s;
  }
}