package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Model.Entites.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class ViewController implements Initializable { 

	@FXML
	private ComboBox<Person> comboBox;
	
	private ObservableList<Person> obsList;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Kayane Alebrante", "kayane@gmail.com"));
		list.add(new Person(2, "Lucas Alebrante", "alebrante@gmail.com"));
		list.add(new Person(1, "Anthony Henry", "anthony@gmail.com"));
		
		obsList = FXCollections.observableArrayList(list);
		comboBox.setItems(obsList);
	}

}
