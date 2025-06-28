package array;

public class PallindromeCheck {

    // Using two pointer approach an converting to charArray
    public static  void checkPallindromeUsingTwoPointer(int num, String str){

            char[] ch  = String.valueOf(num).toCharArray() ;
            int i = 0, j = ch.length -1;
            if (ch.length == 1 ) System.out.println("Pallindrome");
            while(i < ch.length){
                if(ch[i] != ch[j]){
                    System.out.println(" Not Pallindrome");
                    break;
                } else {
                    i ++ ;
                    j -- ;
                }
            }
            if(i == ch.length) System.out.println("Pallindrome");
    }

    // Using normalApproach
    public static  void isNumberPallindrome(int num){
            int sum  = 0 ;
            int tempNum  =  num;
            while(num > 0) {
                int mod = num % 10;
                sum = sum * 10 + mod;
                num = num / 10;
            }
            if (sum == tempNum){
                System.out.println("Pallindrome");
            } else {
                System.out.println(" Not Pallindrome");
            }
    }
}
