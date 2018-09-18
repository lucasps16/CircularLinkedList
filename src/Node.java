/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Node<E> {
    
    public int data;
    public Node<E> link;

    public Node(int d, Node<E> n) {
        this.data = d;
        this.link = n;
    }

    public Node() {
        this.data = 0;
        this.link = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        this.data = d;
    }

    public Node<E> getLink() {
        return link;
    }

    public void setLink(Node<E> n) {
        this.link = n;
    }
    
    
    
    

   
    
    
    
}
