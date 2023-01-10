package org.example;

public class Piramide {
    private int a;

    //construtor
    public Piramide(int a){
        this.a = a;
    }
    //metodo

    public void imprimirPiramide() {
        for (int i = 0; i <= a; i++) {
            StringBuilder linha = new StringBuilder();
            for (int j = 0; j < i; j++) {
                linha.append(i);
            }
            System.out.println(linha);
        }
    }
}
