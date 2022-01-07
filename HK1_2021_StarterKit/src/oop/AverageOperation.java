package oop;

import java.util.ArrayList;

public class AverageOperation extends CalculationOperation{

    private ArrayList<Double> listOfValues = new ArrayList<>();
    private double result;

    public AverageOperation(String name, ArrayList<Double> listOfValues) {
        super(name);
        this.listOfValues = listOfValues;
    }

    public void add(double value){
        listOfValues.add(value);
    }

    @Override
    public void doCalculation() {
        int vSum = 0;
        int vCount = 0;
        for (Double listOfValue : listOfValues) {
            vCount++;
            vSum += listOfValue;

        }
        result = vSum/ (vCount*1.0);

    }

    @Override
    public void printResult() {
        System.out.println("Der Durchschnitt beträgt " +result);

    }

    @Override
    public String toString() {
        return "AverageOperation{" +
                "listOfValues= " + listOfValues +
                ", result= " + result +
                '}';
    }
}
