package p7.controller;

import java.util.ArrayList;

import application.SimpleFriendViewApp;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import p7.model.Friend;

public class viewFriendController {
	@FXML
	private Label IbName;
	@FXML
	private Label IbContact;
	@FXML
	private Label IbLikes;
	@FXML
	private Button btnNext;
	@FXML
	private Button btnPrevious;
	@FXML
	private Button btnClose;

	private SimpleFriendViewApp mainApp;
	
	public SimpleFriendViewApp getMainApp() {
		return mainApp;
	}
	public void setMainApp(SimpleFriendViewApp mainApp) {
		this.mainApp = mainApp;
	}
	// Event Listener on Button[#btnNext].onAction
	@FXML
	public void handleNext(ActionEvent event) {
		if(i == mainApp.getfList().size()-1) {
			
		}
		else {
			i++;
			showFriend(mainApp.getfList(), i);
		}
	}
	// Event Listener on Button[#btnPrevious].onAction
	@FXML
	public void handlePrevious(ActionEvent event) {
		if(i == 0) {
			
		}
		else {
			i--;
			showFriend(mainApp.getfList(), i);
		}
	}
	// Event Listener on Button[#btnClose].onAction
	@FXML
	public void handleClose(ActionEvent event) {
		Platform.exit();
	}
	
	private int i = 0;
	public void showFriend(ArrayList <Friend> f, int i) {
		IbName.setText(f.get(i).getName());
		IbContact.setText(f.get(i).getContact());
		IbLikes.setText(String.valueOf(f.get(i).getLikes()));
	}
}
