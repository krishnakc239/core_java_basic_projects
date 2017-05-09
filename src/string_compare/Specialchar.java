package string_compare;

/**
 * Created by krishna KC on 12/12/2016.
 */
public class Specialchar {
    public static void main(String[] args) {
        System.out.println(reverseString("manish#"));
    }
    public  static String reverseString(String input){
        char[] inputArr=input.toCharArray();
        int l=0;
        int r=inputArr.length-1;
        while(l<r){
            if(!Character.isAlphabetic(inputArr[l])){
                l++;
            }else if(!Character.isAlphabetic(inputArr[r])){
                r--;
            }else {
                char tempChar= inputArr[l];
                inputArr[r]=tempChar;
                l++;
                r--;
            }
        }
        return new String(inputArr);
    }
}
