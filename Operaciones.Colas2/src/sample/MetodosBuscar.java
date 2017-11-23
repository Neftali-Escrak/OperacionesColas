package sample;

import javafx.scene.control.TextField;

public class MetodosBuscar {

    public void Secuencial(int[] numeros, int valor){

        boolean encontrado = false;

        for (int i = 0; i<numeros.length; i++){
            if(numeros[i] == valor){
                encontrado = true;
                System.out.println(valor + " encontrado en la posicion: ["+i+"]");
            }
        }
        if (!encontrado) System.out.println(valor + " no ha sido encontrado");
    }

}
