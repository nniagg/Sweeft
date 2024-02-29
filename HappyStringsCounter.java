import java.util.List;

public class HappyStringsCounter {

    public static int numberOfHappyStrings(List<String> strings) {
        int count = 0;

        for (String str : strings) {
            boolean happy = true;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    happy = false;
                    break;
                }
            }
            if (happy) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("a", "abc", "abcabc", "abbcabc", "cabcbb");
        int happyCount = numberOfHappyStrings(strings);
        System.out.println("Number of happy strings: " + happyCount);
    }
}
