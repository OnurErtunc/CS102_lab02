import cs1.SimpleURLReader;
/**
 * The HTMLFilteredReader class which provides methods that show plain page content
 * and html tags ommited version of the content.
 * @author Onur Ertunc
 * @version 23.10.2020
 */
public class HTMLFilteredReader extends MySimpleURLReader {
  
  /**
   * Constructor of the HTMLFilteredReader class
   * @param url
   */
  public HTMLFilteredReader( String url ) {
    super( url );
  }
  
  /**
   * the method that shows the plain version of the content, without null at the beginning
   * @return super.getPageContents
   */
  public String getUnfilteredPageContents() {
    return super.getPageContents().substring( 4 );
  }
  
  /**
   * the method overrides getPageContents
   * @return content2
   */
  public String getPageContents() {
    String content = super.getPageContents().substring( 4 );
    String content2 = "";
    String content3 = "";
    int pos = 0;
    boolean htmlIsThere = true;
    
    for ( int i = 0; i < content.length(); i++ ) {
      if ( content.charAt( i ) == '<' ) {
        htmlIsThere = false; //Watch out! HTML starts in here!!
      }
      if ( htmlIsThere ) {
        content2 = content2 + content.charAt( i ); //If the line is HTML block, then it does not process.
      }
      if ( content.charAt( i ) == '>' ) {
        htmlIsThere = true; //The HTML block ends in here!!
      }
    }
    while ( content2.charAt( pos ) != '$' ) {
      content3 = content3 + content2.charAt( pos );
      pos++;
    }
    return content3;
  }
  
}