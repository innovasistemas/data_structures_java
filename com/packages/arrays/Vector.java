/**
 * Clase Vector
 */

package com.packages.arrays;

public class Vector 
{
    private final int MAX = 50;
    private int vec[];
    private int n;

    public Vector() 
    {
        vec = new int[MAX];
        n = 0;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public void setVec(int datum) 
    {
        this.vec[n] = datum;
        this.n++;
    }

    public int[] getVec() 
    {
        return this.vec;
    }

    public int getVec(int pos) 
    {
        return this.vec[pos];
    }

    public int getMAX() 
    {
        return MAX;
    }

    public void setN(int t)
    {
        this.n = t;
    }

    public int getN() 
    {
        return this.n;
    }

    public void showVector()
    {
        int i;
        for (i = 0; i < this.n; i++) {
            System.out.print(this.vec[i] + " || ");
        }
    }

    public int scrollRecursiveVector(int t)
    {
        System.out.print(this.vec[t] + "|");
        if (t == this.n - 1) {
            return t;
        } else {
            return scrollRecursiveVector(t + 1);
        }
    }

    public int sumRecursiveVector(int t)
    {
        int sum = this.vec[t];
        if (t == this.n - 1) {
            return sum;
        } else {
            return sum + sumRecursiveVector(t + 1);
        }
    }

    public int countOddRecursiveVector(int t)
    {
        int c = 0;
        if (this.vec[t] % 2 == 0) {
            c++;
        }
        if (t == this.n) {
            return 0;
        } else {
            return c + countOddRecursiveVector(t + 1);
        }
    }

    public int secuencialSearchVector(int datum)
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < this.n && pos == -1) {
            if (this.vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public int binarySearchVector(int datum)
    {
        int lowerLimit, upperLimit, pos, centralPos;
        lowerLimit = 0;
        upperLimit = this.n;
        pos = -1;
        while (lowerLimit <= upperLimit && pos == -1) {
            centralPos = (upperLimit + lowerLimit) / 2;
            if (this.vec[centralPos] == datum) {
                pos = centralPos;
            } else {
                if (this.vec[centralPos] > datum) {
                    upperLimit = centralPos - 1; 
                } else {
                    lowerLimit = centralPos + 1;
                }
            }
        }
        return pos;
    }

    public void sortBubbleVector()
    {
        int i, j, aux;

        for (i = 0; i < this.n - 1; i++) {
            for (j = i + 1; j < this.n; j++) {
                if (this.vec[i] > this.vec[j]) {
                    aux = this.vec[i];
                    this.vec[i] = this.vec[j]; 
                    this.vec[j] = aux; 
                }
            }
        }
    }

    public void sortInsertionVector()
    {
        int i, j, aux;
        for (i = 1; i < this.n; i++) {
            j = i - 1;
            aux = this.vec[i];
            while (j >= 0 && aux < this.vec[j]) {
                this.vec[j + 1] = this.vec[j];
                j--;
            }
            this.vec[j + 1] = aux;
        }
    }
    
    public void sortSelectionVector()
    {
        int i, j, k, min;
        for (i = 0; i < this.n - 1; i++) {
            min = this.vec[i];
            k = i;
            for (j = i + 1; j < this.n; j++) {
                if (this.vec[j] < min) {
                    min = this.vec[j];
                    k = j;
                }
            }
            this.vec[k] = this.vec[i];
            this.vec[i] = min;
        }
    }

}
