package com.kodewala.threads4;

class PrintEvenNumbers extends Thread {

    @Override
    public void run() {

        System.out.println("Printing Even Numbers...");

        int count = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                System.out.println("Even Number is: " + i + " --> " + Thread.currentThread().getName());

                count++;

                // Sleep after printing 10 even numbers
                if (count == 10) {

                    System.out.println("Sending " + Thread.currentThread().getName() + " to sleeping state");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " resumed after sleep.");
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + " execution completed.");
    }
}

class PrintOddNumbers extends Thread {

    @Override
    public void run() {

        System.out.println("Printing Odd Numbers...");

        int count = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {

                System.out.println("Odd Number is: " + i + " --> " + Thread.currentThread().getName());

                count++;

                // Sleep after printing 10 odd numbers
                if (count == 10) {

                    System.out.println("Sending " + Thread.currentThread().getName() + " to sleeping state");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " resumed after sleep.");
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + " execution completed.");
    }
}

public class Task {

    public static void main(String[] args) {

        PrintEvenNumbers evenNums = new PrintEvenNumbers();
        evenNums.setName("Even Thread");

        PrintOddNumbers oddNums = new PrintOddNumbers();
        oddNums.setName("Odd Thread");

        evenNums.start();
        oddNums.start();
    }
}