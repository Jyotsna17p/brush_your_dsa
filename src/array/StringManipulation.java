package array;

import java.io.PrintStream;

public class StringManipulation {

    public static  void reverseString(String str){
        char[] ch = str.toCharArray();
       int i = 0 , j = ch.length-1;
       char temp;
       while (i< j){
           temp = ch[i];
           ch[i] = ch[j];
           ch[j] = temp;
           i++;
           j--;
       }
        System.out.println("Reverse String : =" + new String(ch));
    }


    public  static String validIPAddress(String queryIP) {
        if(queryIP == null || queryIP.isEmpty()) return "Neither";
        if(queryIP.contains(".")&& checkValidIPv4(queryIP)){
           return "IPv4";
        }else if(queryIP.contains(":")&& checkValidIPv6(queryIP)){
            return "IPv6";
        }else {
            return "Neither";
        }
    }

    public static boolean checkValidIPv4(String ip){

        String[] ipAr = null;

        ipAr = ip.split(".");

        for(String str  : ipAr){
            if(str.isEmpty() || str.length() > 3) return false;
            if(str.charAt(0) == '0') return false;
            int num = Integer.parseInt(str);
            if(!(num >= 0 && num <= 255) ) return false;
        }
        return true;
    }
    public static boolean checkValidIPv6(String ip){

        String[] ipAr = null;

        ipAr = ip.split(":");

        for(String str  : ipAr){
            if(str.isEmpty()|| str.length() > 4) return false;
            if(str.charAt(0) == '0') return false;
            if(!str.matches("[0-9a-fA-F]")) return false;

        }
        return true;
    }
}
