package CharacterRemover_3;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CharacterRemoverController {
    public CheckBox vowelCheckbox;
    public CheckBox consonantCheckbox;
    public CheckBox numberCheckbox;
    public Button removeButton;
    public Button restoreButton;
    public Label textLabel;

    public void remove(ActionEvent event) {
        if (vowelCheckbox.isSelected() && consonantCheckbox.isSelected() && numberCheckbox.isSelected()) {
            textLabel.setText("");
        } else if (vowelCheckbox.isSelected() && consonantCheckbox.isSelected()) {
            textLabel.setText("0123456789");
        } else if (vowelCheckbox.isSelected() && numberCheckbox.isSelected()) {
            textLabel.setText("BCDFGHJKLMNPQRSTVWXYZ");
        } else if (consonantCheckbox.isSelected() && numberCheckbox.isSelected()) {
            textLabel.setText("AEIOU");
        } else if (vowelCheckbox.isSelected()) {
            textLabel.setText("BCDFGHJKLMNPQRSTVWXYZ0123456789");
        } else if (consonantCheckbox.isSelected()) {
            textLabel.setText("AEIOU0123456789");
        } else {
            textLabel.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
    }

    public void restore(ActionEvent event) {
        textLabel.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        vowelCheckbox.setSelected(false);
        consonantCheckbox.setSelected(false);
        numberCheckbox.setSelected(false);
    }
}
