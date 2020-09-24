package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {

	@FXML private DatePicker dp;
	@FXML private Label showdatelbl;
	
	public void showDate (ActionEvent event) {
		LocalDate ld = dp.getValue();
		showdatelbl.setText(ld.toString());
	}
}
