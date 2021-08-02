package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> { //generic type, see assessment 2

    T[] inputArray;
    public ArrayUtility() {}

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count = 0;

        for (int i = 0; i < arrayToMerge.length; i++) {
            if (arrayToMerge[i].equals(valueToEvaluate)) {
                count++;
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals(valueToEvaluate)) {
                count++;
            }
        }

        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T mostCommon = null; //had to initial, suggested was null

        for (int i = 0; i < inputArray.length; i++) {
            for(int j = 0; j < arrayToMerge.length; j++) {
                if (inputArray[i].equals(arrayToMerge[j])) {
                    mostCommon = inputArray[i];
                }
            }
        }

        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }

        return count;
    }

    public T[] removeValue(T valueToRemove) {

        Integer numOfOccurrences = this.getNumberOfOccurrences(valueToRemove);
        Integer newArr = inputArray.length - numOfOccurrences;
        T[] removedArray = Arrays.copyOf(inputArray, newArr);


        for (int i = 0, j = 0; i < inputArray.length; i++) { // new array will build with out removed vals
            if (inputArray[i] != valueToRemove) {
                removedArray[j] = inputArray[i];
                j++;
            }
        }
        return removedArray;
    }


}
