package com.example.javafxstartproject.tabs;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

import java.net.URL;
import java.util.ResourceBundle;

public class BreakSubstitutionsChiffren extends Tab implements Initializable {
    @FXML
    private Label presentLabel;


    public BreakSubstitutionsChiffren() {
        super("Break Substitutions Chiffren");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        presentLabel.setText("This is the Break Substitutions Chiffren tab");
    }
}
