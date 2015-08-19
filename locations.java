import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

class Locations {
  public static final String A__ = "\u001B[0m";
  public static final String A_R = "\u001B[31m";
  public static final String A_Y = "\u001B[33m";
  public static final String A_B = "\u001B[34m";
  
  public static void main(String[] args){
    String[] formats = new String[] {"E d", "EE d", "EEE d"};
    String[] locales = new String[]{ "es", "ca", "en" };
  
    for (String format : formats) {
      for( String locale : locales){
        SimpleDateFormat sdf = new SimpleDateFormat(format, new Locale(locale));
        String A = locale == "en"? A_B : locale == "es" ? A_R : A_Y;
        System.out.format(A+"%30s %s\n"+A__, format, sdf.format(new Date(0)));
      }
    }
  }
}

