package PasswordValidator_8;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.paint.Color;

public class PasswordValidatorController {
    public PasswordField passwordTextField;
    public Label statusLabel;

    public void initialize() {
        passwordTextField.textProperty().addListener((obs, oldText, newText) -> {
                validatePassword(newText);
        });
        statusLabel.setText("");
    }

    public void validatePassword(String password) {
        if (password.length() < 8) {
            statusLabel.setText("Password must be 8 characters long");
            statusLabel.setTextFill(Color.RED);
            return;
        }
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                hasSpecial = true;
            }
        }
        if (!hasDigit) {
            statusLabel.setText("Password must contain at least one digit");
            statusLabel.setTextFill(Color.RED);
            return;
        }
        if (!hasSpecial) {
            statusLabel.setText("Password must contain at least one special charcter");
            statusLabel.setTextFill(Color.RED);
            return;
        }
        statusLabel.setText("Password is valid");
        statusLabel.setTextFill(Color.GREEN);
    }
}
