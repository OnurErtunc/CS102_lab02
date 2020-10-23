import cs1.SimpleURLReader;
/**
 * TestProgram class that reads the contents of the provided link, prints it
 * and prints the number of lines it contains on the console.
 * This is the Part A of the assignment.
 * @author Onur Ertunc
 * @version 21.10.2020
 */
public class TestProgram {
  public static void main( String[] args ) {
        
    // Variables & Objects
    String link = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt";
    String link2 = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html";
    SimpleURLReader reader = new SimpleURLReader( link );
    MySimpleURLReader reader2 = new MySimpleURLReader( link2 );
    HTMLFilteredReader reader3 = new HTMLFilteredReader( link2 );
    WordSearch reader4 = new WordSearch( link2 );
    
    // Program Code
//    System.out.println( "The line count of the url: " + reader.getLineCount() );
//    System.out.println( "The text from the page:" );
//    System.out.println( reader.getPageContents() );
//    
//    System.out.println( "The number of css links in the url: " + reader2.getNumberOfCSSLinks() );
//    System.out.println( reader3.getUnfilteredPageContents() );
//    System.out.println( reader3.getPageContents() );
      reader4.wordSearch( "Turkey" );
      reader4.wordSearch( "Ankara" );
  }
}