/**
 * Hola Mundo Java
 */

import java.util.Scanner;
import java.util.Locale;   
import com.packages.operations.*;
import com.packages.recursivity.Recursion;
import com.packages.arrays.*;
import com.packages.linked_list.*;
import com.packages.stacks_tails.Stacks;
import com.packages.stacks_tails.Tails;
import com.packages.strings.Strings;
import com.packages.trees.NodeTree;
import com.packages.trees.BinaryTree;
import com.packages.records.*;
import com.packages.graphs.*;
import com.packages.utils.*;

public class HelloWorld
{
    public static Scanner input = new Scanner(System.in);
    
    
    /**
     * Main Menu (Menú principal)
     */
    public static void main(String[] args) 
    {
        String op;
        input.useLocale(Locale.US);
        
        do {
            System.out.print(Format.CLEAR);
            System.out.print(Format.RED);
            System.out.println(
                "---------------------------------------------"
            );
            System.out.println("|" + Format.BLUE_BACKGROUND + 
                "Menú principal Estructuras de Datos en Java" +
                 Format.RED + "|"
            );
            System.out.println(
                "---------------------------------------------"
            );
            System.out.print(Format.RESET);
            System.out.println(Format.GREEN + "0." + Format.RESET + " Finalizar");
            System.out.println(Format.GREEN + "1." + Format.RESET + " Subprogramas - Calculadora");
            System.out.println(Format.GREEN + "2." + Format.RESET + " Vectores");
            System.out.println(Format.GREEN + "3." + Format.RESET + " Matrices");
            System.out.println(Format.GREEN + "4." + Format.RESET + " Listas Simplemente Ligadas");
            System.out.println(Format.GREEN + "5." + Format.RESET + " Listas Simplemente Ligadas Circulares");
            System.out.println(Format.GREEN + "6." + Format.RESET + " Listas Doblemente Ligadas");
            System.out.println(Format.GREEN + "7." + Format.RESET + " Listas Doblemente Ligadas Circulares");
            System.out.println(Format.GREEN + "8." + Format.RESET + " Pilas");
            System.out.println(Format.GREEN + "9." + Format.RESET + " Colas");
            System.out.println(Format.GREEN + "10." + Format.RESET + " Recursión");
            System.out.println(Format.GREEN + "11." + Format.RESET + " Árboles binarios");
            System.out.println(Format.GREEN + "12." + Format.RESET + " Cadenas de caracteres");
            System.out.println(Format.GREEN + "13." + Format.RESET + " Objetos como registros");
            System.out.println(Format.GREEN + "14." + Format.RESET + " Grafos");
            System.out.println(Format.GREEN + "L." + Format.RESET + " Limpiar pantalla");
            System.out.print(Format.PURPLE + "Ingrese la opción: " + Format.RESET );
            op = input.next().toUpperCase();

            switch (op) {
                case "0":
                    System.err.println("Programa finalizado");
                    break;
                case "1":
                    menuCalculator();
                    break;
                case "2":
                    menuVector();
                    break;
                case "3":
                    menuMatrix();
                    break;
                case "4":
                    menuLinkedList();
                    break;
                case "5":
                    menuLinkedListCircular();
                    break;
                case "6":
                    menuDobleLinkedList();
                    break;
                case "7":
                    
                    break;
                case "8":
                    menuStacks();
                    break;
                case "9":
                    menuTails();
                    break;
                case "10":
                    menuRecursion();
                    break;
                case "11":
                    menuTrees();
                    break;
                case "12":
                    menuStrings();
                    break;
                case "13":
                    menuRecords();
                    break;
                case "14":
                    menuGraphs();
                    break;
                case "L":
                    System.out.print(Format.CLEAR);
                    break;
                default:
                    System.err.println(Format.RED_BACKGROUND + 
                        "Opción no válida" + Format.RESET);
                    System.out.print(
                        "Presione una tecla y enter para continuar... "
                    );
                    op = input.next();
            }
        } while (!op.equals("0"));
        input.close();

    }


    /**
     * Menú subprogramas (clases y objetos): ejemplo calculadora
     */
    public static void menuCalculator()
    
