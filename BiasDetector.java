package service;

import java.util.*;
import model.AIDecision;

public class BiasDetector {

    public static double calculateSPD(List<AIDecision> data) {

        int maleTotal = 0, maleApproved = 0;
        int femaleTotal = 0, femaleApproved = 0;

        for (AIDecision d : data) {
            if (d.getGender().equalsIgnoreCase("Male")) {
                maleTotal++;
                if (d.isApproved()) maleApproved++;
            } else if (d.getGender().equalsIgnoreCase("Female")) {
                femaleTotal++;
                if (d.isApproved()) femaleApproved++;
            }
        }

        double maleRate = (double) maleApproved / maleTotal;
        double femaleRate = (double) femaleApproved / femaleTotal;

        return maleRate - femaleRate;
    }
}