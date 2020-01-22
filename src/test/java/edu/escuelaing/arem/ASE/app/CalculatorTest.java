package edu.escuelaing.arem.ASE.app;


import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void test(){

    }
    @Test
    public void Media(){
        LinkedList  vector= new LinkedList();
        Calculator c=new Calculator();
        Node node1= new Node(12);
        Node node2= new Node(17);
        Node node3= new Node(14);
        Node node4= new Node(34);
        Node node5= new Node(11);
        Node node6= new Node(9);

        vector.add(0,node1);
        vector.add(0,node2);
        vector.add(0,node3);
        vector.add(0,node4);
        vector.add(0,node5);
        vector.add(0,node6);
        assertTrue(c.media(vector)==16.16);




    }


}
