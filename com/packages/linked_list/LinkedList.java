/**
 * Clase LinkedList
 */

package com.packages.linked_list;

import java.util.Scanner;


public class LinkedList 
{
    public Node head;
    public Node last;
    public int n;
    
    public static Scanner input = new Scanner(System.in);

    
    /**
     * @return
     * @since 2024/03/06
     */
    public static Scanner getInput() {
        return input;
    }
    

    /**
     * @param input
     * @since 2024/03/06
     */
    public static void setInput(Scanner input) {
        LinkedList.input = input;
    }
    
    
    /**
     * @since 2024/03/06
     */
    public LinkedList()
    {
       head = null;
       n = 0;
    }


    /**
     * @since 2024/03/06
     */
    public void createStartLSL()
    {
        Node p;
        String resp;
        do {
            p = new Node();
            System.out.print("Ingrese un número a la LSL: ");
            p.info = input.nextInt();
            p.link = head;
            this.n++;
            if (this.head == null) {
                this.last = p;
            }
            this.head = p;
            System.out.print("¿Agregar más nodos?: ");
            resp = input.next();
        } while (resp.equals("s"));
    }


    /**
     * @since 2024/03/06
     */
    public void createEndLSL()
    {
        Node p;
        String resp;
        do {
            p = new Node();
            System.out.print("Ingrese un número a la LSL: ");
            p.info = input.nextInt();
            p.link = null;
            this.n++;
            if (this.head == null) {
                this.head = p;
            } else {
                this.last.link = p;
            }
            this.last = p;
            System.out.print("¿Agregar más nodos?: ");
            resp = input.next();
        } while (resp.equals("s"));
    }


    /**
     * @since 2024/03/06
     */
    public void printLSL()
    {
        Node p = this.head;
        while (p != null) {
            System.out.print(p.info + "\t");
            p = p.link;
        }
    }


    public Node scrollRecursiveLSL(Node p)
    {
        if (p == null) {
            return null;
        } else {
            System.out.print(p.info + "\t");
            return scrollRecursiveLSL(p.link);
        }
    }


    /**
     * @param datum
     * @return pSearch
     * @since 2024/03/06
     */
    public Node searchLSL(int datum)
    {
        Node p = this.head;
        Node pSearch = null;
        while (p != null && pSearch == null) {
            if (p.info == datum) {
                pSearch = p;
            } else {
                p = p.link;
            }
        }
        return pSearch;
    }


    /**
     * @param p
     * @param datum
     * @since 2024/03/06
     */
    public void updateNodeLSL(Node p, int datum)
    {
        p.info = datum;        
    }


    /**
     * @param datum
     * @return sw
     * @since 2024/03/06
     */
    public boolean deleteNode(int datum)
    {
        boolean sw = false;
        if (this.head.info == datum) {
            this.n--;
            sw = true;
            this.head = this.head.link;
        } else {
            Node p = this.head.link;
            Node q = this.head;
            while (p != null && !sw) {
                if (p.info == datum) {
                    q.link = p.link;
                    this.n--;
                    sw = true;
                } else {
                    p = p.link;
                    q = q.link;
                }
            }
        }
        return sw;
    }


    /**
     * @param dr
     * @param di
     * @return sw
     * @since 2024/03/06
     */
    public boolean insertBeforeNode(int dr, int di)
    {
        boolean sw = false;
        Node z;
        if (this.head.info == dr) {
            this.n++;
            sw = true;
            z = new Node();
            z.info = di;
            z.link = this.head;
            this.head = z;
        } else {
            Node p = this.head.link;
            Node q = this.head;
            while (p != null && !sw) {
                if (p.info == dr) {
                    z = new Node();
                    z.info = di;
                    z.link = p;
                    q.link = z;
                    this.n++;
                    sw = true;
                } else {
                    p = p.link;
                    q = q.link;
                }
            }
        }
        return sw;
    }


    /**
     * @param dr
     * @param di
     * @return sw
     * @since 2024/03/06
     */
    public boolean insertAfterNode(int dr, int di)
    {
        boolean sw = false;
        Node p, z;
        p = this.head;
        while (p != null && !sw) {
            if (p.info == dr) {
                z = new Node();
                z.info = di;
                z.link = p.link;
                p.link = z;
                this.n++;
                sw = true;
            } else {
                p = p.link;
            }
        }
        return sw;
    }


    public Node getHead() {
        return head;
    }


    public void setHead(Node head) {
        this.head = head;
    }


    public Node getLast() {
        return last;
    }


    public void setLast(Node last) {
        this.last = last;
    }


    public int getN() {
        return n;
    }


    public void setN(int n) {
        this.n = n;
    }

}
