/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnCouleur;

    @FXML
    private Button btn_auto;

    @FXML
    private Button btn_manuel;

    @FXML
    private Label chrono1;

    @FXML
    private Label chrono2;

    @FXML
    private Label chrono3;

    @FXML
    private Ellipse groad1;

    @FXML
    private Ellipse groad2;

    @FXML
    private Ellipse groad3;

    @FXML
    private Ellipse rroad1;

    @FXML
    private Ellipse rroad2;

    @FXML
    private Ellipse rroad3;

    @FXML
    private Ellipse yroad1;

    @FXML
    private Ellipse yroad2;

    @FXML
    private Ellipse yroad3;

    @FXML
    void changerCouleur(ActionEvent event) {

    }

    @FXML
    void passerModeAuto(ActionEvent event) {

    }

    @FXML
    void passerModeManuel(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
