package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable {
	
	@FXML
	private AnchorPane anchor;
	
	public void setVista(Node node) {
		anchor.getChildren().setAll(node);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
