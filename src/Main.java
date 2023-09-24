import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("one", "five", "ten", "book", "red",
            "five", "ten", "five", "for", "two", "five", "three"));


    public static void main(String[] args) {

        System.out.println("Задача 1");
        task1(nums);
        task1_1();

        System.out.println("Задача 2");
        task2(nums);

        System.out.println("Задача 3");
        task3(words);
        task3_1(words);

        System.out.println("Задача 4");
        task4(words);

    }

    private static void task1(List<Integer> nums) {

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task1_1() {

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);

        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        words = new ArrayList<>(new HashSet<>(words));

        for (String word : words){
                System.out.print(word + " ");
        }
        System.out.println();
    }

    private static void task3_1(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    private static void task4(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }

        System.out.println(wordsMap);
    }

}