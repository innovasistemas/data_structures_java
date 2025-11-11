package com.packages.trees;

import java.util.Scanner;


public class BinaryTree 
{
    public static Scanner input = new Scanner(System.in);
    
    
    public BinaryTree()
    {
        
    }


    public void loadNode(NodeTree node)
    {
        NodeTree p;
        String resp;

        System.out.print("Ingrese un dato para el árbol: ");
        node.info = input.nextInt();

        System.out.print("¿Desea agregar nodos por el subárbol izquierdo del nodo " 
            + node.info +"? [s/?]: ");
        resp = input.next().toLowerCase();
        if (resp.equals("s")) {
            p = new NodeTree();
            node.left = p;
            loadNode(node.left);
        } else {
            node.left = null; 
        }

        System.out.print("¿Desea agregar nodos por el subárbol derecho del nodo " 
            + node.info + "? [s/?]: ");
        resp = input.next().toLowerCase();
        if (resp.equals("s")) {
            p = new NodeTree();
            node.right = p;
            loadNode(node.right);
        } else {
            node.right = null; 
        }
    }


    public void traversePreorder(NodeTree node)
    {
        if (node != null) {
            System.out.println("Nodo: " + node.info);
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }
    
    
    public void traverseInorder(NodeTree node)
    {
        if (node != null) {
            traverseInorder(node.left);
            System.out.println("Nodo: " + node.info);
            traverseInorder(node.right);
        }
    }
    

    public void traversePostorder(NodeTree node)
    {
        if (node != null) {
            traversePostorder(node.left);
            traversePostorder(node.right);
            System.out.println("Nodo: " + node.info);
        }
    }


    public int totalNodes(NodeTree node)
    {
        if (node != null) {
            return 1 + totalNodes(node.left) + totalNodes(node.right);
        } else {
            return 0;
        }
    }


    public int sumNodes(NodeTree node)
    {
        if (node != null) {
            return node.info + sumNodes(node.left) + sumNodes(node.right);
        } else {
            return 0;
        }
    }


    public int totalNodesOdd(NodeTree node)
    {
        int c = 0;
        if (node != null) {
            if (node.info % 2 == 0) {
                c++;
            } 
            return c + totalNodesOdd(node.left) + totalNodesOdd(node.right);
        } else {
            return 0;
        }
    }


    public int countLeaves(NodeTree node)
    {
        int c = 0;
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.println("Hoja: " + node.info);
                c++;
            } 
            return c + countLeaves(node.left) + countLeaves(node.right);
        } else {
            return 0;
        }
    }

    
    public void deleteLeaves(NodeTree node)
    {
        if (node != null) {
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    node.left = null;
                }
            }
            if (node.right != null) {
                if (node.right.left == null && node.right.right == null) {
                    node.right = null;
                }
            }
            deleteLeaves(node.left);
            deleteLeaves(node.right);
        }
    }


    public void nodesArray(NodeTree node, int v[], int pos[])
    {
        
        if (node != null) {
            v[pos[0]] = node.info;
            pos[0]++;
            nodesArray(node.left, v, pos);
            nodesArray(node.right, v, pos);
        } 
    }


    public void nodesOddArray(NodeTree node, int n)
    {
        int v[] = new int[50];
        if (node != null) {
            if (node.info % 2 == 0) {
                v[n] = node.info;
            } 
            nodesOddArray(node.left, n + 1);
            nodesOddArray(node.right, n + 1);
        } 
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");    
        }
    }


    public void nodesOddEven(NodeTree node)
    {
        if (node != null) {
            if (node.info % 2 == 0) {
                System.out.println("Nodo par: " + node.info);
            } else {
                System.out.println("Nodo impar: " + node.info);
            }
            nodesOddEven(node.left);
            nodesOddEven(node.right);
        } 
    }

    
    public int maxNode(NodeTree node)
    {
        int m, mLeft, mRight;
        m = mLeft = mRight = Integer.MIN_VALUE;
        if (node != null) {
            if (node.left != null) mLeft = maxNode(node.left);
            if (node.right != null) mRight = maxNode(node.right);
            m = mLeft > mRight ? mLeft : mRight;
            if (node.info > m) m = node.info;
        } 
        return m;
    }


    public void searchBinary(NodeTree node, int datum)
    {
        if (node != null) {
            if (datum < node.info) {
                searchBinary(node.left, datum);
            } else if (datum > node.info) {
                searchBinary(node.right, datum);
            } else {
                System.out.println("Nodo encontrado en el ABB");
            }
        } else {
            System.out.println("Nodo no encontrado en el ABB en la dirección " + node);
        }
    }


    public void insertBinary(NodeTree node, int datum)
    {
        NodeTree p;
        if (datum < node.info) {
            if (node.left == null) {
                p = new NodeTree();
                p.info = datum;
                p.left = null;
                p.right = null;
                node.left = p;
            } else {
                insertBinary(node.left, datum);
            }
        } else if (datum > node.info) {
            if (node.right == null) {
                p = new NodeTree();
                p.info = datum;
                p.left = null;
                p.right = null;
                node.right = p;
            } else {
                insertBinary(node.right, datum);
            }
        } else {
            System.out.println("El nodo ya se encuentra en el ABB");
        }
    }


    public void insertBinary2(NodeTree node, int datum)
    {
        if (node != null) {
            if (datum < node.info) {
                insertBinary2(node.left, datum);
            } else if (datum > node.info) {
                insertBinary2(node.right, datum);
            } else {
                System.out.println("El nodo ya se encuentra en el ABB");
            }
        } else {
            NodeTree p = new NodeTree();
            p.info = datum;
            p.left = null;
            p.right = null;
            node = p;
            System.out.println("Nodo insertado en el ABB");
        }
    }

    public void deleteBinary(NodeTree node, int datum)
    {
        if (node != null) {
            if (datum < node.info) {
                deleteBinary(node.left, datum);
            } else if (datum > node.info) {
                deleteBinary(node.right, datum);
            } else {
                NodeTree q = node;
                if (node.left == null) {
                    node = q.right;
                } else if (node.right == null) {
                    node = q.left;
                } else {
                    NodeTree aux1 = q.left;
                    NodeTree aux2 = aux1;
                    while (aux1.right != null) {
                        aux2 = aux1;
                        aux1 = aux1.right;
                    }
                    q.info = aux1.info;
                    q = aux1;
                    aux2.right = aux1.left;
                }
                System.out.println("Nodo eliminado del ABB");}
        } else {
            System.out.println("Nodo no encontrado en el ABB");
        } 
    }
    
}