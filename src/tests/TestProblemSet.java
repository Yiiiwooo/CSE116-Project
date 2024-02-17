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

    // TODO: Write testing for all 3 methods of the ratings.ProblemSet class


}