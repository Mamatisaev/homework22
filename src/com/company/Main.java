package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(51));
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            evenNumbers.add(numbers.get(i));
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
            System.out.println();
            System.out.print("Odd numbers: ");
            for (int i = 0; i < numbers.size(); i++) {
                oddNumbers.add(numbers.get(i));
                if (numbers.get(i) % 2 == 1) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
    }