    {
        Operations oper = new Operations();
        String op;
        int x, y;
        x = 0;
        y = 0;

        do {
            System.out.println("");
            System.out.println("--------------------");
            System.out.println("| Submenú Calculadora |");
            System.out.println("--------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Ver datos");
            System.out.println("3. Suma");
            System.out.println("4. Resta");
            System.out.println("5. Producto");
            System.out.println("6. División");
            System.out.println("7. Módulo");
            System.out.println("8. Potencia");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese x: ");
                    x = input.nextInt();
                    System.out.print("Ingrese y: ");
                    y = input.nextInt();
                    break;
                case "2":
                    System.out.println("x = " + x + " y = " + y );
                    break;
                case "3":
                    System.out.println(
                        "Suma " + x + " + " + y + " = " + 
                        oper.sum(x, y)
                    );
                    break;
                case "4":
                    System.out.println(
                        "Resta " + x + " - " + y + " = " + 
                        oper.diff(x, y)
                    );
                    break;
                case "5":
                    System.out.println(
                        "Producto " + x + " * " + y + " = " + 
                        oper.prod(x, y)
                    );
                    break;
                case "6":
                    if (y != 0) {
                        System.out.println(
                            "División " + x + " / " + y + " = " + 
                            oper.div(x, y)
                        );
                    } else {
                        System.err.println("¡Error! División por 0");
                    }
                    break;
                case "7":
                    if (y != 0) {
                        System.out.println(
                            "Módulo " + x + " % " + y + " = " + 
                            oper.mod(x, y)
                        );
                    } else {
                        System.err.println("¡Error! División por 0");
                    }
                    break;
                case "8":
                    if (x == 0 && y == 0) {
                        System.err.println("¡Error! 0^0 No está definido");
                    } else {
                        System.out.println(
                            "Potencia " + x + " ^ " + y + " = " + 
                            oper.pot(x, y)
                        );
                    }
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    /**
     * Menú Vectores
     */
    public static void menuVector()
    {
        Vector vector = new Vector();
        String op;
        int datum;
        do {
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("| Submenú Vectores |");
            System.out.println("-----------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar dato");
            System.out.println("2. Tamaño actual");
            System.out.println("3. Mostrar vector");
            System.out.println("4. Buscar dato (secuencial)");
            System.out.println("5. Buscar dato (binaria)");
            System.out.println("6. Ordenar vector: burbuja");
            System.out.println("7. Mostrar vector recursivo");
            System.out.println("8. Sumar vector recursivo");
            System.out.println("9. Pares vector recursivo");
            System.out.println("10. Ordenar vector: inserción");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese el dato: ");
                    datum = input.nextInt();
                    vector.setVec(datum);
                    break;
                case "2":
                    System.out.println("Total datos: " + vector.getN());
                    break;
                case "3":
                    if (vector.getN() > 0) {
                        vector.showVector();
                    } else {
                        System.out.println("No hay datos");
                    }
                    break;
                case "4":
                    if (vector.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        int pos = vector.secuencialSearchVector(datum);
                        if (pos >= 0) {
                            System.out.println("Dato se encuentra en posición " + pos);
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos");
                    }
                    break;
                case "5":
                    if (vector.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        int pos = vector.binarySearchVector(datum);
                        if (pos >= 0) {
                            System.out.println("Dato se encuentra en posición " + pos);
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos");
                    }
                    break;
                case "6":
                    vector.sortBubbleVector();
                    System.out.println(Format.GREEN_BACKGROUND);
                    System.err.println("El vector fue ordenado");
                    System.out.print(Format.RESET);
                    break;
                case "7":
                    if (vector.getN() > 0) {
                        vector.scrollRecursiveVector(0); 
                    } else {
                        System.out.println("No hay datos");
                    }
                    break;
                case "8":
                    if (vector.getN() > 0) {
                        System.out.println("Suma vector recursivo: " + 
                            vector.sumRecursiveVector(0)); 
                    } else {
                        System.out.println("No hay datos");
                    }
                    break;
                case "9":
                    if (vector.getN() > 0) {
                        System.out.println("Total pares vector recursivo: " + 
                            vector.countOddRecursiveVector(0)); 
                    } else {
                        System.out.println("No hay datos");
                    }
                    break;
                case "10":
                    vector.sortInsertionVector();
                    System.out.println(Format.GREEN_BACKGROUND);
                    System.err.println("El vector fue ordenado");
                    System.out.print(Format.RESET);
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    public static void menuMatrix()
    {
        String op;
        int m, n;
        Matrix matrix = new Matrix();
        do {
            System.out.println("0. Regresar");
            System.out.println("1. Crear matriz");
            System.out.println("2. Mostrar matriz");
            System.out.println("3. Mostrar diagonal principal");
            System.out.println("4. Mostrar diagonal secundaria");
            System.out.print("Ingrese la opción: ");
            op = input.next();
            switch (op) {
                case "0":
                    break;
                case "1":
                    System.out.print("Número de filas: ");
                    m = input.nextInt();
                    System.out.print("Número de columnas: ");
                    n = input.nextInt();
                    if (m > 0 && m <= 20 && n > 0 && n <= 20) {
                        matrix.setM(m);
                        matrix.setN(n);
                        matrix.createMatrix();
                    } else {
                        System.out.println("Tamaño no válido");
                    }
                    break;
                case "2":
                    if (matrix.getM() > 0 && matrix.getN() > 0) {
                        matrix.showMatrix();
                        System.out.println("");
                        matrix.showMatrixColumns();
                    } else {
                        System.out.println("La matriz no ha sido creada");
                    }
                    break;
                case "3":
                    if (matrix.getM() == matrix.getN() && matrix.getM() > 0) {
                        matrix.showMatrix();
                        System.out.println("");
                        matrix.mainDiagonal();
                    } else {
                        System.out.println("La matriz debe ser cuadrada");
                    }
                    break;
                case "4":
                    if (matrix.getM() == matrix.getN() && matrix.getM() > 0) {
                        matrix.showMatrix();
                        System.out.println("");
                        matrix.secondaryDiagonal();
                    } else {
                        System.out.println("La matriz debe ser cuadrada");
                    }
                    break;
                default: 
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    /**
     * Menú Listas Ligadas
     */
    public static void menuLinkedList()
    {
        LinkedList lsl = new LinkedList();
        Node pSearch;
        String op;
        int datum;
        do {
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("| Submenú Listas Simplemente Ligadas |");
            System.out.println("-----------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar dato LSL por el inicio");
            System.out.println("2. Agregar dato LSL por el final");
            System.out.println("3. Mostrar LSL y tamaño");
            System.out.println("4. Buscar dato");
            System.out.println("5. Modificar dato");
            System.out.println("6. Eliminar dato");
            System.out.println("7. Insertar dato (antes)");
            System.out.println("8. Insertar dato (después)");
            System.out.println("9. Mostrar LSL recursivo");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "0":
                    break;
                case "1":
                    lsl.createStartLSL();
                    break;
                case "2":
                    lsl.createEndLSL();
                    break;
                case "3":
                    lsl.printLSL();
                    System.out.println("\nTotal nodos: " + lsl.n);
                    break;
                case "4":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        pSearch = lsl.searchLSL(datum);
                        if (pSearch != null) {
                            System.out.println("Dato: " + pSearch + " - " + pSearch.info + " - " + pSearch.link);
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                case "5":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        pSearch = lsl.searchLSL(datum);
                        if (pSearch != null) {
                            System.out.print("Ingrese el nuevo dato: ");
                            datum = input.nextInt();
                            lsl.updateNodeLSL(pSearch, datum);
                            System.out.println("Dato actualizado");
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                case "6":
                    if (lsl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        if (lsl.deleteNode(datum)) {
                            System.out.println("Dato eliminado");
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                case "7":
                    if (lsl.head != null) {
                        System.out.print("Dato a insertar: ");
                        datum = input.nextInt();
                        System.out.print("Dato de referencia: ");
                        int dr = input.nextInt();
                        if (lsl.insertBeforeNode(dr, datum)) {
                            System.out.println("Dato insertado");
                        } else {
                            System.out.println("No se encuentra el dato de referencia");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                case "8":
                    if (lsl.head != null) {
                        System.out.print("Dato a insertar: ");
                        datum = input.nextInt();
                        System.out.print("Dato de referencia: ");
                        int dr = input.nextInt();
                        if (lsl.insertAfterNode(dr, datum)) {
                            System.out.println("Dato insertado");
                        } else {
                            System.out.println("No se encuentra el dato de referencia");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                }
                    break;
                case "9":
                    if (lsl.head != null) {
                        lsl.scrollRecursiveLSL(lsl.head);
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    /**
     * Menú Listas Ligadas Circulares
     */
    public static void menuLinkedListCircular()
    {
        LinkedListCircular lslc = new LinkedListCircular();
        // Node pSearch;
        String op;
        // int datum;
        do {
            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("| Submenú Listas Simplemente Ligadas Circulares |");
            System.out.println("----------------------------------------------");
            System.out.println("0. Regresar");
            // System.out.println("1. Agregar dato LSLC por el inicio");
            System.out.println("2. Agregar dato LSLC por el final");
            System.out.println("3. Mostrar LSLC y tamaño");
            // System.out.println("4. Buscar dato");
            // System.out.println("5. Modificar dato");
            // System.out.println("6. Eliminar dato");
            // System.out.println("7. Insertar dato (antes)");
            // System.out.println("8. Insertar dato (después)");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "0":
                    break;
                // case "1":
                //     lsls.createStartLSL();
                //     break;
                case "2":
                    lslc.createEndLSLC();
                    break;
                case "3":
                    if (lslc.head != null) {
                        lslc.scrollLSLC();
                        System.out.println("\nTotal nodos: " + lslc.n);
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                // case "4":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a buscar: ");
                //         datum = input.nextInt();
                        // pSearch = lslc.searchLSL(datum);
                        // if (pSearch != null) {
                        //     System.out.println("Dato: " + pSearch + " - " + pSearch.info + " - " + pSearch.link);
                        // } else {
                        //     System.out.println("No se encuentra el dato");
                        // }
                    // } else {
                    //     System.out.println("No hay datos. Lista vacía");
                    // }
                    // break;
                // case "5":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a buscar: ");
                //         datum = input.nextInt();
                        // pSearch = lslc.searchLSL(datum);
                        // if (pSearch != null) {
                        //     System.out.print("Ingrese el nuevo dato: ");
                        //     datum = input.nextInt();
                        //     lsl.updateNodeLSL(pSearch, datum);
                        //     System.out.println("Dato actualizado");
                        // } else {
                        //     System.out.println("No se encuentra el dato");
                        // }
                //     } else {
                //         System.out.println("No hay datos. Lista vacía");
                //     }
                //     break;
                // case "6":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a eliminar: ");
                //         datum = input.nextInt();
                        // if (lslc.deleteNode(datum)) {
                        //     System.out.println("Dato eliminado");
                        // } else {
                        //     System.out.println("No se encuentra el dato");
                        // }
                //     } else {
                //         System.out.println("No hay datos. Lista vacía");
                //     }
                //     break;
                // case "7":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a insertar: ");
                //         datum = input.nextInt();
                //         System.out.print("Dato de referencia: ");
                //         int dr = input.nextInt();
                        // if (lslc.insertBeforeNode(dr, datum)) {
                        //     System.out.println("Dato insertado");
                        // } else {
                        //     System.out.println("No se encuentra el dato de referencia");
                        // }
                //     } else {
                //         System.out.println("No hay datos. Lista vacía");
                //     }
                //     break;
                // case "8":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a insertar: ");
                //         datum = input.nextInt();
                //         System.out.print("Dato de referencia: ");
                //         int dr = input.nextInt();
                        // if (lsl.insertAfterNode(dr, datum)) {
                        //     System.out.println("Dato insertado");
                        // } else {
                        //     System.out.println("No se encuentra el dato de referencia");
                        // }
                //     } else {
                //         System.out.println("No hay datos. Lista vacía");
                // }
                //     break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    /**
     * Menú Listas Ligadas Circulares
     */
    public static void menuDobleLinkedList()
    {
        DoubleLinkedList ldl = new DoubleLinkedList();
        NodeLDL pSearch;
        String op;
        int datum;
        do {
            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("| Submenú Listas Doblemente |");
            System.out.println("-----------------------------");
            System.out.println("0. Regresar");
            // System.out.println("1. Agregar dato LDL por el inicio");
            System.out.println("2. Agregar dato LDL por el final");
            System.out.println("3. Mostrar LDL y tamaño");
            System.out.println("4. Buscar dato");
            // System.out.println("5. Modificar dato");
            System.out.println("6. Eliminar dato");
            System.out.println("7. Insertar dato (antes de referencia)");
            // System.out.println("8. Insertar dato (después de referencia)");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "0":
                    break;
                // case "1":
                //     lsls.createStartLSL();
                //     break;
                case "2":
                    ldl.createEndLDL();
                    break;
                case "3":
                    if (ldl.head != null) {
                        ldl.scrollLDL();
                        System.out.println("\nTotal nodos: " + ldl.n);
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                case "4":
                    if (ldl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        pSearch = ldl.searchLDL(datum);
                        if (pSearch != null) {
                            System.out.println("Nodo: " + pSearch + "\nInfo: " + pSearch.info);
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                // case "5":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a buscar: ");
                //         datum = input.nextInt();
                        // pSearch = lslc.searchLSL(datum);
                        // if (pSearch != null) {
                        //     System.out.print("Ingrese el nuevo dato: ");
                        //     datum = input.nextInt();
                        //     lsl.updateNodeLSL(pSearch, datum);
                        //     System.out.println("Dato actualizado");
                        // } else {
                        //     System.out.println("No se encuentra el dato");
                        // }
                //     } else {
                //         System.out.println("No hay datos. Lista vacía");
                //     }
                //     break;
                case "6":
                    if (ldl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        pSearch = ldl.searchLDL(datum);
                        if (pSearch != null) {
                            ldl.deleteLDL(pSearch);
                            System.out.println("Dato eliminado");
                        } else {
                            System.out.println("No se encuentra el dato");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                case "7":
                    if (ldl.head != null) {
                        System.out.print("Dato de referencia: ");
                        datum = input.nextInt();
                        pSearch = ldl.searchLDL(datum);
                        if (pSearch != null) {
                            System.out.print("Dato a insertar: ");
                            datum = input.nextInt();
                            ldl.insertBeforeLDL(pSearch, datum);
                            System.out.println("Dato insertado");
                        } else {
                            System.out.println("No se encuentra el dato de referencia");
                        }
                    } else {
                        System.out.println("No hay datos. Lista vacía");
                    }
                    break;
                // case "8":
                //     if (lslc.head != null) {
                //         System.out.print("Dato a insertar: ");
                //         datum = input.nextInt();
                //         System.out.print("Dato de referencia: ");
                //         int dr = input.nextInt();
                        // if (lsl.insertAfterNode(dr, datum)) {
                        //     System.out.println("Dato insertado");
                        // } else {
                        //     System.out.println("No se encuentra el dato de referencia");
                        // }
                //     } else {
                //         System.out.println("No hay datos. Lista vacía");
                // }
                //     break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    public static void menuStacks()
    {
        Stacks stc = new Stacks();
        String op; 
        int datum;
        do {
            System.out.println("");
            System.out.println("--------------");
            System.out.println("| Menú Pilas |");
            System.out.println("--------------");
            System.out.println("0. Regresar");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Mostrar Pila");
            System.out.println("4. Torres de Hanoi");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "1":
                    System.out.print("Dato a apilar: ");
                    datum = input.nextInt();
                    stc.stacking(datum);
                    break;
                case "2":
                    stc.unStacking();
                    break;
                case "3":
                    stc.showStack();
                    break;
                case "4":
                    menuHanoiTower();
                    
                    
                    break;
                default:
                    break;
            }
        } while (!op.equals("0"));
    }


    public static void menuHanoiTower()
    {
        Stacks sourceTower = new Stacks();
        Stacks targetTower = new Stacks();
        Stacks auxiliarTower = new Stacks();
        int top;
        boolean sw;
        String op; 

        do {
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("| Menú Torres de Hanoi |");
            System.out.println("------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Número de discos y llenar torre origen");
            System.out.println("2. Mover discos");
            System.out.println("3. Mostrar torres");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "1":
                    System.out.print("Número de discos: ");
                    top = input.nextInt();
                    if (top <= sourceTower.MAX) {
                        for (int i = 0; i < top; i++) {
                            sourceTower.stacking(i);
                        }
                        sourceTower.showStack();
                    } else {
                        System.out.println("Solo puede jugar hasta con 50 discos");
                    }
                    break;
                case "2":
                    if (sourceTower.top > 0) {
                        sw = false;
                        while (sourceTower.top > 1 && !sw) {
                            if (targetTower.stack[targetTower.top] > sourceTower.stack[sourceTower.top] || 
                                targetTower.top == 0) {
                                targetTower.stacking(sourceTower.stack[sourceTower.top]);
                                sourceTower.unStacking();
                            }
                        }
                    } else {
                        System.out.println("No ha dispuesto los discos o ya fueron movidos");
                    }
                    
                    
                case "3":
                    sourceTower.showStack();
                    targetTower.showStack();
                    auxiliarTower.showStack();
                
                    break;
                case "4":
                    
                    
                    break;
                default:
                    break;
            }
        } while (!op.equals("0"));
        
    }


    public static void menuTails()
    {
        Tails tail = new Tails();
        String op; 
        int datum;
        do {
            System.out.println("");
            System.out.println("--------------");
            System.out.println("| Menú Colas |");
            System.out.println("--------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar a la cola");
            System.out.println("2. Quitar de la cola");
            System.out.println("3. Mostrar Cola");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "1":
                    System.out.print("Dato a agregar: ");
                    datum = input.nextInt();
                    tail.pushTail(datum);
                    break;
                case "2":
                    tail.popTail();
                    break;
                case "3":
                    tail.showTail();
                    break;
                default:
                    break;
            }
        } while (!op.equals("0"));
    }


    public static void menuRecursion()
    {
        Recursion rec = new Recursion();
        String op; 
        int datum;
        do {
            System.out.println("");
            System.out.println("------------------");
            System.out.println("| Menú Recursión |");
            System.out.println("------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Capital");
            System.out.println("4. Mostrar números naturales");
            System.out.println("5. Suma números naturales");
            System.out.println("6. Cuadrados números naturales");
            System.out.println("7. Suma cuadrados números naturales");
            System.out.print("Ingrese la opción: ");
            op = input.next();

            switch (op) {
                case "1":
                    System.out.print("Ingrese n: ");
                    datum = input.nextInt();
                    rec.factorial(datum);
                    System.out.print(datum + "! = " + rec.factorial(datum));
                    break;
                case "2":
                    System.out.print("Ingrese n: ");
                    datum = input.nextInt();
                    System.out.println("Término " + datum + " de Fibonacci: " + rec.fibonacci(datum));
                    break;
                case "3":
                    System.out.print("Ingrese la cantidad a depositar en el banco: ");
                    double amount = input.nextDouble();
                    System.out.print("Ingrese números de años a poner la cantidad: ");
                    datum = input.nextInt();
                    System.out.print("Ingrese el porcentaje de capitalización: ");
                    double perc = input.nextDouble();
                    System.out.println("Capital a " + datum + " años con una cantidad depositada de " + 
                        amount + " pesos: " + rec.capital(amount, datum, perc));
                    break;
                case "4":
                    System.out.print("Ingrese n: ");
                    datum = input.nextInt();
                    rec.showNaturalNumbers(datum);
                    break;
                case "5":
                    System.out.print("Ingrese n: ");
                    datum = input.nextInt();
                    System.out.println("La suma de 1 a " + datum + " es: " + 
                        rec.sumNaturalNumbers(datum));
                    break;
                case "6":
                    System.out.print("Ingrese n: ");
                    datum = input.nextInt();
                    // System.out.println("La suma de cuadrados de 1 a " + datum + " es: " + 
                    rec.showSquare(datum);
                    break;
                case "7":
                    System.out.print("Ingrese n: ");
                    datum = input.nextInt();
                    System.out.println("La suma de cuadrados de 1 a " + datum + " es: " + 
                        rec.sumSquare(datum));
                    break;
                default:
                    break;
            }
        } while (!op.equals("0"));
    }


    public static void menuTrees()
    {
        NodeTree root = new NodeTree();
        BinaryTree tree = new BinaryTree();
        String op; 
        do {
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("| Menú Árboles binarios |");
            System.out.println("------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Crear árbol binario");
            System.out.println("2. Recorrido Preorden");
            System.out.println("3. Recorrido Inorden");
            System.out.println("4. Recorrido Postorden");
            System.out.println("5. Sumar nodos");
            System.out.println("6. Mayor nodo");
            System.out.println("7. Nodos pares e impares");
            System.out.println("8. Nodos pares");
            System.out.println("9. Total Nodos");
            System.out.println("10. Nodos en vector");
            System.out.println("11. Mostrar y contar hojas");
            // System.out.println("10. Nodos pares en vector");
            System.out.println("L. Limpiar pantalla");
            System.out.print("Ingrese la opción: ");
            op = input.next().toUpperCase();

            switch (op) {
                case "1":
                    tree.loadNode(root);
                    break;
                case "2":
                    if (root != null) {
                        tree.traversePreorder(root);
                    } else {
                        System.out.println("Debe crear el árbol para recorrerlo");
                    }
                    break;
                case "3":
                    if (root != null) {
                        tree.traverseInorder(root);
                    } else {
                        System.out.println("Debe crear el árbol para recorrerlo");
                    }
                    break;
                case "4":
                    if (root != null) {
                        tree.traversePostorder(root);
                    } else {
                        System.out.println("Debe crear el árbol para recorrerlo");
                    }
                    break;
                case "5":
                    if (root != null) {
                        System.out.println("Suma de nodos: " + tree.sumNodes(root));
                    } else {
                        System.out.println("Debe crear el árbol para sumar su contenido");
                    }
                    break;
                case "6":
                    if (root != null) {
                        System.out.println("Mayor nodo: " + tree.maxNode(root));
                    } else {
                        System.out.println("Debe crear el árbol para procesar");
                    }
                    break;
                case "7":
                    if (root != null) {
                        tree.nodesOddEven(root);
                    } else {
                        System.out.println("Debe crear el árbol para procesar");
                    }
                    break;
                case "8":
                    if (root != null) {
                        System.out.println("Nodos pares: " + tree.totalNodesOdd(root));
                    } else {
                        System.out.println("Debe crear el árbol para procesar");
                    }
                    break;
                case "9":
                    if (root != null) {
                        System.out.println("Total nodos: " + tree.totalNodes(root));
                    } else {
                        System.out.println("Debe crear el árbol para totalizar la cantidad de nodos");
                    }
                    break;
                case "10":
                    if (root != null) {
                        int vec[] = new int[20];
                        int pos[] = {0};
                        tree.nodesArray(root, vec, pos);
                        System.out.println("Vector: " );
                        for (int i = 0; i < pos[0]; i++) {
                            System.out.print(vec[i] + "\t");
                        }
                    } else {
                        System.out.println("Debe crear el árbol para procesar");
                    }
                    break;
                case "11":
                    if (root != null) {
                        System.out.println("Total hojas: " + tree.countLeaves(root));
                    } else {
                        System.out.println("Debe crear el árbol para totalizar la cantidad de hojas");
                    }
                    break;
                // case "11":
                //     if (root != null) {
                //         // tree.nodesOddArray(root, 0);
                //         int vec[] = new int[20];
                //         // int t = tree.totalNodes(root);
                //         tree.nodesArray(root, vec, 0);
                //         // System.out.println("Longitud vector: " + t);
                //         System.out.println("Vector");
                //         for (int i = 0; i < vec.length; i++) {
                //             System.out.println(vec[i]);
                //         }
                //         // tree.nodesOddArray(root, tree.totalNodes(root) - 1);
                //     } else {
                //         System.out.println("Debe crear el árbol para procesar");
                //     }
                //     break;
                case "L":
                    System.out.print(Format.CLEAR);
                    break;
                default:
                    break;
            }
        } while (!op.equals("0"));
    }


    public static void menuStrings()
    {
        Scanner input = new Scanner(System.in);
        Strings str = new Strings();
        String op, datum;
        do {
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("| Menú Cadenas de Caracteres |");
            System.out.println("------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Ingresar cadena");
            System.out.println("2. Mostrar cadena");
            System.out.println("3. Longitud cadena");
            System.out.println("4. Palíndromo");
            System.out.print("Ingrese su opción: ");
            op = input.nextLine();

            switch (op) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese el texto: ");
                    datum = input.nextLine();
                    str.setText(datum);
                case "2":
                    System.out.print("Texto ingresado: " + str.getText());
                    break;
                case "3":
                    System.out.print("Longitud texto: " + 
                        str.getText().length());
                    break;
                case "4":
                    System.out.println(str.getText() + 
                        ": " + str.palindrome());
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    public static void menuRecords()
    {
        Scanner input = new Scanner(System.in);
        Records rec = new Records();
        String op, datum;
        do {
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("| Menú Objetos como registros |");
            System.out.println("-------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar objetos (registros) al arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Tamaño arreglo");
            System.out.print("Ingrese su opción: ");
            op = input.nextLine();

            switch (op) {
                case "0":
                    break;
                case "1":
                    rec.createRecords();
                    break;
                case "2":
                    rec.showRecords();
                    break;
                case "3":
                    System.out.println("Total estudiantes: " + rec.getTs());
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }


    public static void menuGraphs()
    {
        Graphs graph = new Graphs();
        String op;
        int datum;
        do {
            System.out.println("");
            System.out.println("---------------");
            System.out.println("| Menú Grafos |");
            System.out.println("---------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar vértice (nodo)");
            System.out.println("2. Mostrar lista de vértices");
            System.out.println("3. Agregar/modificar nodos adyacentes");
            System.out.println("4. Mostrar matriz de adyacencia");
            System.out.println("5. Mostrar nodos adyacentes de un vértice (nodo)");
            System.out.println("6. Eliminar nodo");
            System.out.println("7. Máximo número nodos adyacentes");
            System.out.print("Ingrese su opción: ");
            op = input.nextLine();

            switch (op) {
                case "0":
                    break;
                case "1":
                    if (graph.vertexVector.getN() < graph.vertexVector.getMAX()) {
                        System.out.print("Agregar vértice (nodo): ");
                        datum = input.nextInt();
                        input.nextLine();
                        graph.addNode(datum);
                    } else {
                        System.out.println("No se pueden agregar más vértices");
                    }
                    break;
                case "2":
                    if (graph.vertexVector.getN() > 0) {
                        graph.showNodes();
                    } else {
                        System.out.println("No hay vértices agregados");
                    }
                    break;
                case "3":
                    if (graph.vertexVector.getN() > 0) {
                        graph.addAdjacentNode();
                    } else {
                        System.out.println("No hay vértices agregados");
                    }
                    break;
                case "4":
                    if (graph.vertexVector.getN() > 0) {
                        graph.showAdjacencyMatrix();
                    } else {
                        System.out.println("No hay vértices agregados");
                    }
                    break;
                case "5":
                    if (graph.vertexVector.getN() > 0) {
                        datum = graph.selectNode();
                        if (datum != -1) {
                            graph.showAdjacentNodes(datum);
                        } else {
                            System.out.println("El vértice (nodo) no existe");
                        }
                    } else {
                        System.out.println("No hay vértices agregados");
                    }
                    break;
                case "6":
                    if (graph.vertexVector.getN() > 0) {
                        datum = graph.selectNode();
                        if (datum != -1) {
                            graph.deleteNode(datum);
                            System.out.println("Vértice (nodo) eliminado");
                        } else {
                            System.out.println("El vértice (nodo) no existe");
                        }
                    } else {
                        System.out.println("No hay vértices agregados");
                    }
                    break;
                case "7":
                    if (graph.vertexVector.getN() > 0) {
                        graph.maxAdjacentNodes();
                    } else {
                        System.out.println("No hay vértices agregados");
                    }
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (!op.equals("0"));
    }

}
