import java.util.ArrayList;
import java.util.List;

public class paloAlto2 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");

        int maxLength = maxLength(arr);

        System.out.println("Maximum length: " + maxLength);
    }

    public static int maxLength(List<String> arr) {
        return backtrack(arr, 0, "");
    }

    private static int backtrack(List<String> arr, int start, String currentString) {
        int maxLength = currentString.length();

        for (int i = start; i < arr.size(); i++) {
            String newString = currentString + arr.get(i);
            if (isUnique(newString)) {
                int length = backtrack(arr, i + 1, newString);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    private static boolean isUnique(String str) {
        int[] count = new int[26];
        for (char ch : str.toCharArray()) {
            if (count[ch - 'a'] > 0) {
                return false;
            }
            count[ch - 'a']++;
        }
        return true;
    }
}

