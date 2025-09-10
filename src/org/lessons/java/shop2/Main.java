package org.lessons.java.shop2;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    System.out.println();

    Prodotto Doritos = new Prodotto(
      "Doritos Tex Mex",
      "Doritos",
      new BigDecimal("2.20"),
      true
    );

    Doritos.getCodice();
    Doritos.getPrezzo();
    Doritos.getPrezzoPieno();
    Doritos.getNomeEsteso();

    System.out.println();

    Prodotto MonitorSciccoso = new Prodotto(
      "Rog Strix Xg49Vq",
      "Asus",
      new BigDecimal("777.87"),
      false
    );

    MonitorSciccoso.getCodice();
    MonitorSciccoso.getPrezzo();
    MonitorSciccoso.getPrezzoPieno();
    MonitorSciccoso.getNomeEsteso();

    System.out.println();

    Prodotto processoreIdeale = new Prodotto();
    processoreIdeale.getCodice();
    processoreIdeale.setNome("Ryzen 7 9800X3D");
    processoreIdeale.setMarca("AMD");
    processoreIdeale.setPrezzo(new BigDecimal(392.62));

    processoreIdeale.getCodice();
    processoreIdeale.getPrezzo();
    processoreIdeale.getPrezzoPieno();
    processoreIdeale.getNomeEsteso();

    System.out.println();

    System.out.println(
      "Cambaindo il valore prima necessità cambia anche il prezzo dell'IVA"
    );
    processoreIdeale.setPrimaNecessita(true);
    processoreIdeale.getPrezzoPieno();
  }
}
