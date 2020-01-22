package edu.escuelaing.arem.ASE.app;

public class Calculator {

    private LinkedList vector;
    private double cont;
    private double media;
    private double rest;
    private double desviacion;


    public Calculator(){
        vector= new LinkedList();
    }

    public double sum(LinkedList vector){
        cont=0;
        for(int i=0 ; i<vector.longi();i++){
            cont+=vector.getN().getDat();
            System.out.println(vector.getN().getDat());
        }
        return cont;
    }
    public double media(LinkedList vector){
        media=0;
        media=sum(vector)/vector.longi();
        return media;

    }

    public double rest(LinkedList vector){
        rest=0;
        for(int i=0;i<vector.size();i++){
            rest+=Math.pow(vector.get(i).getDat()-media,2);
        }
        return rest;

    }
    public double desviacion (LinkedList vector){
        desviacion=0;
        desviacion=Math.sqrt(rest/vector.size()-1);
        return desviacion;


    }


}
