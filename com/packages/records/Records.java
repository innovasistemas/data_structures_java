package com.packages.records;

import java.util.Scanner;

public class Records 
{
    private static Scanner input = new Scanner(System.in);
    private Student est[] = new Student[30];
    private int ts;

    public Records()
    {
        ts = 0;
    }

    
    public int getTs() 
    {
        return ts;
    }


    public void setTs(int ts) 
    {
        this.ts = ts;
    }


    public void createRecords()
    {
        
        String resp = "";
        do {
            est[ts] = new Student();
            System.out.println("Identificación: ");
            est[ts].id = input.next();
            System.out.println("Nombre: ");
            est[ts].name = input.next();
            System.out.println("Edad: ");
            est[ts].age = input.nextInt();
            System.out.println("Trabaja [true | false]: ");
            est[ts].work = input.nextBoolean();
            ts++;
            System.out.println("Continuar? [s/?]");
            resp = input.next();
        } while (resp.toLowerCase().equals("s"));
    }


    public void showRecords()
    {
        System.out.println("-----------");
        for (int i = 0; i < ts; i++) {
            System.out.println("Id: " + est[i].id);
            System.out.println("Nombre: " + est[i].name);
            System.out.println("Edad: " + est[i].age);
            System.out.println("Trabaja: " + est[i].work);
            System.out.println("-----------");
        }
    }
}
