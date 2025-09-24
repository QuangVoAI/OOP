public class Exercise4 {
    public static int length ( String str){
        if (str == null) return 0;
        return str.length();
    }

    public static int countWord (String str){
        if (str == null || str.trim().isEmpty()) return 0;
        String cleanStr = str.trim().replaceAll("\\s+", " ");
        String[] words = cleanStr.split(" ");
        return words.length;
    }

    public static String concenate (String str1, String str2){
        if (str1 == null) str1 = "";
        if (str2 == null) str2 = "";
        return str1.concat(str2);
    }

    public static boolean isPalindrome (String str ){
        if (str == null) return false;
        String clean = str.trim().toLowerCase();

        int left = 0;
        int right = clean.length() - 1;
        while (left < right){
            if (clean.charAt(left) != clean.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello ";
        String str2 = "World";
        System.out.println("The length of the string is: " + length(str));
        System.out.println("The number of words in the string is: " + countWord(str));
        System.out.println("The concatenated string is: " + concenate(str1, str2));
        System.out.println("Is the string a palindrome? " + isPalindrome(str2));
        System.out.println("Is the string a palindrome? " + isPalindrome("Madam"));

    }
}
