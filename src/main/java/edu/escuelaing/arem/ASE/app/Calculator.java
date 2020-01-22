package edu.escuelaing.arem.ASE.app;

public class Calculator {

    private LinkedList vector;
    private double sumatoria;

    public Calculator(){
        vector= new LinkedList();
    }

    public double sum(LinkedList vector){
        sumatoria=0;
        for(int i=0; i<vector.size();i++){
            sumatoria += vector.get(i).getDat();
        }
        return sumatoria;
    }



}
