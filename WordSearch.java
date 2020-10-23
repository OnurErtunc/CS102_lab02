import cs1.SimpleURLReader;
import java.util.ArrayList;
/**
 * 
 * @author Onur Ertunc
 * @version 23.10.2020
 */
public class WordSearch extends HTMLFilteredReader {
  
  /**
   * constructor of the class WordSearch
   * @param url
   */
  public WordSearch( String url ) {
    super( url );
  }
  
  /**
   * the method wordSearch finds the given word on the content if it is available,
   * @param String word
   */
  public void wordSearch( String word ) {
    String content = super.getPageContents();
    ArrayList<Integer> pos = new ArrayList<Integer>();
    for ( int i = 0; i < content.length() - word.length(); i++ ) {
      if ( content.substring( i , i + word.length() ).equals( word ) ) {
        pos.add( i );
      }
    }
    if ( pos.size() == 0 ) {
      System.out.println( "The word " + word + " does not exist on the content." );
    }
    else {
      System.out.println( "The word " + word + " has found on the text " + pos.size() + " times." );
      System.out.println( "The position(s) of the word is: \n " + pos.toString() );
    }
  }
}
