package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int number : arr){
            sum += number;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] resultArray = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            resultArray[arr.length - i - 1] = arr[i];
        }
        return resultArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int length = 0;
        for (int x : arr){
            if(x > 0){
                length++;
            }
        }
        int[] result = new int[length];
        int index = 0;
        for (int x : arr){
            if(x > 0){
                result[index] = x;
                index++;
            }
        }
        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int[] x : arr) {
            int index = 0;
            if(x.length > 1) {
                while (index < x.length) {
                    if (index == 0) {
                        index++;
                    }
                    if (x[index] >= x[index - 1]) {
                        index++;
                    } else {
                        int temp;
                        temp = x[index];
                        x[index] = x[index - 1];
                        x[index - 1] = temp;
                        index--;
                    }
                }
            }
        }

        int index = 0;
        while (index < arr.length) {
            if (index == 0) {
                index++;
            }
            if (arr[index].length >= arr[index - 1].length) {
                index++;
            }
            else {
                int[] temp;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
    }
}
