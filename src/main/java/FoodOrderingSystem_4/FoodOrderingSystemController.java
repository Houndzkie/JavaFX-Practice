package FoodOrderingSystem_4;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class FoodOrderingSystemController {
    public CheckBox cPizza;
    public CheckBox cBurger;
    public CheckBox cFries;
    public CheckBox cSoftDrinks;
    public CheckBox cTea;
    public CheckBox cSundae;
    public ToggleGroup group;
    public RadioButton rbNone;
    public RadioButton rb5;
    public RadioButton rb10;
    public RadioButton rb15;
    public Button btnOrder;

    public void initialize() {
        group = new ToggleGroup();
        rbNone.setToggleGroup(group);
        rb5.setToggleGroup(group);
        rb10.setToggleGroup(group);
        rb15.setToggleGroup(group);
    }

    public void order(ActionEvent event) {
        double total = 0;

        if (cPizza.isSelected()) total += 100;
        if (cBurger.isSelected()) total += 80;
        if (cFries.isSelected()) total += 65;
        if (cSoftDrinks.isSelected()) total += 55;
        if (cTea.isSelected()) total += 50;
        if (cSundae.isSelected()) total += 40;

        String message = "The total price is Php ";

        if (rb5.isSelected()) message += String.format("%.2f", total * 0.95);
        else if (rb10.isSelected()) message += String.format("%.2f", total * 0.9);
        else if (rb15.isSelected()) message += String.format("%.2f", total * 0.85);
        else message += String.format("%.2f", total);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Order");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
