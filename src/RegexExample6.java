import java.util.regex.*;

public class RegexExample6 {
    public static void main(String[] args) {


        //System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); //true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "arun@32")); //false because @ is not in range
//        System.out.println(Pattern.matches("[a-zA-Z0-9!@#$%^&*]{7}", "arun@32")); //true
//        System.out.println(Pattern.matches("[0-9]{10}", "9874563210")); //true
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8874563210")); //true
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6874563210")); //False bcoz first digit is not i (789)
//        System.out.println(Pattern.matches("[0-9]{10}", "8874563210")); //true

          //System.out.println("By Metacharacter.....");

//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8874563210")); //(by metacharacter) true bcoz //d{9]} means digit in the remaining 9 places
//        System.out.println(Pattern.matches("\\d", "abc")); //false (non - digit)
//        System.out.println(Pattern.matches("\\d", "1")); //true ( digit and comes once)
//        System.out.println(Pattern.matches("\\d", "8874")); //false ( digit but comes more than one times )
//        System.out.println(Pattern.matches("\\d", "887acd")); //false ( digit and char both )
//        System.out.println(Pattern.matches("\\D", "a")); //true bcoz only one non - digit
//        System.out.println(Pattern.matches("\\D", "8")); //false bcoz digit
//        System.out.println(Pattern.matches("\\D*", "qwert")); //true bcoz * is used for more than one non - digits

         System.out.println(Pattern.matches("[amn]?","a")); //true ( a or m or n comes one times )
         System.out.println(Pattern.matches("[amn]?","aaa")); //false ( a comes more than one times )
         System.out.println(Pattern.matches("[amn]?","aammmmnnn")); //false ( a, m and n comes more than
         System.out.println(Pattern.matches("[amn]?","aazzta")); //false ( a comes more than one times)
         System.out.println(Pattern.matches("[amn]?","am")); // false (a  or m or n must come atleast one time)

        System.out.println("  ");

         System.out.println(Pattern.matches("[amn]+","a")); //true ( a or m or n comes one times )
         System.out.println(Pattern.matches("[amn]+","aaa")); //true ( a comes more than one times )
         System.out.println(Pattern.matches("[amn]+","aammmmnnn")); //true ( a, m and n comes more than one time)
         System.out.println(Pattern.matches("[amn]+","aazzta")); //false ( z and t are not matching)

         System.out.println("  ");


         System.out.println(Pattern.matches("[amn]*","a")); //true ( a or m or n comes zero or more times )
         System.out.println(Pattern.matches("[amn]*","aaa")); //true ( a comes more than one times )
         System.out.println(Pattern.matches("[amn]*","aammmmnnn")); //true ( a, m and n comes more than
         System.out.println(Pattern.matches("[amn]*","aazzta")); //false ( a comes more than one times)
         System.out.println(Pattern.matches("[amn]*","am")); // true (a  or m or n must come atlast one time)



    }
}
