package edu.escuelaing.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase Linked list , implementa list
 *
 * @author Juliana Garzon
 */
public class LinkedList implements List<Node>{
    //Atibutos clase LinkedList
     Node nodo;
     Node head;
     Node tail;
     int size;


    public LinkedList(){
        this.size=0;
    }
    public Node getNode(){
        return nodo;
    }

    public void setNode(Node nodo){
        this.nodo=nodo;
    }

    /**
     * Metodo para hallar el nodo segun su indice
     * @param index
     * @return Retorna el nodo al cual se desea acceder
     */
    public Node get(int index) {
        boolean flag=false;
        Node nodo = head;
        while (flag==false) {
            if (index!=nodo.getIndex()) {
                nodo=nodo.getNext();
                flag= false;
            } else {
                flag=true;
            }
        }
        return nodo;
    }


    /**
     * Metodo que calcula el tamano de linked list
     * return tamano de la lista
     */
    public int size() {
        return size;
    }


    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }
    public boolean remove(Node node) {
        if(this.tail!=null && this.head!=null && node.getIndex()==this.tail.getIndex()){


        }
        return false;
    }
    /**
     * Metodo para agregar un nuevo nodo
     * @param node
     * @return booleano si se aagrega el nodo
     */
    public boolean add(Node node) {
        if (this.head == null && this.tail==null) {
            this.head= node;
            this.tail= node;
            node.setIndex(size);
        } else {
            this.tail.setNext(node);
            node.setPrior(this.tail);
            node.setIndex(size);
            this.tail = node;
        }
        size+=1;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void add(int index, Node node) {
        if(this.head==null){
            head=node;
            tail=node;
            size+=1;
        }else{
            tail.setNext(node);
            node.setPrior(tail);
            tail=node;
            size+=1;
        }

    }







    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }





    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }



    public Node set(int index, Node node) {
        return null;
    }





    public Node remove(int index) {
    return nodo;

    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
