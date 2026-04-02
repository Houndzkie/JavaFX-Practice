package SimpleCalculator_7;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleCalculatorController {
    public TextField tfNumber1;
    public TextField tfNumber2;
    public ComboBox<Character> cbOperations;
    public Button btnCompute;
    public Label lblResult;

    private Character[] ops = {'+', '-', '*', '/'};

    public void initialize() {
        cbOperations.getItems().addAll(ops);
        cbOperations.setValue(ops[0]);
        btnCompute.setStyle("-fx-font-weight: bold;");
        lblResult.setText("");
    }

    public void computeResult(ActionEvent event) {
        long a = Long.parseLong(tfNumber1.getText());
        long b = Long.parseLong(tfNumber2.getText());

        switch (cbOperations.getValue()) {
            case '+':
                lblResult.setText(a + b + "");
                break;
            case '-':
                lblResult.setText(a - b + "");
                break;
            case '*':
                lblResult.setText(a * b + "");
                break;
            case '/':
                lblResult.setText(a / b + "");
        }
    }
}
