
import java.lang.Math;
import java.util.regex.*;

public class HelloWorld
{
  
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
      
      String stringToTest = "Öde Öns Ökända Mysterier";
      System.out.println(stringToTest);
      System.out.println(Englisher(stringToTest));
  }
  
    public static String Englisher(String s) {
        if(containSpec(s)) {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            
            for(int i = 0; i < sb.length(); i++) {
                
                sb.setCharAt(i, Englify(sb.charAt(i)));
            }
            
            s = sb.toString();
        } 
        
        return s.replaceAll(" ", "");
  }
  
    public static boolean containSpec(String s) {
        
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        boolean b = m.find();
        
        return b;
    }
    
    //checklowerCased characters
    public static char Englify(char c) {
        char tmp = Character.toLowerCase(c);
        
        if(tmp == 'å' || tmp == 'ä' ||tmp == 'ö') {
            if(tmp != 'ö') {
                if(Character.isUpperCase(c)) {
                    c = 'A';
                } 
                else {
                    c = 'a';
                }
            }  
            else {
                if(Character.isUpperCase(c)) {
                    c = 'O';
                } 
                else {
                    c = 'o';
                }
            }
        } 
        return c;
    }
}

