/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios.Menu;

import java.util.Optional;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author El Camaleon
 */
public class Uso_arbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Bienvenido", "Ventana de Bienvenida", 1);
        String n1 = JOptionPane.showInputDialog("Introduce el valor de la Raiz");
        int nodo = Integer.parseInt(n1);
        Node root = new Node(nodo);
        //Varaibles uso
        boolean salir = false;
        int n;
        //----
        do {
            n = 0;

            System.out.println("---***MENU***---");
            System.out.println("1.-Insertar elementos");
            System.out.println("2.-Verificar un elemento");
            System.out.println("3.-Mostar ");
            System.out.println("4.-Eliminar elemento");
            System.out.println("5.-Salir del programa");
            int d = sc.nextInt();
            switch (d) {

                case 1: {//case1
                    System.out.println("---***Inserte un elemento***---");
                    n = sc.nextInt();
                    root.add(n);
                    break;
                }//case 1
                case 2: { //case 2
                    System.out.println("---***Ingrese el elemento a verificar***---");
                    n = sc.nextInt();
                    Optional<Node> result = root.find(n);
                    if (result.isPresent()) {
                        System.out.println(result.get());
                        System.out.println("---***Valor encontrado***---");
                    } else {
                        JOptionPane.showMessageDialog(null, "---***Valor no encontrado***---");

                    }
                    break;
                }//case 2
                case 3: {//case 3
                    int c = 0;
                    do {
                        System.out.println("---***MOSTRAR***---");
                        System.out.println("1.-PREORDEN");
                        System.out.println("2.-EN ORDEN");
                        System.out.println("3.-POST ORDEN");
                        System.out.println("4.-SALIR DEL MENU MOSTRAR");
                        n = sc.nextInt();
                        switch (n) {
                            case 1: {
                                System.out.println("PREORDEN");
                                root.printPreOrder();
                                System.out.println("");
                                break;
                            }
                            case 2: {
                                System.out.println("EN ORDEN");
                                root.printInOrder();
                                System.out.println("");
                                break;
                            }
                            case 3: {
                                System.out.println("POST ORDEN");
                                root.printPosOrder();
                                System.out.println("");
                                break;
                            }
                            case 4: {
                                c++;
                                break;
                            }
                        }
                    } while (c == 0);
                    break;
                }//case 31
                
                case 4: {
                    
                    System.out.println("---***Introduce el elemento que desea eliminar***---");
                    n = sc.nextInt();
                    Optional<Node> result = root.find(n);
                    if (result.isPresent()) {
                        root.delete(n);
                        System.out.println("---***Valor eliminado; "+n+"***---");
                    } else {
                        JOptionPane.showMessageDialog(null, "---***Valor no encontrado***---");
                        

                    }

                    break;
                }

                case 5: {
                    JOptionPane.showMessageDialog(null, "Usted ha salido del programa", "Aviso", 1);
                    salir = true;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "---***OPCION INVALIDA***---");
                    break;
                }
            }//Cierre case

        } while (salir == false);

    }
}
