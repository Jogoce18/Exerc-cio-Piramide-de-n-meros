package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o tamanho da sua pirâmide?");
        int tamanho = s.nextInt();
        s.close();

        Piramide piramide = new Piramide(tamanho);
        piramide.imprimirPiramide();
    }
}