/**
 * package: com.packages.graphs
 * Name: Graphs.java
 * Description: Clase para manejar grafos dirigidos utilizando
 * una matriz de adyacencia y un vector de vértices (nodos). Ningún
 * vértice (nodo) puede repetirse y no puede ser adyacente a sí mismo.
 * Author: Innovasistemas S.A.S.
 * Author URL: https://innovasistemas.com.co
 * Copyright: © 2025 Innovasistemas S.A.S. Todos los derechos reservados.
 * License: GNU General Public License v3.0
 * License URL: https://www.gnu.org/licenses/gpl-3.0.en.html
 * Created: 03-11-2025
 * Last Modified: 03-11-2025
 * Created by: Innovasistemas S.A.S.
 * Modified by: Innovasistemas S.A.S.
 * Project: Estructuras de Datos en Java
 * Course: Estructuras de Datos
 * Institution: Tecnológico de Antioquia - Institución Universitaria
 * Programming Language: Java
 * IDE: Visual Studio Code
 * Operating System: Cross-platform
 * Build Tool: None
 * Testing Framework: None
 * Documentation Tool: Javadoc
 * Development Methodology: Programación Orientada a Objetos (POO)
 * Version Control System: github.com/innovasistemas/data_structures_examples
 * Date Created: 03-11-2025
 * Date Modified: 03-11-2025
 * Date: 03-11-2025
 * Version: 1.0
 */
package com.packages.graphs;

import java.util.Scanner;
import com.packages.arrays.*;

public class Graphs 
{
    public Scanner input;
    public Vector vertexVector;
    public Matrix adjacencyMatrix;

    public Graphs()
    {
        vertexVector = new Vector();
        adjacencyMatrix = new Matrix();
        input = new Scanner(System.in);
    }

    public void addNode(int datum)
    {
       if (vertexVector.secuencialSearchVector(datum) == -1) {
            vertexVector.setVec(datum);
            adjacencyMatrix.setM(vertexVector.getN());
            adjacencyMatrix.setN(vertexVector.getN());
            System.out.println("Vértice (nodo) agregado");
        } else {
            System.out.println("El vértice (nodo) ya existe");
        }
    }

    public void showNodes()
    {
        System.out.println("Lista de vértices (nodos):");
        vertexVector.showVector();
    }

    public void showAdjacencyMatrix()
    {
        System.out.println("Matriz de adyacencia:");
        adjacencyMatrix.showMatrix();
    }

    public int selectNode()
    {
        int datum;
        showNodes();
        System.out.print("\nSeleccione un vértice (nodo): ");
        datum = input.nextInt();
        input.nextLine();
        return vertexVector.secuencialSearchVector(datum);
    }

    // Agregar nodo adyacente a la matriz de adyacencia
    public void addAdjacentNode()
    {
        int posRow;

        // Seleccionar vértice (nodo)
        posRow = selectNode();        
        if (posRow != -1) {
            // Seleccionar vértices (nodos) adyacentes
            selectNodeAdjacent(posRow);
        } else {
            System.out.println("El vértice (nodo) no existe");
        }
    }

    public void selectNodeAdjacent(int posRow)
    {
        int datum, posCol;
        String resp;
        do {
            System.out.println("Nodo seleccionado: " + vertexVector.getVec(posRow));
            showNodes();
            System.out.print("\nSeleccione el vértice (nodo) adyacente: ");
            datum = input.nextInt();
            input.nextLine();
            posCol = vertexVector.secuencialSearchVector(datum);
            if (posCol != -1) {
                if (posCol != posRow) {
                    System.out.print("Información de adyacencia [s/?]: ");
                    resp = input.nextLine().toLowerCase();
                    if (resp.equals("s")) {
                        System.out.print("Valor de la adyacencia: ");
                        datum = input.nextInt();
                        input.nextLine();
                    } else {
                        datum = 1; // Valor por defecto
                    }
                    adjacencyMatrix.setMat(posRow, posCol, datum);
                    System.out.println("Nodo adyacente agregado");
                } else {
                    System.out.println("Un vértice (nodo) no puede ser adyacente a sí mismo");
                }
            } else {
                System.out.println("El nodo adyacente no existe");
            }
            System.out.print("¿Desea agregar otro nodo adyacente? [s/?]: ");
            resp = input.nextLine().toLowerCase();
        } while (resp.equals("s"));
    }

    public void showAdjacentNodes(int posRow)
    {
        System.out.println("Nodos adyacentes:");
        for (int i = 0; i < adjacencyMatrix.getN(); i++) {
            if (adjacencyMatrix.getMat(posRow, i) != 0) {
                System.out.println("Nodo: " + vertexVector.getVec(i) + 
                    " - Valor de adyacencia: " + adjacencyMatrix.getMat(posRow, i));
            }
        }
    }

    public void deleteNode(int pos)
    {
        vertexVector.deleteVector(pos);
        adjacencyMatrix.deleteRow(pos);
        adjacencyMatrix.deleteColumn(pos);
    }

    public void maxAdjacentNodes()
    {
        Matrix.MaximunAdjacentNodes man;
        man = adjacencyMatrix.maxValuesNoZero();
        if (man.vertex > -1) {
            System.out.println("Nodo con mayor adyacencia: " + vertexVector.getVec(man.vertex));
            System.out.println("Número de nodos adyacentes: " + man.max);
        } else {
            System.out.println("No se ha asignado adyacencia a los nodos");
        }
    }
    
}
