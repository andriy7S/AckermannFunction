package com.andriyshapoval;

/*
Exercise 6-8.

        Write a method called ack that takes two ints as parameters and that computes and
        returns the value of the Ackermann function.
        A(0 , n) = n + 1 for n  >= 0
        A(m , 0) = A(m – 1 , 1) for m > 0
        A(m , n) = A(m – 1 , A(m , n - 1)) for n >= 0
        Test your implementation of Ackermann by invoking it from main and displaying the
        return value. Note the return value gets very big very quickly. You should try it only
        for small values of m and n (not bigger than 3).
*/

public class Main {

    public static int ack (int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    public static void main(String[] args) {
	   int value = ack(3, 7);
        System.out.println(value);
    }
}
