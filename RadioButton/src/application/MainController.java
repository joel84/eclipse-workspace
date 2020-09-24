package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {

	@FXML private RadioButton rb1;
	@FXML private RadioButton rb2;
	@FXML private Label lbl;
	
	public void radioSelect (ActionEvent event) {
		String message = "";
		if (rb1.isSelected()) {
			message += rb1.getText() + "\n";
		}
		if (rb2.isSelected()) {
			message += rb2.getText() + "\n";
		}
		lbl.setText(message);
	}
	
	
}
