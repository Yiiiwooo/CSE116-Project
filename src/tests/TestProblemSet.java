package tests;

import org.junit.Test;
import ratings.ProblemSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestProblemSet {
    @Test
    public void pb1(){
        ArrayList<Double> ts1 = new ArrayList<Double>();
        ArrayList<Double> ts2 = new ArrayList<Double>();
        ArrayList<Double> ts3 = new ArrayList<Double>();
        ArrayList<Double> ts4 = new ArrayList<Double>();

        ts1.add(1.0);
        ts1.add(2.0);
        ts1.add(3.0);

        ts3.add(1.0);
        ts3.add(2.0);
        ts3.add(3.0);
        ts3.add(4.0);
        ts3.add(5.0);
        ts3.add(6.0);
        ts3.add(7.0);
        ts3.add(8.0);
        ts3.add(9.0);
        ts3.add(10.0);
        ts3.add(11.0);
        ts3.add(12.0);
        ts3.add(13.0);
        ts3.add(14.0);
        ts3.add(15.0);

        ts4.add(1.0);

        assertEquals(2.0,ProblemSet.average(ts1),0.001);
        assertEquals(0.0,ProblemSet.average(ts2),0.001);
        assertEquals(8.0,ProblemSet.average(ts3),0.001);
        assertEquals(1.0,ProblemSet.average(ts4),0.001);

    }
    @Test
    public void tb2(){
        assertEquals(6.0,ProblemSet.sumOfDigits(123),0.001);
        assertEquals(12.0,ProblemSet.sumOfDigits(57),0.001);
        assertEquals(9.0,ProblemSet.sumOfDigits(-36),0.001);

    }
    @Test
    public void tb3(){
        HashMap<String,Integer> ts1 = new HashMap<String,Integer>();
        HashMap<String,Integer> ts2 = new HashMap<String,Integer>();
        HashMap<String,Integer> ts3 = new HashMap<String,Integer>();
        HashMap<String,Integer> ts4 = new HashMap<String,Integer>();

        ts1.put("CSE",100);
        ts1.put("MTH",90);
        ts1.put("MGT",10);
        ts2.put("CAT",5);
        ts2.put("DOG",5);
        ts2.put("FOX",4);
        ts3.put("QWQ",-8);
        ts3.put("QVQ",-2);
        ts3.put("QAQ",-7);

        assertEquals("CSE",ProblemSet.bestKey(ts1));
        assertTrue(ProblemSet.bestKey(ts2).equals("CAT") || ProblemSet.bestKey(ts2).equals("DOG"));
        assertEquals("QVQ",ProblemSet.bestKey(ts3));
        assertEquals("",ProblemSet.bestKey(ts4));



    }
    // TODO: Write testing for all 3 methods of the ratings.ProblemSet class



}