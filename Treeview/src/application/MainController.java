package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Icon;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

	@FXML
	TreeView<String> treeView;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/Download1.png"));
	Image icon2 = new Image(getClass().getResourceAsStream("/img/Foldericon.png"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		TreeItem<String> root = new TreeItem<String>("Root", new ImageView(icon));
		root.setExpanded(true);
		
		TreeItem<String> nodeA = new TreeItem<String>("node A", new ImageView(icon2));
		TreeItem<String> nodeB = new TreeItem<String>("node B", new ImageView(icon2));
		TreeItem<String> nodeC = new TreeItem<String>("node C", new ImageView(icon2));
		root.getChildren().add(nodeA);
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);
		nodeA.setExpanded(true);
		
		TreeItem<String> nodeA1 = new TreeItem<String>("node A1", new ImageView(icon2));
		TreeItem<String> nodeB1 = new TreeItem<String>("node B1", new ImageView(icon2));
		TreeItem<String> nodeC1 = new TreeItem<String>("node C1", new ImageView(icon2));
		nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);
		treeView.setRoot(root);
		
	}
	
	public void mouseClick (MouseEvent mouseEvent) {
		if (mouseEvent.getClickCount() == 2) {
			
		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
		System.out.println(item.getValue());
		}
	}
}
	
