import cs1.SimpleURLReader;
/**
 * The test class of the Lab02
 * @author Onur Ertunc
 * @version 23.10.2020
 */
public class Test {
  public static void main( String[] args ) {
    
    // Variables
    String link = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html";
    
    // Program Code & Test Cases
    
    // Part B Testing MySimpleURLReader
    MySimpleURLReader reader = new MySimpleURLReader( link );
    System.out.println( "----------------- PART B TEST -----------------" );
    System.out.println( reader.getURL() );
    System.out.println( reader.getName() ); // This is optional
    System.out.println( "-----------------------------------------------" );
    System.out.println();
    
    // Part C Testing the method getNumberOfCSSLinks() from the MySimpleURLReader class
    System.out.println( "----------------- PART C TEST -----------------" );
    System.out.println( reader.getNumberOfCSSLinks() );
    System.out.println( "-----------------------------------------------" );
    System.out.println();
    
    // Part D Testing the HTMLFilteredReader class methods
    System.out.println( "----------------- PART D TEST -----------------" );
    HTMLFilteredReader reader2 = new HTMLFilteredReader( link );
    System.out.println( reader2.getPageContents() );
    System.out.println( "-----------------------------------------------" );
    System.out.println();
    
    // Part E Testing the WordSearch class methods
    System.out.println( "----------------- PART E TEST -----------------" );
    WordSearch reader3 = new WordSearch( link );
    reader3.wordSearch( "Turkey" );
    reader3.wordSearch( "Ankara" );
    System.out.println( "-----------------------------------------------" );
    System.out.println();
  }
}