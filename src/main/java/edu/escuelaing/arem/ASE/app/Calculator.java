package edu.escuelaing.arem.ASE.app;

public class Calculator {

    private LinkedList vector;
    private double sum;
    private double media;
    private double res;
    private double desv;


    public Calculator(){
        vector= new LinkedList();
    }

    /**
     * Metdodo para calcular la media
     * @param vector El vector es la linked list
     * @return el valor de la media
     */
    public double media(LinkedList vector){
        sum=0;
        media=0;
        for(int i=0 ; i<vector.size();i++){
            sum+=vector.get(i).getDat();
        }
         media=sum/vector.size();
        return media;
    }
    /**
     * Metodo que calcula la desviacion estandar
     * @param vector El vector es la linked list
     * @return desviacion estandar
     */
    public double desviacion(LinkedList vector){
        res=0;
        desv=0;
        for(int i=0; i<vector.size();i++){
            res+=Math.pow(vector.get(i).getDat()-media(vector),2);
        }
        desv=Math.sqrt(res/vector.size()-1);
        return desv;
    }


    }



