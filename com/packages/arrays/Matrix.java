package com.packages.arrays;

public class Matrix 
{
    private final int MAX_ROWS = 50;
    private final int MAX_COLS = 50;
    private int mat[][];
    private int m; //Número de filas
    private int n; // Número de columnas

    public Matrix()
    {
        mat = new int[MAX_ROWS][MAX_COLS];
        m = 0;
        n = 0;
    }
    
    public int getMAX_ROWS() 
    {
        return MAX_ROWS;
    }


    public int getMAX_COLS() 
    {
        return MAX_COLS;
    }

    public int[][] getMat() 
    {
        return mat;
    }

    public int getMat(int row, int col) 
    {
        return mat[row][col];
    }

    public void setMat(int[][] mat) 
    {
        this.mat = mat;
    }

    public void setMat(int row, int col, int datum) 
    {
        this.mat[row][col] = datum;
    }

    public void setM(int m) 
    {
        this.m = m;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public int getM()
    {
        return this.m;
    }

    public int getN()
    {
        return this.n;
    }


    /**
     * Crear una matriz de m*n con números enteros 
     * aleatorios
     */
    public void createMatrix()
    {
        int i, j;
        for (i = 0; i < this.m; i++) {
            for (j = 0; j < this.n; j++) {
                this.mat[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public void showMatrix()
    {
        int i, j;
        for (i = 0; i < this.m; i++) {
            for (j = 0; j < this.n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n\r");
        }
    }

    public void showMatrixColumns()
    {
        int i, j;
        for (i = 0; i < this.n; i++) {
            for (j = 0; j < this.m; j++) {
                System.out.print(mat[j][i] + "\t");
            }
            System.out.print("\n\r");
        }
    }

    public void mainDiagonal()
    {
        int i;
        for (i = 0; i < this.m; i++) {
            System.out.println(this.mat[i][i]);
        }
    }

    public void secondaryDiagonal()
    {
        int i;
        for (i = 0; i < this.m; i++) {
            System.out.println(this.mat[i][this.m - i -1]);
        }
    }
}
