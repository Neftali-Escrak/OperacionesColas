package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Metodos implements Initializable{

    @FXML
    Button generar, buscarbtn;

    @FXML
    TextField cantidad, buscartxt;

    int Valores[];

    int Buscartxt = Integer.parseInt(buscartxt.getText());
    int rango = Integer.parseInt(cantidad.getText());

    MetodosBuscar Metodos = new MetodosBuscar();


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        this.generar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Valores = new int[]{rango};
            }



        });

        this.buscarbtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                Metodos.Secuencial( Valores, Buscartxt);
            }
        });

    }
}
