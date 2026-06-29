class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) 
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right))) 
                right--;
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) 
                return false;
            else {
                left++; 
                right--;
            }
        }
        return true; 
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();  
        String str = "ABCDCBA";  

        // Check if the string is a palindrome using the Solution class
        boolean ans = solution.isPalindrome(str);

        // Output the result
        if (ans) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
