package main;

import java.util.*;
import model.AIDecision;
import service.AISimulator;
import monitor.BiasMonitor;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" REAL-TIME ETHICAL BIAS DETECTION SYSTEM ");
        System.out.println("==========================================");

        List<AIDecision> decisions = AISimulator.generateDecisions();

        BiasMonitor.monitorDecisions(decisions);
    }
}