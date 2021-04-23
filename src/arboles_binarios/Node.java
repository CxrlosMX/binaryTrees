/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;
import java.util.Optional;
/**
 *
 * @author El Camaleon
 */
public class Node {
       private Integer value;
    private Node left;
    private Node right;
 
    public Node(Integer value) {
        this.value = value;
    }
 
    public Integer getValue() {
        return value;
    }
 
    public void setValue(Integer value) {
        this.value = value;
    }
 
    public Node getLeft() {
        return left;
    }
 
    public void setLeft(Node left) {
        this.left = left;
    }
 
    public Node getRight() {
        return right;
    }
 
    public void setRight(Node right) {
        this.right = right;
    }
 
    public void add(Integer value) {
        if (value < this.value) {
            if (left != null) {
                left.add(value);
            } else {
                left = new Node(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        }
    }
 
    public Optional<Node> find(Integer value) {
        if (value == this.value) {
            return Optional.of(this);
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return Optional.empty();
            }
        }
    }
 
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(value+"-");
        if (right != null) {
            right.printInOrder();
        }
    }
 
    public void printPreOrder() {
        System.out.print(value+"-");
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }
 
    public void printPosOrder() {
        if (left != null) {
            left.printPosOrder();
        }
        if (right != null) {
            right.printPosOrder();
        }
        System.out.print(value+"-");
    }
     public Node findPredecessor() {
        if (this.getRight() == null) {
            return this;
        } else {
            return this.getRight().findPredecessor();
        }
    }
 
    public Node findSuccessor() {
        if (this.getLeft() == null) {
            return this;
        } else {
            return this.getLeft().findSuccessor();
        }
    }
 
    public Node delete(Integer value) {
        Node response = this;
        if (value < this.value) {this.left = this.left.delete(value);} else if (value > this.value) {
            this.right = this.right.delete(value);
        } else {
            if (this.left != null && this.right != null) {
                Node temp = this;
                Node maxOfTheLeft = this.left.findPredecessor();
                this.value = maxOfTheLeft.getValue();
                temp.left = temp.left.delete(maxOfTheLeft.getValue());
            } else if (this.left != null) {
                response = this.left;
            } else if (this.right != null) {
                response = this.right;
            } else {
                response = null;
            }
        }
        return response;
    }
 
    @Override
    public String toString() {
        return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
    }
    
}
