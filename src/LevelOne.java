

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LevelOne extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("LevelOne.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e){
        // TO-Do
    }
}


    public static void main(String[] args) throws Exception{
        System.out.println("Hello, World!");
        launch(args);
    }
}


