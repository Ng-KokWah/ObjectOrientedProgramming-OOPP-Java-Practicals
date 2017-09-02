package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import p7.controller.viewFriendController;
import p7.model.Friend;

public class SimpleFriendViewApp extends Application {

    private Stage primaryStage;
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	private ArrayList<Friend> fList;

	public ArrayList<Friend> getfList() {
		return fList;
	}

	public void setfList(ArrayList<Friend> fList) {
		this.fList = fList;
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(getClass().getResource("/p7/view/viewFriend.fxml"));
			AnchorPane root = loader.load();
			viewFriendController ctrl = loader.getController();
			fList = new ArrayList<Friend>();
			
			fList.add(new Friend("Ah Gong", "97234343", 100));
			fList.add(new Friend("Ah Long", "12345678", 320));
			fList.add(new Friend("Ah kong", "13579214", 234));
			ctrl.showFriend(fList, 0);
			ctrl.setMainApp(this);
			Scene scene = new Scene(root,448,382);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Friends Viewer");
			primaryStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
