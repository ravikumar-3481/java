import java.util.*;

public class self {
    public static void romantoint (String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1)  ;
    map.put('V', 5)  ;
    map.put('X', 10)  ;  
    map.put('L', 50)  ;
    map.put('C', 100)  ;
    map.put('D', 500)  ;
    map.put('M', 1000)  ;
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
        sum += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
      } else {
        sum += map.get(s.charAt(i));
      }
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
      String s = "MCM";
      romantoint(s);
  }
}