package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	private StackPane root = new StackPane();
    private Stage stage;
    @Override
    public void init() {
    	VBox vBox = new VBox();
    	VBox vBox1 = new VBox();
    	HBox hBoxCenter = new HBox();
    	HBox hboxTop = new HBox();
    	HBox hboxSignIn = new HBox();
    	BorderPane pane = new BorderPane();
    	Label labelApp = new Label();
        Button buttonLogin = new Button("Connect");
        Button buttonFpassword = new Button("Forget Password");
        Label labelPhoto = new Label();
        Button buttonExit = new Button("Exit");
        Button buttonSignIn = new Button("Sign Up");
        Label userNameLabel = new Label("Username");
        Label passLabel = new Label("Password");
        TextField userText = new TextField();
        PasswordField passText = new PasswordField();
        InputStream stream = null;
        final ImageView selectedImage = new ImageView();
        try {
			stream = new FileInputStream("C:\\Users\\Ce-PC\\Downloads\\output-onlinepngtools.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	       
        Image image = new Image(stream);
        selectedImage.setImage(image);
        selectedImage.setFitWidth(300);
        selectedImage.setFitHeight(300);
        selectedImage.setPreserveRatio(true);
        hboxTop.setAlignment(Pos.CENTER);
        HBox.setMargin(pane, new Insets(10,10,10,10));     
        hboxTop.getChildren().addAll(selectedImage);
        buttonExit.setStyle("-fx-background-color: #e64e4e;-fx-text-fill: #fff0f0;");
        buttonSignIn.setStyle("-fx-background-color: #e64e4e;-fx-text-fill: #fff0f0;");
        hBoxCenter.setSpacing(10);
        hBoxCenter.setPadding(new Insets(10,10,10,10));
        
        hboxSignIn.getChildren().addAll(buttonSignIn,buttonExit);
        hboxSignIn.setSpacing(285);
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(
        		userNameLabel,
        		userText,
                passLabel,
                passText,
                buttonLogin,
                hboxSignIn);
        pane.setTop(hboxTop);
        pane.setCenter(vBox);
        root.getChildren().addAll(pane);
        
        
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.exit(0);
			}     	
        });
    } 
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Login");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
