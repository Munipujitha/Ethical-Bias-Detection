package monitor;

import java.util.*;
import model.AIDecision;
import service.BiasDetector;

public class BiasMonitor {

    private static final double THRESHOLD = 0.2;

    public static void monitorDecisions(List<AIDecision> decisions) {

        double spd = BiasDetector.calculateSPD(decisions);

        System.out.println("Statistical Parity Difference: " + spd);

        if (Math.abs(spd) > THRESHOLD) {
            System.out.println("⚠️ ETHICAL BIAS DETECTED");
            System.out.println("Mitigation Action: Output flagged for review");
        } else {
            System.out.println("✅ AI output is ethically fair");
        }
    }
}