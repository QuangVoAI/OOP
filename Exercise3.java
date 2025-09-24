public class Exercise3 {
    public static String getFirstName(String fullName){
        if (fullName == null || fullName.trim().isEmpty()){
            return "";
        }
        String cleanFullName = fullName.trim().replaceAll("\\s+", " ");
        String[] nameParts = cleanFullName .split(" ");
        return nameParts[2];
    }

    public static String getLastName(String fullName){
        if (fullName == null || fullName.trim().isEmpty()){
            return "";
        }
        String cleanFullName = fullName.trim().replaceAll("\\s+", " ");
        String[] nameParts = cleanFullName .split(" ");
        return nameParts[0];
    }

    public static String getMiddleName(String fullName){
        if (fullName == null || fullName.trim().isEmpty()){
            return "";
        }
        String cleanFullName = fullName.trim().replaceAll("\\s+", " ");
        String[] nameParts = cleanFullName .split(" ");
        
        if (nameParts.length <= 2){
            return "";
        }
        StringBuilder middle = new StringBuilder();
        for (int i = 1; i < nameParts.length -1; i++){
            middle.append(nameParts[i]);
            if (i < nameParts.length - 2) middle.append(" ");
        }
        return middle.toString();
    }

    public static String capilizationWord(String str){
        String [] words = str.toString().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            if (word.length() > 0){
                String capitalizeWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalizeWord);
                if (i < words.length - 1) result.append(" ");
            }
        }
        return result.toString();
    }

    public static String convertName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String vowels = "aeiouyAEIOUY";

        for (char c : fullName.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "Nguyen Van Chien";
        String b = "Nguyen Thi Thu Thao";
        String c = "nguyen van chien";
        String firstName = getFirstName(a);
        String lastName = getLastName(a);
        System.out.println("Return first name and last name from full name: " + firstName + " " + lastName);
        System.out.println("Return middle name: " + getMiddleName(b));
        System.out.println("Capilization word: " + capilizationWord(c));
        System.out.println("Convert name: " + convertName(a));
    }
}
