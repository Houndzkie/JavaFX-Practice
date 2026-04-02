package CharacterCounter_5;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CharacterCounterController {
    public TextArea messageTextArea;
    public TextField characterTextField;
    public Button countButton;
    public Label countLabel;

    public void initialize() {
        characterTextField.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().length() <= 1) {
                return change;
            }
            return null;
        }));
        countLabel.setText("");
        messageTextArea.setWrapText(true);
    }

    public void count(ActionEvent event) {
        if (characterTextField.getText().isEmpty()) {
            countLabel.setText(String.valueOf(0));
            return;
        }
        char c = characterTextField.getText().charAt(0);
        String message = messageTextArea.getText();
        long cnt = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == c) cnt++;
        }
        countLabel.setText(String.valueOf(cnt));
    }
}
