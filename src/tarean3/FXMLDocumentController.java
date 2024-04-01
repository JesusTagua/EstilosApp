/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarean3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane panel;
    @FXML
    private Label titulo;
    @FXML
    private Button btnE1;
    @FXML
    private Button btnE2;
    @FXML
    private Button btnE3;
    @FXML
    private MenuItem btnReset;
    @FXML
    private MenuItem btnSalir;
    @FXML
    private Label firma;
    @FXML
    private Label firma2;
     @FXML
    private Label fondo;
    @FXML
    private MenuItem acercaDeMenuItem;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    private void Estilo1(ActionEvent event) {
       panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
       panel.getStylesheets().add("/Estilos/Estilo1.css");  //Añadimos el nuevo estilo
    }

    @FXML
    private void Estilo2(ActionEvent event) {
       panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
       panel.getStylesheets().add("/Estilos/Estilo2.css");  //Añadimos el nuevo estilo
        
    }

    @FXML
    private void Estilo3(ActionEvent event) {
       panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
       panel.getStylesheets().add("/Estilos/Estilo3.css");  //Añadimos el nuevo estilo
    }

    //@FXML
    //private void Reset(ActionEvent event) {
       //panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
      // panel.getStylesheets().add("/Estilos/estiloInicial.css");  //Añadimos el nuevo estilo
    //}

    @FXML
   //private void Exit(ActionEvent event) {
       // System.exit(0);
   // }
    // Método para cerrar la aplicación
    private void salir(ActionEvent event) {
        Platform.exit();
    }
    
      @FXML
    // Método para resetear la aplicación al estilo por defecto
    private void resetear(ActionEvent event) {
    panel.getStylesheets().clear();  
    panel.getStylesheets().add("/Estilos/estiloInicial.css");  
}
    
     @FXML
    // Método para mostrar el diálogo "Acerca de..."
    private void mostrarAcercaDe(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca de...");
        alert.setHeaderText(null);
        alert.setContentText("Aplicación realizada por Jesús Tagua Camargo. Versión 1.0");
        alert.showAndWait();
    }
}
    

