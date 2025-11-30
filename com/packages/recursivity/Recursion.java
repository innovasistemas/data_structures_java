package com.packages.recursivity;

public class Recursion 
{
    public int factorial(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int fibonacci(int n)
    {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public double capital(double amount, int numYear, double percentage) 
    {
        double currentCapital;
        if (numYear == 0) {
            currentCapital = amount;
        } else {
            currentCapital = (1 + percentage) * capital(amount, numYear - 1, percentage);
        }
        return currentCapital;
    }

    public int showNaturalNumbers(int n)
    {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return showNaturalNumbers(n - 1);
        }
    }

    public int sumNaturalNumbers(int n)
    {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumbers(n - 1);
        }
    }

    public int showSquare(int n)
    {
        System.out.println(Math.pow(n, 2));
        if (n == 1) {
            return 1;
        } else {
            return showSquare(n - 1);
        }
    }

    public int sumSquare(int n)
    {
        if (n == 1) {
            return 1;
        } else {
            return (int)Math.pow(n, 2) + sumSquare(n - 1);
        }
    }

    public int mcdEuclidesRecursive(int a, int b)
    {
        if (b == 0) {
            return a;
        } else {
            return mcdEuclidesRecursive(b, a % b);
        }
    }

    public int Ackermann(int m, int n)
    {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Ackermann(m - 1, 1);
        } else {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        }
    }
}
