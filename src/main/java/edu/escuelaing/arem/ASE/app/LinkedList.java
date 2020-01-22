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
    Node head=null;
    Node tail=null;
    double size;


    public LinkedList(){
        size=0.0;
    }

    //Tamano LinkedList
    public int size() {
        return 0;
    }

    public double longi(){
        return this.size;
    }

    public Node getN(){
        return nodo;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public void add(int index, Node node) {
        if(this.head==null){
            head=node;
            tail=node;
            size+=1;
        }else{
            tail.setNext(node);
            node.setPrior(this.tail);
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

    public boolean add(Node node) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Node get(int index) {
        return null;
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
