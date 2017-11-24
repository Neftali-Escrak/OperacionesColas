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

    private boolean direccion = true;
    boolean salir = false;


    Object opcion;  //Declaración del obhjeto llamado opción
    String opcion1; // Tipo de valor String

    Cola cola = new Cola(); //Creación de nueva cola


    private boolean actionResult = false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.InsertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {



                direccion = false;

                boolean v = Validacion(InsertTxt.getText());

                if (v != false) {

                    cola.insertar(Integer.parseInt(InsertTxt.getText()));
                    HBox pane = new HBox();
                    Label Label1 = new Label(InsertTxt.getText());
                    Separator separator = new Separator();

                    pane.getChildren().add(Label1);
                    pane.getChildren().add(separator);
                    Box.getChildren().add(pane);
                    separator.setOpacity(0);
                    separator.maxHeight(3);
                }else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Mensaje");
                    alert.setHeaderText("Error");
                    alert.setContentText("Solo se ingresa números");
                    alert.showAndWait();

                }
                InsertTxt.setText("");//Limpiar el valor en el textfield
            }

        });

        this.BuscarBtn.setOnAction(new EventHandler<ActionEvent>() {//evento click para el botón
            @Override
            public void handle(ActionEvent event) {

                boolean v = Validacion(BrowsTxt.getText());

                if ( v != false) {


                    int valor = Integer.parseInt(BrowsTxt.getText());
                    cola.buscar(valor);

                } else {
                    if (v == false) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Mensaje");
                        alert.setHeaderText("Error");
                        alert.setContentText("Solo se ingresa números");
                        alert.showAndWait();
                    }
                }
                BrowsTxt.setText("");//Limpiar el valor en el textfield

            }
        });
        this.ContarBtn.setOnAction(new EventHandler<ActionEvent>() {// evento click para el botón de Tamaño
            @Override
            public void handle(ActionEvent event) {

                boolean v = Validacion(InsertTxt.getText());

                if (v != true) {
                    direccion = false;
                    cola.contar();
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Mensaje");
                    alert.setHeaderText(" El total de valores en la cola son : " + cola.contar());
                    alert.showAndWait();

                }
            }

        });
        this.ExtraerBtn.setOnAction(new EventHandler<ActionEvent>() {//evento del botón Extraer
            @Override
            public void handle(ActionEvent event) {
                boolean v = Validacion(BrowsTxt.getText());
                direccion = false;
                cola.extraer();
                Box.getChildren().remove(0);


            }
        });
        this.VaciarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                boolean b=Validacion(BrowsTxt.getText());
                direccion=false;
                cola.Vaciar();
                Box.getChildren().clear();


            }
        });




    }


    private boolean Validacion(String text) {
        int n;

        try {
            n = Integer.parseInt(text);
            return true;
        } catch (Exception e) {

            return false;
        }
    }
}

