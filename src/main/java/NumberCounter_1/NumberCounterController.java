package NumberCounter_1;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NumberCounterController {
    public Label countLabel;
    public Button increaseButton;
    public Button decreaseButton;
    private long counter = 0;

    public void initialize() {
        countLabel.setText("0");
    }

    public void increase(ActionEvent event) {
        counter++;
        countLabel.setText(counter + "");
    }

    public void decrease(ActionEvent event) {
        counter--;
        countLabel.setText(counter + "");
    }
}
