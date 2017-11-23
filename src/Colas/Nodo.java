package Colas;



public class Nodo {  private int valor; //Declaración de la variable llamado valor
    private Nodo proximo; //Puntero hacia els siguiente nodo

    //Constructor simple, inicializa si valor

    public Nodo(){
        this.valor = 0;
        this.proximo = null;

    }

    //Constructor

    public Nodo(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public void setValor(int valor){

        this.valor = valor;
    }

    public void setProximo(Nodo siguiente ){
        this.proximo = siguiente;
    }

    public int getValor(){
        return this.valor;
    }

    public Nodo getProximo(){
        return this.proximo;
    }

    public void Unir(Nodo n) {

        proximo = n;
    }

}


