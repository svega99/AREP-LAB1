package edu.escuelaing.arem.ASE.app;

import com.sun.xml.internal.bind.AnyTypeAdapter;

public class  Node{

    private double dat;
    private Node next;
    private Node  prior;




    public Node( double dat){
        this.dat=dat;
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


}
