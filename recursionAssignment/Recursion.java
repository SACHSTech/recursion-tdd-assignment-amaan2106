package recursionAssignment;

public class Recursion{

      public static int count7(int n) {
            int counter = 0;

            //base case
            if(n < 1){
                return 0;
            }
            if( n % 10  == 7) {

                counter++;
            }
            //recursive case
            return counter + count7(n/10);
      }

    public static String changePi(String str){
            //base case
           if(str.length() <= 1) {
            return str;
            }

            if(str.charAt(0) == 'p' && str.length() >= 2 && str.charAt(1) == 'i') {
            return "3.14";
            }
            //recursive case
            return replacePi(str.substring(1, str.length()));


    }
}
