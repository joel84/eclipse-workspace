package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController {

	@FXML PieChart piechart;
	@FXML Label lblstatus;
	
	public void btn (ActionEvent event) {
		ObservableList<javafx.scene.chart.PieChart.Data> list = FXCollections.observableArrayList(
				new PieChart.Data("Java", 50),
				new PieChart.Data("c++", 20),
				new PieChart.Data("Python", 30),
				new PieChart.Data("c#", 10),
				new PieChart.Data("c", 15)
				);
		piechart.setData(list);
		
		for (final PieChart.Data data : piechart.getData()) {
			data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					lblstatus.setText(String.valueOf(data.getPieValue()) + "%");
					
				}
			});
		}
	}
}
