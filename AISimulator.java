package service;

import java.util.*;
import model.AIDecision;

public class AISimulator {

    public static List<AIDecision> generateDecisions() {

        List<AIDecision> decisions = new ArrayList<>();

        // Simulated AI predictions (biased scenario)
        decisions.add(new AIDecision("Male", true));
        decisions.add(new AIDecision("Male", true));
        decisions.add(new AIDecision("Male", false));

        decisions.add(new AIDecision("Female", false));
        decisions.add(new AIDecision("Female", false));
        decisions.add(new AIDecision("Female", true));

        return decisions;
    }
}