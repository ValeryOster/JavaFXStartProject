package com.example.javafxstartproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextArea plainTextArea;
    @FXML
    private TextArea encodedTextArea;
    @FXML
    private ComboBox<String> moveRangeCbx;
    @FXML
    private Label presentLabel;

    ObservableList<String> observableList = FXCollections.observableArrayList("A", "B", "C", "D",
            "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        moveRangeCbx.setItems(observableList);
    }

    @FXML
    public void onCharMove() {
        moveAlphabetInLabel();
        creaptText();

    }

    private void creaptText() {
        String text = plainTextArea.getText();
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int index = observableList.indexOf(String.valueOf(c));
                newText += presentLabel.getText().charAt(index);
            } else {
                newText += c;
            }
        }
        encodedTextArea.setText(newText);
    }

    private void moveAlphabetInLabel() {
        ObservableList<String> newList = FXCollections.observableArrayList();
        String selectedItem = moveRangeCbx.getSelectionModel().getSelectedItem();
        for (int i = 0; i < observableList.size(); i++) {
            if (observableList.get(i).equals(selectedItem)) {
                for (int j = i; j < observableList.size(); j++) {
                    newList.add(observableList.get(j));
                }
                for (int j = 0; j < i; j++) {
                    newList.add(observableList.get(j));
                }
                break;
            }
        }
        presentLabel.setText(newList.toString().replace("[", "").replace("]", "").replace(",", ""));
    }
}