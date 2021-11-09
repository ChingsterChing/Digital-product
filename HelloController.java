package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button aboutUsButton;

    @FXML
    private Label aboutUslbl1;

    @FXML
    private Label aboutUslbl2;

    @FXML
    private Button backButton;

    @FXML
    private Button foodButton;

    @FXML
    private Button glassAndMetalButton;

    @FXML
    private Button howToButton;

    @FXML
    private Label howTolbl1;

    @FXML
    private Label howTolbl2;

    @FXML
    private Button paperButton;

    @FXML
    private Button plasticButton;

    @FXML
    private Button residualWasteButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Label settingslbl;

    @FXML
    void aboutUsButton1(ActionEvent event) {
        aboutUslbl1.setOpacity(1);
        aboutUslbl2.setOpacity(1);

        aboutUsButton.setVisible(false);
        aboutUsButton.setDisable(true);

        howToButton.setVisible(false);
        howToButton.setDisable(true);

        settingsButton.setVisible(false);
        settingsButton.setDisable(true);

        backButton.setOpacity(1);
    }

    @FXML
    void backButton1(ActionEvent event) {
        aboutUsButton.setVisible(true);
        aboutUsButton.setDisable(false);

        howToButton.setVisible(true);
        howToButton.setDisable(false);

        settingsButton.setVisible(true);
        settingsButton.setDisable(false);

        howTolbl1.setOpacity(0);
        howTolbl2.setOpacity(0);

        aboutUslbl1.setOpacity(0);
        aboutUslbl2.setOpacity(0);

        settingslbl.setOpacity(0);

        paperButton.setOpacity(0);
        plasticButton.setOpacity(0);
        foodButton.setOpacity(0);
        residualWasteButton.setOpacity(0);
        glassAndMetalButton.setOpacity(0);

        backButton.setOpacity(0);
    }

    @FXML
    void foodButton1(ActionEvent event) {
        foodButton.setVisible(false);
        foodButton.setDisable(true);
    }

    @FXML
    void glassAndMetalButton1(ActionEvent event) {
        glassAndMetalButton.setVisible(false);
        glassAndMetalButton.setDisable(true);
    }

    @FXML
    void howToButton1(ActionEvent event) {
        howTolbl1.setOpacity(1);
        howTolbl2.setOpacity(1);

        aboutUsButton.setVisible(false);
        aboutUsButton.setDisable(true);

        howToButton.setVisible(false);
        howToButton.setDisable(true);

        settingsButton.setVisible(false);
        settingsButton.setDisable(true);

        backButton.setOpacity(1);
    }

    @FXML
    void paperButton1(ActionEvent event) {
        paperButton.setVisible(false);
        paperButton.setDisable(true);
    }

    @FXML
    void plasticButton1(ActionEvent event) {
        plasticButton.setVisible(false);
        plasticButton.setDisable(true);
    }

    @FXML
    void residualWasteButton(ActionEvent event) {
        residualWasteButton.setVisible(false);
        residualWasteButton.setDisable(true);
    }

    @FXML
    void settingsButton1(ActionEvent event) {
        settingslbl.setOpacity(1);

        paperButton.setOpacity(1);
        foodButton.setOpacity(1);
        plasticButton.setOpacity(1);
        residualWasteButton.setOpacity(1);
        glassAndMetalButton.setOpacity(1);

        residualWasteButton.setVisible(true);
        residualWasteButton.setDisable(false);

        plasticButton.setVisible(true);
        plasticButton.setDisable(false);

        paperButton.setVisible(true);
        paperButton.setDisable(false);

        glassAndMetalButton.setVisible(true);
        glassAndMetalButton.setDisable(false);

        foodButton.setVisible(true);
        foodButton.setDisable(false);

        aboutUsButton.setVisible(false);
        aboutUsButton.setDisable(true);

        howToButton.setVisible(false);
        howToButton.setDisable(true);

        settingsButton.setVisible(false);
        settingsButton.setDisable(true);

        backButton.setOpacity(1);
    }

}
