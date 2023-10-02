package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Label welcomeText;
    public TextArea digits;
    public Button num1;
    public Button num2;
    public Button num3;
    public Button num4;
    public Button num5;
    public Button num6;
    public Button num7;
    public Button num8;
    public Button num9;
    public Button num0;
    public Button divide;
    public Button multiply;
    public Button plus;
    public Button minus;
    public Button equal;
    public Button point;

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
    public void onDigitClickMinus(ActionEvent actionEvent) {
        digits.setText(digits.getText() + "-");
    }
    public void onDigitClickPlus(ActionEvent actionEvent) {
        digits.setText(digits.getText() + "+");
    }
    public void onDigitClickEqual(ActionEvent actionEvent) {
        digits.setText(digits.getText() + "=");
    }
    public void onDigitClickMultiply(ActionEvent actionEvent) {
        digits.setText(digits.getText() + "*");
    }
    public void onDigitClickDivide(ActionEvent actionEvent) {
        digits.setText(digits.getText() + "/");
    }
    public void onDigitClickPoint(ActionEvent actionEvent) {
        digits.setText(digits.getText() + ".");
    }
}