package com.packages.linked_list;

import java.util.Scanner;


public class DoubleLinkedList 
{
    public static Scanner input = new Scanner(System.in);
    public NodeLDL head, last;
    public int n;


    public DoubleLinkedList()
    {
        this.head = null;
        this.last = null;
        this.n = 0;
    }


    public void createEndLDL()
    {
        NodeLDL p;
        String resp;
        do {
            p = new NodeLDL();
            System.out.print("Ingrese un dato en la LDL: ");
            p.info = input.nextInt();
            p.rl = null;
            p.ll = last;
            if (this.head == null) {
                this.head = p;
            } else {
                last.rl = p;
            }
            last = p;
            this.n++;
            System.out.print("¿Desea agregar más nodos? [s/?]: ");
            resp = input.next();
        } while (resp.equals("s"));
    }


    public void scrollLDL()
    {
        NodeLDL p;
        p = this.head;
        while (p != null) {
            System.out.print(p.info + "\t");
            p = p.rl;
        }
    }


    /**
     * @param d
     * @return p
     */
    public NodeLDL searchLDL(int d)
    {
        NodeLDL p = this.head;
        boolean sw = false;
        while (p != null && !sw) {
            if (p.info == d) {
                sw = true;
            } else {
                p = p.rl;
            }
        }
        return p;
    }


    /**
     * @param p
     */
    public void deleteLDL(NodeLDL p) 
    {
        if (p == this.head) {
            this.head = this.head.rl;
            if (this.head != null) {
                this.head.ll = null;
            }
        } else if (p == this.last) {
            this.last = this.last.ll;
            this.last.rl = null;
        } else {
            (p.ll).rl = p.rl;
            (p.rl).ll = p.ll;
        }
        this.n--;
    }


    public void insertBeforeLDL(NodeLDL p, int d) 
    {
        NodeLDL q = new NodeLDL();
        q.info = d;
        q.rl = p;
        if (p == this.head) {
            q.ll = null;
            this.head = q;
        } else {
            (p.ll).rl = q;
            q.ll = p.ll;
        }
        p.ll = q;
        this.n++;
    }
}
