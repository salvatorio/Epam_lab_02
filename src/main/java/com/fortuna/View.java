package com.fortuna;

/**
 * Created on 12.05.2016.
 */
public class View {

    // Text's constants
    public static final String TASK_INPUT_DATA = "You have to input 3 POSITIVE INT values! ";
    public static final String INPUT_DATA = "Input INT value: ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Value must be INT and POSITIVE! Repeat please! ";
    public static final String HALF_PERIMETER = "Half perimeter = ";
    public static final String SQUARE = "Square = ";

    public void printMessage (String message){
        System.out.println(message);
    }

    public void printMessageAndResult (String message, double value){
        System.out.println(message + value);
    }
}
