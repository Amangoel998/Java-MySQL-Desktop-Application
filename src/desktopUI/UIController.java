package desktopUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class UIController implements Initializable {
	@FXML private Button menuBackButton;
	@FXML private Button menuButton;
	@FXML private Button menuLogout;
	
	@FXML private Button generateBill;
	@FXML private Button registerCustomer;
	@FXML private Button createUser;

	@FXML private Parent menuSubAnchor;
	@FXML private Parent searchAnchor;
	
	@FXML private Button menuSearch;
	@FXML private Button searchSubmit;
	@FXML private TextField searchId;
	@FXML private TextField searchYear;

	@FXML private Button backToMain;
	@FXML private Button clearForm;
	@FXML private Button submitForm;
	@FXML private TextField inputCustomerId;
	@FXML private TextField inputMeterId;
	@FXML private TextField inputReadingDate;
	@FXML private TextField inputReadingUnits;
	@FXML private TextField inputZip;
	@FXML private TextField inputPassword;
	@FXML private TextField inputConfirmPassword;
	@FXML private TextField inputUsername;
	@FXML private TextField inputPhone;
	@FXML private TextField inputAddress;
	@FXML private TextField[] inputFields={inputCustomerId,
			inputMeterId,inputReadingDate,inputReadingUnits,inputUsername,
			inputZip,inputPhone,inputAddress,inputPassword,inputConfirmPassword};	
	@FXML private MenuButton meterStatus;
	
	@FXML private Parent loginMain;
	@FXML private Button loginAdmin;
	@FXML private Button loginUser;
	@FXML private Button loginDB;
	
	@FXML private TextField textLoginUsername;
	@FXML private TextField textLoginPassword;
	@FXML private Label loginWindowLabel;
	private Stage stage=null;
	private Scene scene=null;
	public Scene setScene(String fxmlName) throws IOException{
		return new Scene(FXMLLoader.load(getClass().getResource(fxmlName)));
	}
	@FXML private void handleButtonAction(ActionEvent event) throws IOException{
		loginMain.setVisible(true);
		if(event.getSource()==loginAdmin){
			loginUser.setDisable(true);
		}
		else if(event.getSource()==loginUser){
			loginAdmin.setDisable(true);
		}
		else if(event.getSource()==loginDB){
			stage=(Stage)loginDB.getScene().getWindow();
			stage.setScene(setScene("MainTable.fxml"));
			stage.show();
		}
	}
	@FXML private void handleMenuButton(ActionEvent event) throws IOException{
		if(event.getSource()==menuButton){
			if(searchAnchor.isVisible())searchAnchor.setVisible(false);
			menuSubAnchor.setVisible(true);
		}
		else if(event.getSource()==menuBackButton){
			menuSubAnchor.setVisible(false);
		}
		else if(event.getSource()==menuSearch&&searchAnchor.isVisible()){
			searchAnchor.setVisible(false);
		}
		else if(event.getSource()==menuSearch){
			if(menuSubAnchor.isVisible())menuSubAnchor.setVisible(false);
			searchAnchor.setVisible(true);
		}
	}
	@FXML private void createObject(ActionEvent event) throws IOException{
		stage=(Stage)generateBill.getScene().getWindow();
		if(event.getSource()==generateBill){
			scene=setScene("GenerateBill.fxml");
		}
		else if(event.getSource()==createUser){
			scene=setScene("CreateUser.fxml");
		}
		else if(event.getSource()==registerCustomer){
			scene=setScene("RegisterUser.fxml");
		}
		stage.setScene(scene);
		stage.show();
	}
	@FXML private void inputStringValue(ActionEvent event) throws IOException{
		
	}
	@FXML private void inputDecimalValue(ActionEvent event) throws IOException{
	
	}
	@FXML private void inputIntegerValue(ActionEvent event) throws IOException{
	
	}
	@FXML private void searchAction(ActionEvent event) throws IOException{
		
	}
	@FXML private void clearAction(ActionEvent event) throws IOException{

	}
	@FXML private void submitUser(ActionEvent event) throws IOException{
		
	}
	@FXML private void submitRegister(ActionEvent event) throws IOException{
		
	}
	@FXML private void submitGenerate(ActionEvent event) throws IOException{
		
	}
	@FXML private void exit(ActionEvent event) throws IOException{
		
	}
	@FXML private void backAction(ActionEvent event) throws IOException{
		stage.setScene(setScene("MainTable.fxml"));
		stage.show();
	}
	@Override public void initialize(URL location, ResourceBundle resources) {
	
	}
}