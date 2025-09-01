package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto Doritos = new Prodotto("Doritos Tex Mex", "Snack di Mais al Gusto Formaggio", 2.20f, true);

        Doritos.stampaCodice();
        Doritos.stampaPrezzo();
        Doritos.stampaPrezzoPieno();

        Prodotto MonitorSciccoso = new Prodotto("Asus Rog Strix Xg49Vq", "Monitor Gaming 49”, 3840X1080, 144Hz",
                777.87f, false);

        MonitorSciccoso.stampaCodice();
        MonitorSciccoso.stampaPrezzo();
        MonitorSciccoso.stampaPrezzoPieno();
    }
}
