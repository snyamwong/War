package edu.wit.comp2000.group23.lists.UI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UIController {
	
	@FXML
	Button test;
	
	public void Test(){
		System.out.println("Works.");
		test.setText("Works.");
		
		
	}
}
