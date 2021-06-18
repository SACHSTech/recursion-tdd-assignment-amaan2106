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
           if (str.length() <= 1) {
                return str;
            }
            // if first character is 'p' and the next character is 'i' then "pi" replaces with "3.14"
            if (str.charAt(0)=='p' && str.length() >= 2 && str.charAt(1) == 'i') {
                return "3.14" + changePi(str.substring(2, str.length()));
            }
            //recursive case
            return str.charAt(0) + changePi(str.substring(1, str.length()));
    }

   public static String stringClean(String str){
            if(str.length() < 2){
                return str;
            }

            if(str.charAt(0) == str.charAt(1)){
                return stringClean(str.substring(1));
            }else{
            return str.charAt(0) + stringClean(str.substring(1));
            }

        }





}
