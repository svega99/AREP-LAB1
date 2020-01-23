package edu.escuelaing.arem.ASE.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void test(){

    }

    @Test
    public void agregarNodo(){ LinkedList vector=new LinkedList();
    Node node1=new Node(4,null,null);
    Node node2=new Node(5,null,null);
    Node node3=new Node(9,null,null);
    vector.add(node1);
    vector.add(node2);
    vector.add(node3);
    assertTrue(vector.size()==3);
    }
    @Test
    public void Media1(){ LinkedList  vector= new LinkedList();
        Calculator c=new Calculator();
        Node node1= new Node(9,null,null);
        Node node2= new Node(9,null,null);
        Node node3= new Node(9,null,null);
        Node node4= new Node(9,null,null);
        Node node5= new Node(9,null,null);
        Node node6= new Node(9,null,null);

        vector.add(node1);
        vector.add(node2);
        vector.add(node3);
        vector.add(node4);
        vector.add(node5);
        vector.add(node6);
        assertTrue(c.media(vector)==9.0);




    }

    @Test
    public void Media2(){ LinkedList  vector= new LinkedList();
        Calculator c=new Calculator();
        Node node1= new Node(160,null,null);
        Node node2= new Node(591,null,null);
        Node node3= new Node(114,null,null);
        Node node4= new Node(229,null,null);
        Node node5= new Node(230,null,null);
        Node node6= new Node(270,null,null);
        Node node7= new Node(128,null,null);
        Node node8= new Node(1657,null,null);
        Node node9= new Node(624,null,null);
        Node node10= new Node(1503,null,null);

        vector.add(node1);
        vector.add(node2);
        vector.add(node3);
        vector.add(node4);
        vector.add(node5);
        vector.add(node6);
        vector.add(node7);
        vector.add(node8);
        vector.add(node9);
        vector.add(node10);

        assertTrue(c.media(vector)==550.6);




    }

    @Test
    public void desviacion(){ Calculator c= new Calculator();
        LinkedList vector =new LinkedList();
        Node node1= new Node(160,null,null);
        Node node2= new Node(591,null,null);
        Node node3= new Node(114,null,null);
        Node node4= new Node(229,null,null);
        Node node5= new Node(230,null,null);
        Node node6= new Node(270,null,null);
        Node node7= new Node(128,null,null);
        Node node8= new Node(1657,null,null);
        Node node9= new Node(624,null,null);
        Node node10= new Node(1503,null,null);

        vector.add(node1);
        vector.add(node2);
        vector.add(node3);
        vector.add(node4);
        vector.add(node5);
        vector.add(node6);
        vector.add(node7);
        vector.add(node8);
        vector.add(node9);
        vector.add(node10);
        assertEquals(c.desviacion(vector),542.671,1);

    }



}
