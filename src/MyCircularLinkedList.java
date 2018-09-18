
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class MyCircularLinkedList<E> implements Iterable<E>{

    private int theSize;
    private Node<E> beginMarker;
    private Node<E> endMarker;
    
    
    public MyCircularLinkedList(){
        beginMarker = null;
        endMarker = null; 
        theSize = 0;
        
    }
    
    public boolean  isEmpty(){
        return beginMarker == null;
    }
    
    public int getSize(){
        return theSize;
    }
    
    public void insertAtBegining(int val){
        Node p = new Node(val, null);
        p.setLink(beginMarker);
        
        if(beginMarker == null){
            
            beginMarker = endMarker;
            p.setLink(beginMarker);
            endMarker = beginMarker;
        } else{
            endMarker.setLink(p);
            beginMarker = p;
        }
        theSize++;
    
    }
    
    public void insertAtEnd(int val){
         Node p = new Node(val, null);
        p.setLink(beginMarker);
        
        if(beginMarker == null){
            
            beginMarker = endMarker;
            p.setLink(beginMarker);
            endMarker = beginMarker;
        } else{
            endMarker.setLink(p);
            beginMarker = p;
        }
        theSize++;
    
    }
    
    public void insertAtPos(int val, int pos){
        Node p = new Node(val, null);
        Node begining = beginMarker;
        pos = pos -1;
        for (int i = 1; i < theSize-1; i++) {
            
            if(i == pos){
                Node tmp = begining.getLink();
                begining.setLink(p);
                p.setLink(tmp);
            }
            begining = begining.getLink();
        }
        theSize ++;
    }
    
    public void deleteAtPos(int pos){
        if(theSize == 1 && pos==1){
            beginMarker = null;
            endMarker = null;
            theSize = 0;
            return;
        } else if(pos == 1){
            beginMarker = beginMarker.getLink();
            endMarker.setLink(beginMarker);
            theSize--;
            return;
        }else if(pos == theSize){
            Node s = beginMarker;
            Node t = beginMarker;
            
            while(s != endMarker){
                
        }
        }
    }
     
     
    
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
}
