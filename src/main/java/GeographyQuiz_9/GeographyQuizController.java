package GeographyQuiz_9;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GeographyQuizController {
    public Label question;
    public TextField questionTextField;
    public Label scoreLabel;
    public Button nextButton;
    public Button backButton;

    private int currentQuestion = 0;
    private String[] questions = {"What is the capital of France?",
                        "What is the capital of Japan?",
                        "What is the capital of Germany",
                        "Congratulations! You have\nfinished the quiz."};
    private String[] answers = {"Paris", "Tokyo", "Berlin", ""};
    private String[] inputs = {"", "", "", ""};
    private int[] scores = {0, 0, 0, 0};

    public void initialize() {
        scoreLabel.setText("Your Score: 0/3");
        question.setText(questions[0]);
        questionTextField.setText("");
        backButton.setVisible(false);
    }

    public void next(ActionEvent event) {
        String answer = questionTextField.getText();
        scores[currentQuestion] = answer.equalsIgnoreCase(answers[currentQuestion]) ? 1 : 0;
        inputs[currentQuestion] = answer;
        currentQuestion++;
        scoreLabel.setText("Your Score: " + (scores[0] + scores[1] + scores[2]) + "/3");
        question.setText(questions[currentQuestion]);
        questionTextField.setText(inputs[currentQuestion]);
        questionTextField.setVisible(currentQuestion != 3);
        backButton.setVisible(true);
        nextButton.setVisible(currentQuestion != 3);
    }

    public void back(ActionEvent event) {
        String answer = questionTextField.getText();
        scores[currentQuestion] = answer.equalsIgnoreCase(answers[currentQuestion]) ? 1 : 0;
        inputs[currentQuestion] = answer;
        --currentQuestion;
        scoreLabel.setText("Your Score: " + (scores[0] + scores[1] + scores[2]) + "/3");
        question.setText(questions[currentQuestion]);
        questionTextField.setText(inputs[currentQuestion]);
        questionTextField.setVisible(true);
        backButton.setVisible(currentQuestion != 0);
        nextButton.setVisible(true);
    }
}
