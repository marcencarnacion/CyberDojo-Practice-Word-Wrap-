public class WordWrap 
{
    public static String answer(int boundary, String input) 
    {     
      //Initializing variables
      String word = input;
      int boundaryCuts = 0;
      String newWord = "";
        
      //Testing to see if the boundary is greater than the word length or if the boundary is 0 
      if (word.length() <= boundary || boundary <= 0) 
        {
            return input;
        }//end if statement
      //Obtaining the number of times the word is wrapped into a new line
      for (int i = word.length(); i  > boundary; i = i - boundary)
        {
            boundaryCuts++;
        }//end for loop
      //Constructing the string using substrings and boundaryCuts
      for (int i = 0; i <= boundaryCuts; i++)
        {
            newWord += word.substring(boundary * i, boundary * (i+1)) + "\n";
            
        }//end for loop
      //Returning the final string with the end
      newWord += word.substring(boundary * (boundaryCuts + 1), word.length());
      return newWord;
    }//end answer function
}//end class WordWrap
