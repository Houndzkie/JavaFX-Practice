package PizzaOrderSystem_2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PizzaOrderSystemController {
    public ChoiceBox<String> pizzaSizeChoice;
    public ChoiceBox<String> pizzaToppingsChoice;
    public ChoiceBox<String> extraCheeseChoice;
    public Label totalLabel;
    public Button calculateButton;

    private String[] sizeChoice = {"Small", "Medium", "Large"};
    private String[] toppingsChoice = {"Mushrooms", "Pepperoni", "Onions"};
    private String[] cheeseChoice = {"Yes", "No"};

    public void initialize() {
        pizzaSizeChoice.getItems().addAll(sizeChoice);
        pizzaToppingsChoice.getItems().addAll(toppingsChoice);
        extraCheeseChoice.getItems().addAll(cheeseChoice);

        pizzaSizeChoice.setValue("Small");
        pizzaToppingsChoice.setValue("Mushrooms");
        extraCheeseChoice.setValue("No");

        totalLabel.setText("0");
    }

    public void calculate(ActionEvent event) {
        String size = pizzaSizeChoice.getValue();
        String extraCheese = extraCheeseChoice.getValue();

        int total = 2;

        switch (size) {
            case "Small":
                total += 10;
                break;
            case "Medium":
                total += 15;
                break;
            case "Large":
                total += 20;
        }

        if ("Yes".equals(extraCheese)) {
            total += 3;
        }

        totalLabel.setText("" + total);
    }
}
