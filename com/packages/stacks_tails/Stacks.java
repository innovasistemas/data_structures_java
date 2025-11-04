package com.packages.stacks_tails;

public class Stacks 
{
    public int stack[];
    public int top;
    public final int MAX = 50;


    public Stacks()
    {
        this.stack = new int[MAX];
        this.top = 0;
    }


    public void stacking(int datum)
    {
        if (this.top < this.MAX) {
            this.stack[this.top] = datum;
            this.top++;
        } else {
            System.err.println("Error de desbordamiento: pila llena (overflow)");
        }
    }


    public void unStacking()
    {
        if (this.top > 0) {
            this.stack[this.top] = 0;
            this.top--;
        } else {
            System.err.println("Error de subdesbordamiento: pila vacía (underflow)");
        }
    }


    public void showStack()
    {
        int i;
        for (i = this.top - 1; i >= 0; i--) {
            System.out.print("\n___\n" + this.stack[i]);
            // System.out.print(this.stack[i] + " | ");
        }
    }
}