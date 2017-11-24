package sample;



import Colas.Cola;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;


import javafx.fxml.Initializable;
import javafx.scene.control.*;


import javafx.scene.layout.HBox;


import java.net.URL;
import java.util.ResourceBundle;


public class IntefazController implements Initializable {
    @FXML
    TextField BrowsTxt, InsertTxt, ExtraerTxt; // Declaración de los text fiel
    @FXML
    HBox Box ; // declaración del HBox

    @FXML
    Button BuscarBtn, InsertarBtn, ExtraerBtn, VaciarBtn, ContarBtn; //Declaración de los botones

