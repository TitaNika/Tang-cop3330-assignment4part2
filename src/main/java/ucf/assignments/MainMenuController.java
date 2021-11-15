/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tony Tang
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private MenuItem CreateNew;

    @FXML
    private MenuItem Open;

    @FXML
    private MenuItem Save;

    @FXML
    void CreateNewClicked(ActionEvent event) throws IOException {

        FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("Create New.fxml"));
        Scene newScene = new Scene(fxml.load(), 600, 400);
        Stage newStage = new Stage();

        newStage.setScene(newScene);

        newStage.show();

    }

    @FXML
    void OpenList(ActionEvent event) {

    }

    @FXML
    void SaveList(ActionEvent event) {

    }

    @FXML
    private TextField CreateName;

    @FXML
    private DatePicker CreateDate;

    @FXML
    private TextArea CreateDescription;

    @FXML
    private Button CreateList;

    @FXML
    void CreateList(ActionEvent event) {

    }

}
