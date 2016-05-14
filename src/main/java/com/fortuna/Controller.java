package com.fortuna;

import java.util.Scanner;

/**
 * Created on 12.05.2016.
 */
public class Controller {

    //Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void userMethod(){
        view.printMessage(view.TASK_INPUT_DATA);

        Scanner scan = new Scanner(System.in);
        model.setTriangleSideA(inputData(scan));
        model.setTriangleSideB(inputData(scan));
        model.setTriangleSideC(inputData(scan));

        view.printMessageAndResult(view.HALF_PERIMETER, model.half_perimeter());
        view.printMessageAndResult(view.SQUARE, model.square());
    }

    public int inputData(Scanner scan){

        view.printMessage(view.INPUT_DATA);
        int num;

        while (true) {
            if (!scan.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_DATA);
                scan.next();
            } else {
                num = scan.nextInt();
                if (num > 0)
                    break;
                else {
                    view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_DATA);
                }
            }
        }
        return num;
    }
}
