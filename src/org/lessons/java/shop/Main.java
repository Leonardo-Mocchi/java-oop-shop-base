package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Prodotto Doritos = new Prodotto("Doritos Tex Mex", "Snack di Mais al Gusto Formaggio",
                new BigDecimal("2.20"), true);

        Doritos.stampaCodice();
        Doritos.stampaPrezzo();
        Doritos.stampaPrezzoPieno();
        Doritos.stampaNomeEsteso();

        System.out.println();

        Prodotto MonitorSciccoso = new Prodotto("Asus Rog Strix Xg49Vq", "Monitor Gaming 49”, 3840X1080, 144Hz",
                new BigDecimal("777.87"), false);

        MonitorSciccoso.stampaCodice();
        MonitorSciccoso.stampaPrezzo();
        MonitorSciccoso.stampaPrezzoPieno();
        MonitorSciccoso.stampaNomeEsteso();

    }
}
