package com.packages.linked_list;

import java.util.Scanner;

public class LinkedListCircular 
{
    public static Scanner input = new Scanner(System.in);
    public Node head, last;
    public int n;
    

    public LinkedListCircular()
    {
        this.head = null;
        this.last = null;
        this.n = 0;
    }


    public void createEndLSLC()
    {
        Node p;
        String resp;
        do {
            p = new Node();
            System.out.print("Ingrese un dato en la LSLC: ");
            p.info = input.nextInt();
            if (this.head == null) {
                this.head = p;
            } else {
                last.link = p;
            }
            p.link = this.head;
            last = p;
            this.n++;
            System.out.print("¿Desea agregar más nodos? [s/?]: ");
            resp = input.next();
        } while (resp.equals("s"));
    }


    public void scrollLSLC()
    {
        Node p;
        System.out.print(this.head.info + "\t");
        p = this.head.link;
        while (p != this.head) {
            System.out.print(p.info + "\t");
            p = p.link;
        }
    }
}
