package oop;

public class FactorialOperation extends CalculationOperation{

    private int value;
    private int result;

    public FactorialOperation(String name, int value) {
        super(name);
        this.value = value;
    }

    @Override
    public void doCalculation() {
        int next =0;
        for (int zaehler = 0; zaehler <= this.value ; zaehler++) {
            next++;
            result = next * (next-1);

        }

    }

    @Override
    public void printResult() {
        System.out.println("Die Fakultät für " + value + " lautet " +result);

    }

    @Override
    public String toString() {
        return "FactorialOperation{" +
                "value= " + value +
                ", result= " + result +
                '}';
    }
}
