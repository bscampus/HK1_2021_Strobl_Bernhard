package arrays;

import java.util.Arrays;

public class IndexFinder {

    public static void main(String[] args) {

        int[] arr1 = {0,1,9,7};
        int[] arr2 = {0,1,9,7};

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr2));
        System.out.println("Arrays.toString(arr1) = " + findIndexForNumber(arr1,9));
        System.out.println("Arrays.toString(arr1) = " + findIndexForNumber(arr1,2));

        System.out.println("findIndicesForExpectedSum(arr2,8) = " + findIndicesForExpectedSum(arr2,8));



    }

    public static int findIndexForNumber(int[] numbers, int searchNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == searchNumber){
                return i;
            }
        }
        return -1;
    }

    public static int[] findIndicesForExpectedSum(int[] numbers, int expectedSum) {
        // index previous + ind next summieren und mit expected sum vergleichen
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == expectedSum) {
                    int[] es = {i,j};
                }
            }
            int[] ues = {-1, -1};
        }
        return findIndicesForExpectedSum(numbers,expectedSum);

    }


}
