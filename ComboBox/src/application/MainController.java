package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable {

	@FXML
	public Label myLabel;
	
	@FXML
	public ComboBox<String> combobox;
	
	@FXML
	public ListView<String> listview;
	
	ObservableList<String> list = FXCollections.observableArrayList("Mark","Tom","John","Jack");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combobox.setItems(list);
		listview.setItems(list);
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void comboChanged (ActionEvent event) {
		combobox.getItems().addAll("Ram","Ben","Steve","Ma");
		myLabel.setText(combobox.getValue());
	}
	
	public void buttonAction (ActionEvent event) {
		// myLabel.setText(combobox.getValue());
		listview.getItems().addAll("Ram","Ben","Steve","Ma");
		
		ObservableList<String> names;
		names = listview.getSelectionModel().getSelectedItems();
		for (String name : names) {
			System.out.println(name);
		}
	}

}
