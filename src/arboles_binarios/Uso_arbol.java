/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;
import java.util.Optional;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author El Camaleon
 */
public class Uso_arbol {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         /*
        Node root = new Node(20);
        root.add(7);
        root.add(36);
        root.add(1);
        root.add(23);
        root.add(4);
       
 root.toString();
       Optional<Node> result = root.find(7);
        if (result.isPresent()) {
            System.out.println(result.get());
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Value not found");
        }
 
        result = root.find(8);
        if (result.isPresent()) {
            System.out.println(result.get());
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Value not found");
        }
        System.out.println("Print in order");
        root.printInOrder();
         System.out.println("");
        System.out.println("Print pos order");
        root.printPosOrder();
         System.out.println("");
        System.out.println("Print pre order");
        root.printPreOrder();
    }
*/
         //Uso del metodo eliminar 
       Node root = new Node(30);
        root.add(23);
        root.add(55);
        root.add(1);
        root.add(19);
        root.add(16);
        root.add(23);
        root.add(79);
        System.out.println("Tree before deletion");
         System.out.print("");
         Optional<Node> result = root.find(55);
         
        root.printPreOrder();
         System.out.println("");
        System.out.println("Introduce el elemento que desea eliminar");
         int n=sc.nextInt();
         result = root.find(n);
          if (result.isPresent()) {
                        root.delete(n);
                        System.out.println("---***Valor eliminado***---");
                    } else {
                        JOptionPane.showMessageDialog(null,"---***Valor no encontrado***---");
                         JOptionPane.showMessageDialog(null,"---***Por favor ingrese un valor correcto***---","Aviso",1);
                       
                    }
        
        root.delete(55);
        root.delete(16);
       
        System.out.print("Tree after deletion"+"\n");
        root.printPreOrder();  
     }
}
//https://devs4j.com/2017/12/04/borrar-elementos-de-un-arbol-binario/
