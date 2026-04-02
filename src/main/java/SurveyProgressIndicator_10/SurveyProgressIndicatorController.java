package SurveyProgressIndicator_10;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class SurveyProgressIndicatorController {
    public ProgressBar progressBar;
    public TextField nameField;
    public TextField birthField;
    public TextField genderField;
    public TextField numberField;
    public TextField emailField;
    public Button submitButton;
    public Label messageLabel;

    private TextField[] fields;

    public void initialize() {
        messageLabel.setText("");
        progressBar.setProgress(0);

        fields = new TextField[] {
                nameField, birthField, genderField, numberField, emailField
        };

        for (TextField field : fields) {
            field.textProperty().addListener((obs, oldText, newText) -> updateProgress());
        }
    }

    private void updateProgress() {
        int filled = 0;

        for (TextField field : fields) {
            if (!field.getText().trim().isEmpty()) {
                filled++;
            }
        }

        double progress = filled / (double) fields.length;
        progressBar.setProgress(progress);
    }

    public void submit(ActionEvent event) {
        if (progressBar.getProgress() == 1.0) {
            messageLabel.setText("Thank you for answering");
        } else {
            messageLabel.setText("All fields are required");
        }
    }
}