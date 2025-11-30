package com.packages.mathematics;

public class Maths 
{
    public static int randomBetween(int maxLim, int minLim)
    {
        return (int) (Math.random() * (maxLim - minLim + 1) + minLim);
    }    
}
