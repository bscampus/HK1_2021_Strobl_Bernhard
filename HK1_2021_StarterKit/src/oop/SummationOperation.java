package oop;

public class SummationOperation extends CalculationOperation{

    private int value1;
    private int value2;
    private int result;

    public SummationOperation(String name, int value1, int value2) {
        super(name);
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public void doCalculation() {
        if(this.value1 >0 && this.value2>0) {
            result = value1 + value2;
        }
        else if  (this.value1 < 0 && this.value2 <0) {
            result = (value1*-1) + (value2*-1);
        }
        else if (this.value1 < 0) {
            result = (value1*-1) + value2;
        }
        else if (this.value2 < 0) {
            result = value1 + (value2*-1);
        }
    }

    @Override
    public void printResult() {
        System.out.println("Das Ergebnis von "+value1 +" + " +value2 +" lautet " +result);

    }

    @Override
    public String toString() {
        return "SummationOperation{" +
                "value1= " + value1 +
                ", value2= " + value2 +
                ", result= " + result +
                '}';
    }
}
