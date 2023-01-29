import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

    
    public class MainSceneController {
    
        @FXML
        private ResourceBundle resources;
    
        @FXML
        private URL location;

        @FXML
        private ImageView imageView;

        

        @FXML
        private void handleButtonAction2(ActionEvent event) throws IOException {
            System.out.println("You clicked me!");
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("levelsFX.fxml"));

            Scene home_page_scene = new Scene(home_page_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.hide(); //optional
            app_stage.setScene(home_page_scene);
            app_stage.show();  

            
        }
    
        @FXML
        void initialize() {
    
            // Image image = new Image(getClass().getResourceAsStream("/images/bush.png"));
            // imageView.setImage(image);

        }


    
    }
     

