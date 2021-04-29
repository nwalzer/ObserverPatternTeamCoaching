import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Label hex, octal, binary;

    @FXML
    TextField number;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
