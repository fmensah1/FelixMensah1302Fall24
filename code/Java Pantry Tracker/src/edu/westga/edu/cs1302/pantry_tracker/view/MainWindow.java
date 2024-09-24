package edu.westga.edu.cs1302.pantry_tracker.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Code behind for the MainWindow of the application.
 * 
 * 
 *  @author CS 1302
 *  @veersion Fall 2024
 */
public class MainWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name;

    @FXML
    private ListView<String> student;
    
    @FXML
    private ComboBox<String> foodType;


    @FXML
    void addStudent(ActionEvent event) {
    	String studentName = this.name.getText();
    	this.student.getItems().add(studentName);

    }

    @FXML
    void removeStudent(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert this.name != null : "fx:id=\"name\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.student != null : "fx:id=\"student\" was not injected: check your FXML file 'MainWindow.fxml'.";

    }

}
