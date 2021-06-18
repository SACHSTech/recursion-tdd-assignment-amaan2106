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


}
