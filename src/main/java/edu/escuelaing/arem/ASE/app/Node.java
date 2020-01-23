package edu.escuelaing.arem.ASE.app;

import com.sun.xml.internal.bind.AnyTypeAdapter;
/*
@author Juliana Garzon
 */
public class  Node{
    private int index;
    private double dat;
    private Node next;
    private Node prior;


    public Node( double dat,Node next,Node prior){
        this.index=index;
        this.dat=dat;
        this.next=next;
        this.prior=prior;

    }

    /**
     * Metodo get para la informacion del nodo
     * @return dat
     */
    public double getDat(){
        return dat;
    }

    /**
     * Metodo para modificar el dato
     * @param dat dato que contiene el nodo
     *
     */
    public void setDat(double dat){
        this.dat=dat;
    }

    /**
     * Metodo para acceder al siguiente nodo
     * @return siguiente nodo
     */
    public  Node getNext(){
        return next;
    }

    /**
     * Metodo para modificar el siguiente nodo
     * @param next el siguiente nodo 
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Metodo para obtener el elemento anterior
     * @return nodo anterior
     */
    public Node getPrior(){
        return prior;

    }

    /**
     * Modificar el nodo anterior
     * @param prior siguiente nodo
     */

    public void setPrior(Node prior) {
        this.prior = prior;
    }

    /**
     * Obtener el indice del nodo
     * @return index 
     */


    public int getIndex() {
        return index;
    }

    /**
     * Modificar indice
     * @param index cindice 
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * metodo para poder comparar dos objetos
     * @param nodo nodo 
     * @return booleano indicando si son iguales
     *
     */
    public boolean equals(Node nodo) {
        boolean equ =false;
        if(this.dat== nodo.getDat() && this.index==nodo.getIndex()){
            equ=true;
        }
        return equ;
    }
}
