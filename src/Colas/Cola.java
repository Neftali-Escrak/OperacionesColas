package Colas;

import javafx.scene.control.Alert;

import java.util.Scanner;

public class Cola {
    Scanner sc = new Scanner(System.in);

    private Nodo frente; //El inicio de la cola
    int size;
    private Nodo tamaño;


    //Constructor simple

    public Cola() {
        this.frente = null;
        this.tamaño = frente;
    }

    //Metodo para insertar siguiente elemento (nodo)el elemento debe colocarse detrás del último nodo

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (frente == null) {
            frente = nuevo;
        } else {
            Nodo temp = frente;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();

            }
            temp.setProximo(nuevo);
        }

    }

    public boolean vacia() { //para ver si esta vacia la cola
        return (frente == null);
    }



    public void buscar(int busqueda) {//método para buscar un valor en la cola


        try {
            Nodo temp = frente;
            int posicion = 0;


            if (temp.getValor() == busqueda) {
                //System.out.println("El valor esta en la posición 0");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Mensaje");
                alert.setHeaderText("El elemento esta en la posición 0");
                alert.showAndWait();
            } else {

                while (temp != null) {


                    if (temp.getProximo().getValor() == busqueda) {
                        // System.out.println("valor en la posicion:" + posicion);
                        Alert alert = new Alert(Alert.AlertType.ERROR);//mensaje alerta que se mostrara al encontrar el valor.
                        alert.setTitle("Mensaje");
                        alert.setHeaderText("El elemento " + busqueda + " ha sido encontrado en la posición " + posicion);//el mensaje mostrara el valor y la posición que fue encontrado
                        alert.showAndWait();
                        break;

                    }

                    posicion++;
                    temp = temp.getProximo();
                }
            }

        } catch (Exception ex) {//mensaje que mostrara al no encontrar el valor en la cola.
            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setTitle("Mensaje");
            alert1.setHeaderText("El elemento no se encuentra en la cola");
            alert1.showAndWait();
        }
    }


    public int extraer() {// metodo para extraer el valor inicial de la cola.
        if (frente == null) {
            return 0;
        } else {
            int valorExtraer = frente.getValor();//Variable temporal
            frente = frente.getProximo();//Cambiar el frente con el siguiente
            //System.out.println("Valor extraído" + " "+ valorExtraer);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Mensaje");
            alert.setHeaderText(" El valor extraído " + valorExtraer);
            alert.showAndWait();
            return valorExtraer; //Devolver el valor extraído de la cola
        }
    }


    public int size() {
        return size;
    }

    public int contar() {//contar
        Nodo aux = null;
        int i = 0;
        aux = frente;
        while (aux != null) {
            aux = aux.getProximo();
            i++;
        }
        return i;
    }



   public int Vaciar() {//método para limpiar la cola-- contenedor Hbox
        if (frente == null) {
            return 0;
        } else {
            int Valorvaciar = frente.getValor();
            frente = frente.getProximo();
            Alert alert = new Alert(Alert.AlertType.ERROR);//mensaje alerta que mostrara, al dar click en el botón vaciar
            alert.setTitle("Mensaje");
            alert.setHeaderText(" La cola sera vaciada");
            alert.showAndWait();
            return 0;
        }

    }
}
