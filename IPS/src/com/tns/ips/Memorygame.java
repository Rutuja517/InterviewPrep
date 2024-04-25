package com.tns.ips;

import java.util.Scanner;

class Memorygamefun {
    static void processQueries(int[] numbers, int Q) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Q; i++) {
            int query = scanner.nextInt();
            int count = 0;
            for (int num : numbers) {
                if (num == query) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(count);
            } else {
                System.out.println("NOT PRESENT");
            }
        }
        scanner.close();
    }
}

public class Memorygame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N
        int N = scanner.nextInt();
        
        // Input the array of N numbers
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Input Q
        int Q = scanner.nextInt();
        
        // Process Q queries
        Memorygamefun.processQueries(numbers, Q);
        
        scanner.close();
    }
}
