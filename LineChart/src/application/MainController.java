package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

public class MainController {

	@FXML LineChart<String, Number> lineChart;
	@FXML Label lbl;
	
	public void btn (ActionEvent event) {
		lineChart.getData().clear();            //to clear every time you load
		
		XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
		series.getData().add(new XYChart.Data<String, Number>("Jan", 200));
		series.getData().add(new XYChart.Data<String, Number>("Feb", 500));
		series.getData().add(new XYChart.Data<String, Number>("Mar", 300));
		series.getData().add(new XYChart.Data<String, Number>("Apr", 600));
		series.setName("Pay 1");                  //for the legend
		
		XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
		series2.getData().add(new XYChart.Data<String, Number>("Jan", 400));
		series2.getData().add(new XYChart.Data<String, Number>("Feb", 100));
		series2.getData().add(new XYChart.Data<String, Number>("Mar", 800));
		series2.getData().add(new XYChart.Data<String, Number>("Apr", 500));
		series2.setName("Pay 2");   
		
		
		lineChart.getData().addAll(series, series2);           //for setting a name to the x or y label, go to Main.fxml:  label = "My X label"
		
		
		for (final XYChart.Data<String, Number> data : series.getData()) {
			data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {     //define the event

				@Override
				public void handle(MouseEvent event) {
					lbl.setText("X : " + data.getXValue() + "\nY : " + String.valueOf(data.getYValue()));
					Tooltip.install(data.getNode(), new Tooltip("X : " + data.getXValue() + "\nY : " + String.valueOf(data.getYValue())));  //get tooltip inside with the mouse_clicked event
				}
			});
		}
	}
}
