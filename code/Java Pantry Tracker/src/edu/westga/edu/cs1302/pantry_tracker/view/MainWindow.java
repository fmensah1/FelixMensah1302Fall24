package edu.westga.edu.cs1302.pantry_tracker.view;

import edu.westga.edu.cs1302.pantry_tracker.model.Food;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Code behind for the MainWindow of the application
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class MainWindow {

	@FXML
	private ComboBox<String> foodTypeComboBox;

	@FXML
	private ListView<Food> foodListView;

	@FXML
	private TextField name;
	
	@FXML
	private TextField quantity;

	@FXML
	void addFood(ActionEvent event) {
		String foodName = this.name.getText();
		try {
			String foodType = this.foodTypeComboBox.getValue();
			Food food = new Food(foodName, foodType);
			this.foodListView.getItems().add(food);
            this.foodTypeComboBox.getSelectionModel();
            this.name.clear();
            this.foodTypeComboBox.getSelectionModel().clearSelection();

		} catch (IllegalArgumentException errorObject) {

			Alert errorPopup = new Alert(Alert.AlertType.ERROR);
			errorPopup.setContentText("Unable to add food: " + errorObject.getMessage());
			errorPopup.showAndWait();
		}
	}

		@FXML
	    void setQuantity(ActionEvent event) {
			try {
		        
		        Food selectedFood = this.foodListView.getSelectionModel().getSelectedItem();
		        if (selectedFood != null) {
		            int newQuantity = Integer.parseInt(this.quantity.getText());
		            selectedFood.setQuantity(newQuantity);
		            this.foodListView.refresh();
		            this.quantity.clear();
		        } else {
		            throw new IllegalArgumentException("No food item selected. Please select a food item.");
		        }

		    } catch (NumberFormatException errorThing) {
		        // Handle invalid number input
		        Alert errorPopup = new Alert(Alert.AlertType.ERROR);
		        errorPopup.setContentText("Invalid quantity: " + errorThing.getMessage() + ". Please enter a valid number.");
		        errorPopup.showAndWait();
		    } catch (IllegalArgumentException errorThing) {
		        // Handle other invalid input
		        Alert errorPopup = new Alert(Alert.AlertType.ERROR);
		        errorPopup.setContentText("Unable to set quantity: " + errorThing.getMessage());
		        errorPopup.showAndWait();
		    }
		}
				
	   @FXML
	    void decreaseQuantity(ActionEvent event) {
		  try {
		        
			  Food selectedFood = this.foodListView.getSelectionModel().getSelectedItem();
		        if (selectedFood != null) {
		            int currentQuantity = selectedFood.getQuantity();
		            if (currentQuantity > 0) {
		                selectedFood.decrementQuantity();
		                this.foodListView.refresh();
		            } else {
		                throw new IllegalArgumentException("Quantity cannot be less than 0.");
		            }
		        } else {
		            throw new IllegalArgumentException("No food item selected. Please select a food item.");
		        }
		    } catch (IllegalArgumentException errorThing) {
		        Alert errorPopup = new Alert(Alert.AlertType.ERROR);
		        errorPopup.setContentText("Unable to decrease quantity: " + errorThing.getMessage());
		        errorPopup.showAndWait();
		    }
		}

	    @FXML
	    void increaseQuantity(ActionEvent event) {
	    	 try {
	    	        Food selectedFood = this.foodListView.getSelectionModel().getSelectedItem();
	    	        if (selectedFood != null) {
	    	            selectedFood.incrementQuantity();
	    	            this.foodListView.refresh();
	    	        } else {
	    	            throw new IllegalArgumentException("No food item selected. Please select a food item.");
	    	        }
	    	    } catch (IllegalArgumentException errorThing) {
	    	        Alert errorPopup = new Alert(Alert.AlertType.ERROR);
	    	        errorPopup.setContentText("Unable to increment quantity: " + errorThing.getMessage());
	    	        errorPopup.showAndWait();
	    	    }
	    }

	@FXML
	void initialize() {
		assert this.foodTypeComboBox != null
				: "fx:id=\"foodTypeComboBox\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert this.foodListView != null : "fx:id=\"foods\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert this.name != null : "fx:id=\"name\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert this.name != null : "fx:id=\"name\" was not injected: check your FXML file 'MainWindow.fxml'.";
	    assert this.quantity != null : "fx:id=\"quantity\" was not injected: check your FXML file 'MainWindow.fxml'.";
	        	
		this.foodTypeComboBox.getItems().add("Vegetable");
		this.foodTypeComboBox.getItems().add("Meat");
		this.foodTypeComboBox.getItems().add("Bread");
		this.foodTypeComboBox.getItems().add("Fruit");
		this.foodTypeComboBox.getItems().add("Dessert");
		this.foodTypeComboBox.getItems().add("Ingredient");
	}

}
