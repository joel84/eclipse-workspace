package application;

import java.awt.Label;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {
    @FXML
	private javafx.scene.control.Label myMessage;
	public void generateRandom (ActionEvent event) {
		Random rand = new Random();
		int myrand = rand.nextInt(50) + 1;
		myMessage.setText(Integer.toString(myrand));
		//System.out.println(Integer.toString(myrand));
	}
}
