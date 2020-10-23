import cs1.SimpleURLReader;
/**
 * MySimpleURLReader class that extends the SimpleURLReader class with two methods,
 * named getURL and getName.
 * @author Onur Ertunc
 * @version 21.10.2020
 */
public class MySimpleURLReader extends SimpleURLReader {
  
  // Instance variables
  private String url;
  
  /**
   * Constructor of the MySimpleURLReader class
   * @param url
   */
  public MySimpleURLReader( String url ) {
    super( url );
    this.url = url;
  }
  
  /**
   * This method returns the url String used to create the
   * SimpleURLReader object
   * @return url
   */
  public String getURL() {
    return this.url;
  }
  
  /**
   * the getName method that returns the filename part of the url
   * @return fileName
   */
  public String getName() {
    int slashPos = url.length()-1;
    String fileName = "";
    while ( url.charAt( slashPos ) != '/' ) {
      slashPos--;
    }
    fileName = url.substring( slashPos + 1 );
    return fileName;
  }
  
  /**
   * the method counts the number of the css links
   * @return numberOfCSSLinks
   */
  public int getNumberOfCSSLinks() {
    String content = super.getPageContents();
    int numberOfCSSLinks = 0;
    int posTemp;
    for ( int i = 0; i + 5 < content.length(); i++ ) {
      if ( content.substring( i, i+5 ).equals( "<link" ) ) {
        posTemp = i;
         while ( content.charAt( posTemp + 4 ) != '>' ) {
          if ( content.substring( posTemp, posTemp + 4 ).equals( ".css" ) ) {
            numberOfCSSLinks++;
          }
          posTemp++;
        }
      }
    }
    return numberOfCSSLinks;
  }
}