import java.util.*;

public class Main {

    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void printUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                System.out.println(c);
                uniqueChars.add(c);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 6, 7};
        int sum = sumOfEvenElements(arr);
        System.out.println(sum);

        String str = "Alexx9800A";
        printUniqueCharacters(str);
    }
}
