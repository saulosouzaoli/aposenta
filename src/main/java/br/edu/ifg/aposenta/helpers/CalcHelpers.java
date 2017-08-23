package br.edu.ifg.aposenta.helpers;

import java.util.List;

/**
 * Created by diogodil on 22/08/17.
 */
public class CalcHelpers {

    public Double doCalc(List<Double> salarys, Integer monthWorks) {
        Double sumSalary = 0.0, meanSalary = 0.0, sumParcialPercentege = 0.0;
        sumSalary = salarys.stream().mapToDouble(i -> i).sum();
        meanSalary = sumSalary / salarys.size();
        sumParcialPercentege = meanSalary * 0.7;
        return this.verifySalaryMax(this.calcExtraTime(sumParcialPercentege, monthWorks));
    }

    private Double calcExtraTime(Double sumParcialPercentege, Integer yearWorked) {

        Double valueExtra = 0.0, valuePercentage = 0.0, currentValue = 0.0;
        Integer timeExtra = 0;

        if (yearWorked > 25) {
            timeExtra = yearWorked - 25;
            valueExtra = timeExtra * 0.015;
            valuePercentage = sumParcialPercentege * valueExtra;
            currentValue = sumParcialPercentege + valuePercentage;
        }

        if (yearWorked > 30) {
            timeExtra = yearWorked - 30;
            valueExtra = timeExtra * 0.002;
            valuePercentage = sumParcialPercentege * valueExtra;
            currentValue = sumParcialPercentege + valuePercentage;
        }

        if (yearWorked > 35) {
            timeExtra = yearWorked - 35;
            valueExtra = timeExtra * 0.025;
            valuePercentage = sumParcialPercentege * valueExtra;
            currentValue = sumParcialPercentege + valuePercentage;
        }


        return currentValue;
    }

    private Double verifySalaryMax(Double atualValue) {
        Double maxValue = 5531.31;

        if (atualValue > maxValue) {
            return maxValue;
        }
        return atualValue;
    }
}
