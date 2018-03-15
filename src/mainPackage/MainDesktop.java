package mainPackage;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;

public class MainDesktop extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start (Stage window) throws IOException {
		Scene primaryScene = new Scene(FXMLLoader.load(getClass().getResource("../desktopUI/LoginPage.fxml")));
		window.setTitle("Electricity Bill Calculator");
		window.setMinHeight(480);
		window.setMinWidth(600);
		window.setScene(primaryScene);
		window.show();
	}
}
