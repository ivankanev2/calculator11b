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

    public void onDigitClick1(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 1);
    }
    public void onDigitClick2(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 2);
    }
    public void onDigitClick3(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 3);
    }
    public void onDigitClick4(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 4);
    }
    public void onDigitClick5(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 5);
    }
    public void onDigitClick6(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 6);
    }
    public void onDigitClick7(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 7);
    }
    public void onDigitClick8(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 8);
    }
    public void onDigitClick9(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 9);
    }
    public void onDigitClick0(ActionEvent actionEvent) {
        digits.setText(digits.getText() + 0);
    }
}