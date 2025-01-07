public class Day5_loops {
    public static void main(String[] args) {
        // int i = 20;
        // for(;i<=35;i++){
        //     System.out.print(i);
        // }

        //even numbers from 11 to 19
        // for (int i=11; i<=19;i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

        /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.


        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi" 
        

        public String stringTimes(String str, int n) {
        String sr="";
        // char ch="Hi";
        for(int i=0;i<n;i++){
            sr=sr+str;
        }
        return sr;
        }

        */
        /*
         * 
        Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"

        public String frontTimes(String str, int n) {
        int len=3;
        if (str.length()<3){
            len=str.length();
        }
        String front=str.substring(0,len);
        String sr="";
        for(int i =0 ;i<n;i++){
            sr=sr+front;
        }
        return sr;
        }

         */
    }
}
