package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String lastElement = "";
        if(array.length>0){
             lastElement = array[array.length-1];
            System.out.println(lastElement+ " is the last element");
        }else{
            System.out.println("Array is empty");
        }
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String lastElement = "";
        if(array.length>0){
            lastElement = array[array.length-2];
            System.out.println(lastElement+ " is the last element");
        }else{
            System.out.println("Array is empty");
        }
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i<array.length;i++) {
            if (array[i].equalsIgnoreCase(value)){

            }else{return true;}
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       String[] reversed = new String [array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i]; // Assign elements in reverse order
        }
            return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = new String [array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
            if(array.equals(reversed)) {
            }

            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //pangram has all letter in a sentence/
        //check the chars in an array
        //see if each is equal to each letter of the alphabetString alphabet ="qwertyuioplkjhgfdsazxcvbnm";
       String alphabet = "qwertyuioasdfghjklzxcvbnm";
        String text = String.join(" ",array).toLowerCase();
        for(int i = 0; i<array.length; i++){
            char letter  =  alphabet.charAt(i);
            if (!text.contains(String.valueOf(alphabet.charAt(i)))) {
                return false;
               }
           }


        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i].equals(value)){
                counter ++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       String[] newArr = new String[array.length-1];
       int index = 0;
        for(int i = 0 ; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                newArr[index++]=array[i];
            }
        }
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        int uniqueCount=1;
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        result[0] = array[0];
        int index = 1;

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                result[index++] = array[i];
            }
        }

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> resultList = new ArrayList<>();

        StringBuilder currentGroup = new StringBuilder();

        currentGroup.append(array[0]);

        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i - 1]) {

                currentGroup.append(array[i]);
            } else {
                resultList.add(currentGroup.toString());
                currentGroup = new StringBuilder();
                currentGroup.append(array[i]);
            }
        }

        resultList.add(currentGroup.toString());

        return resultList.toArray(new String[0]);
    }

}