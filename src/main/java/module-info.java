module com.example.javafxpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires javafx.graphics;

    opens CharacterRemover_3 to javafx.fxml;
    exports CharacterRemover_3;
    opens CharacterCounter_5 to javafx.fxml;
    exports CharacterCounter_5;
    opens FoodOrderingSystem_4 to javafx.fxml;
    exports FoodOrderingSystem_4;
    opens GeographyQuiz_9 to javafx.fxml;
    exports GeographyQuiz_9;
    opens LoginForm_6 to javafx.fxml;
    exports LoginForm_6;
    opens NumberCounter_1 to javafx.fxml;
    exports NumberCounter_1;
    opens PasswordValidator_8 to javafx.fxml;
    exports PasswordValidator_8;
    opens PizzaOrderSystem_2 to javafx.fxml;
    exports PizzaOrderSystem_2;
    opens SimpleCalculator_7 to javafx.fxml;
    exports SimpleCalculator_7;
    opens SurveyProgressIndicator_10 to javafx.fxml;
    exports SurveyProgressIndicator_10;
}