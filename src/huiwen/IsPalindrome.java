package huiwen;

public class IsPalindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome("abcba"));
    }

    public static boolean isPalindrome(String string){
        String temp=string.toLowerCase();
        int left=0;
        int right=temp.length()-1;

        while(left <= right){
            while(left<temp.length() && !Character.isLetter(temp.charAt(left))){
                left++;
            }

            while(right>0 && !Character.isLetter(temp.charAt(right))){
                right++;
            }

            if(left > temp.length() || right < 0){
                return false;
            }

            if(temp.charAt(left) != temp.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
