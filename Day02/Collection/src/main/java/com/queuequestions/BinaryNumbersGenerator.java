package com.queuequestions;

import java.util.*;

public class BinaryNumbersGenerator {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String current = queue.poll();
            result.add(current);

            // Generate next two binary numbers
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N)); // Output: ["1", "10", "11", "100", "101"]
    }
}
