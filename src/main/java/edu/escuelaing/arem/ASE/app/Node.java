package edu.escuelaing.arem.ASE.app;

import com.sun.xml.internal.bind.AnyTypeAdapter;

public class  Node{

    private double dat;
    private Node next;
    private Node  prior;
    private int index;


    public Node( double dat, Node next, Node prior,int index){
        this.dat=dat;
        this.next=next;
        this.prior=prior;
        this.index=index;


    }

    public double getDat(){
        return dat;
    }

    public void setDat(double dat){
        this.dat=dat;
    }

    public  Node getNext(){
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrior(){
        return prior;

    }

    public void setPrior(Node prior) {
        this.prior = prior;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
