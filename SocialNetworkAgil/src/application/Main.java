package application;
	
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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	private StackPane root = new StackPane();
    private Stage stage;

    @Override
    public void init() {
    	VBox vBox = new VBox();
    	VBox vBox1 = new VBox();
    	HBox hBox = new HBox();
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
        Image image = null;
        
        
        //-fx-border-color: #ff0000;-fx-border-width: 1px;
        buttonExit.setStyle("-fx-background-color: #e64e4e;-fx-text-fill: #fff0f0;");
        buttonSignIn.setStyle("-fx-background-color: #e64e4e;-fx-text-fill: #fff0f0;");
        
        
       // userNameLabel.setUnderline(true);
        	
        labelApp.setText("Sign In To app");
        //labelApp.setStyle();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10,10,10,10));
        //hBox.setAlignment(Pos.BOTTOM_RIGHT);
        //hBox.getChildren().addAll(buttonExit,buttonSignIn);
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        
       
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(
        		hBox,
        		userNameLabel,
        		userText,
                passLabel,
                passText,
                buttonLogin,buttonExit);
        
        //root.getChildren().addAll(vBox);
        pane.setTop(labelApp);
        pane.getChildren().addAll(vBox);
        root.getChildren().addAll(pane);
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
        	
        });

        /*button.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
            stage = new Stage();
            StackPane stackPane = new StackPane();
            stage.setScene(new Scene(stackPane, 200,200));
            stage.show();
        }); */
    } 

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Login");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
