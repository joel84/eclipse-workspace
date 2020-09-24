package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable{

	@FXML private WebView webview;
	private WebEngine engine;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		engine = webview.getEngine();
		
	}
	
	public void bt1 (ActionEvent event) {
		engine.load("https://www.google.com");
	}
	
	public void bt2 (ActionEvent event) {
		engine.executeScript("window.location = \"http://easyonlineconverter.com//\";");  //for Javascript
	}
	
	public void bt3 (ActionEvent event) {
		engine.loadContent("<html><body><h1>Hello World</h1><body></html>");    //for html
	}
	
	public void bt4 (ActionEvent event) {
		engine.reload();
	}

}
