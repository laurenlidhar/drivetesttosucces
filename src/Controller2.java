import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller2 {

    @FXML
    private Button buttonlvl1;

    @FXML
    private Button buttonlvl2;

    @FXML
    void calltoAction(ActionEvent event) throws IOException {

            System.out.println("You clicked me!");
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("LevelOne.fxml"));
            Scene home_page_scene = new Scene(home_page_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.hide(); //optional
            app_stage.setScene(home_page_scene);
            app_stage.show();  
    }

}