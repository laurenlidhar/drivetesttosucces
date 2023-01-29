
import java.io.IOException;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("SceneDemo.fxml"));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            

        } catch (IOException e){

        }
        
 
    }
  /*
  Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
  Scene scene = new Scene(root);
  */
  

 public static void main(String[] args) throws Exception{
        launch(args);
    }
}