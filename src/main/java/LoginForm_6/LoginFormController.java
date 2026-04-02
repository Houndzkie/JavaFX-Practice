package LoginForm_6;

import javafx.scene.control.*;

public class LoginFormController {
    public TextField usernameTextField;
    public PasswordField passwordTextField;
    public Button loginButton;

    public void login() {
        boolean success = usernameTextField.getText().equals("admin") && passwordTextField.getText().equals("admin");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Status");
        alert.setHeaderText(null);
        alert.setContentText(success ? "Login Successful!" : "Login Failed!");
        alert.showAndWait();
    }
}
