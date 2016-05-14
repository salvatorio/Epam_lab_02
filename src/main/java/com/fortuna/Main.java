package com.fortuna;

/**
 * Created on 12.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.userMethod();

    }
}
