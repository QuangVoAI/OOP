import java.util.Map;

public class Exercise5 {
    public static String [][] frequentWord(String paragraph){
        if (paragraph == null || paragraph.trim().isEmpty()){
            return new String[0][0];
        }
        String cleanParagraph = paragraph.trim().replaceAll("[^a-z\\s]", " ");
        String[] words = cleanParagraph.split("\\s+");

        Map<String, Integer> wordCount = new java.util.HashMap<>();
        for (String word : words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String[][] result = new String[wordCount.size()][2];
        int i = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        result[i][0] = entry.getKey();                // cột 1: từ
        result[i][1] = String.valueOf(entry.getValue()); // cột 2: số lần
        i++;
        }
        return result;
    }
    
    public static void printResult(String[][] arr) {
        System.out.println("Word\tFrequency");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        String paragraph = "You are living on a Plane. What you style Flatland is the vast level " +
                "surface of what I may call a fluid, on, or in, the top of which you and your " +
                "countrymen move about, without rising above it or falling below it.";

        String[][] result = frequentWord(paragraph);
        printResult(result);
    }

}
