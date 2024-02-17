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
        assertEquals(0.0,ProblemSet.average(ts2),0.001);
        ts1.add(1.0);
        ts1.add(2.0);
        ts1.add(3.0);
        assertEquals(2.0,ProblemSet.average(ts1),0.001);
    }

    // TODO: Write testing for all 3 methods of the ratings.ProblemSet class


}