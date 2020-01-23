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
     * @param index Indice del nodo 
     * @return Retorna el nodo al cual se desea acceder
     */
    public Node get(int index) {
        boolean flag=false;
        Node nodo = head;
        while (flag==false) {
            if (index != nodo.getIndex()) {
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


    /**
     * Metodo para acceder a la cabeza de la lista
     * @return head
     */
    public Node getHead(){
        return head;
    }

    /**
     * Metodo para obtener la cola de la lista
     * @return tail la cola de la LinkedList
     */
    public Node getTail(){
        return tail;
    }

    /**Metodo para agregar un nuevo nodo
     * @param node entra el nodo que se desea agregar 
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
        size= size+1;
        return true;
    }

    /**
     * Metodo para remover el ultimo nodo de la linked list
     * @param index indice del nodo que se desea remover
     * @return nodo
     */
    public Node remove(int index) {
        if (this.tail.getIndex()==nodo.getIndex() && nodo.getIndex()==index){
            this.tail=nodo.getPrior();
            size-=1;
        }
        return nodo;

    }
    public boolean remove(Object o) {
        return false;
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
    public void add(int index, Node element) {

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
