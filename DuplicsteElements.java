import java.util.HashMap;
import java.util.Map;

public class DuplicsteElements {

    public static void main(String[] args) {
//        String s = "manohar";
//
//        String countedChar = ""; 
//        for (int i = 0; i < s.length(); i++) {
//            char word = s.charAt(i);
//            int count = 1;
//
//           
//            if (countedChar.indexOf(word) == -1) {
//                
//                for (int j = i + 1; j < s.length(); j++) {
//                    if (s.charAt(i) == s.charAt(j)) {
//                        count++;
//                     }
//                }
//
//               
//                System.out.println(word + ": " + count);
//              
//                countedChar += word;
//            }
//        }
    	
    	String s[]= {"apple","banana","apple","mango","orange","gauva","apple"};
    	Map<String,Integer> m = new HashMap<>();
    	for(int i=0;i<s.length;i++)
    	{
    		m.put(s[i], m.getOrDefault(s[i], 0)+1);
    	}
    	System.out.println(m);
    	
    }
}
