package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Label welcomeText;
    public TextArea digits;

    @FXML
    protected void onHelloButtonClick() {
    }
    protected void onDigitClick(int x){
        welcomeText.setText(welcomeText.getText() + x);
    }

    public void onDigitClick(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 1);
    }
}