package com.example.javafxstartproject;

import com.example.javafxstartproject.tabs.BreakSubstitutionsChiffren;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TabPane tabPane;
    @FXML
    private BreakSubstitutionsChiffren knackSubstChifr;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tabPane.getTabs().add(knackSubstChifr);
    }


}