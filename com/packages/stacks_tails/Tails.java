package com.packages.stacks_tails;

public class Tails 
{
    public int tail[];
    public int end;
    public final int MAX = 50;


    public Tails()
    {
        this.tail = new int[MAX];
        this.end = 0;
    }


    public void pushTail(int datum)
    {
        if (this.end < this.MAX) {
            this.tail[this.end] = datum;
            this.end++;
        } else {
            System.err.println("Error de desbordamiento: cola llena (overflow)");
        }
    }


    public void popTail()
    {
        if (this.end > 0) {
            this.deleteElementTail(0);
            this.end--;
        } else {
            System.err.println("Error de subdesbordamiento: cola vacía (underflow)");
        }
    }


    public void deleteElementTail(int pos)
    {
        int i;
        for (i = pos; i < this.end - 1; i++) {
            this.tail[i] = this.tail[i + 1];
        }
    }


    public void showTail()
    {
        int i;
        for (i = 0; i < this.end; i++) {
            System.out.print(this.tail[i] + " | ");
        }
    }
}
