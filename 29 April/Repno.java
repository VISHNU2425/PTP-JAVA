import java.util.HashMap;

public class Repno {
    public static void main(String[] args) {
        int[] arr = {10,4,5,87,34,4,11,4,10,11};

        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print repeated numbers and their counts
        System.out.println("Repeated numbers:");
        for (int key : countMap.keySet()) {
            int count = countMap.get(key);
            if (count > 1) {
                System.out.println(key + " repeated " + count + " times");
            }
        }
    }
}
