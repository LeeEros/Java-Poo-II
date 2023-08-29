package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	public static void setTextFieldInterger(TextField txt){
		txt.textProperty().addListener((obs, oldValue, newValue) ->{
			if(newValue != null && !newValue.matches("\\d*")) {
				
			}
		});
	}
	
	public static void setTextFieldMaxLength() {
		
	}
	
	public static void setTextFieldDouble(TextField txt){
		txt.textProperty().addListener((obs, oldValue, newValue)-> {
			if(newValue != null && newValue.matches("\\d*([\\.]\\d*)?"));
		});
		
	}
}