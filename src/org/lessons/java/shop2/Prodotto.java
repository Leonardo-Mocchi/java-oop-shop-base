package org.lessons.java.shop2;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

  private int codice;
  private String nome;
  private String marca;
  private BigDecimal prezzo;
  private boolean primaNecessita;
  private BigDecimal iva;

  //* Constructors
  Prodotto(
    String nome,
    String marca,
    BigDecimal prezzo,
    boolean primaNecessita
  ) {
    this.codice = assegnaNumeroProdotto();
    this.nome = nome;
    this.marca = marca.substring(0, 1).toUpperCase() + marca.substring(1);
    this.prezzo = prezzo;
    this.primaNecessita = primaNecessita;
    this.iva = calcolaIva();
  }

  Prodotto() {
    this.codice = assegnaNumeroProdotto();
    this.primaNecessita = false;
  }

  //* utility methods

  private BigDecimal calcolaIva() {
    if (prezzo != null) {
      BigDecimal percentuale = primaNecessita
        ? new BigDecimal("5")
        : new BigDecimal("22");
      BigDecimal cento = new BigDecimal("100");
      return prezzo.multiply(percentuale).divide(cento);
    }
    return null;
  }

  private int assegnaNumeroProdotto() {
    Random rand = new Random();
    int result = rand.nextInt(999999999);
    return result;
  }

  //* Getters
  public void getNome() {
    System.out.println("Il nome del prodotto è " + nome);
  }

  public void getCodice() {
    System.out.println("Il codice del prodotto " + nome + " è " + codice);
  }

  public void getPrezzo() {
    System.out.println(
      "Il prezzo base dell'articolo " +
      nome +
      " è " +
      String.format("%.2f$", prezzo)
    );
  }

  public void getIva() {
    System.out.println(
      "L'IVA dell'articolo ammonta a  " + String.format("%.2f$", iva)
    );
  }

  public void getPrezzoPieno() {
    System.out.println(
      "il prezzo finale dell'articolo " +
      nome +
      " è " +
      String.format("%.2f$", prezzo.add(iva)) +
      " di cui IVA " +
      String.format("%.2f$", iva)
    );
  }

  // replaceAll per far sembrare coerente la scelta del trattino
  public void getNomeEsteso() {
    System.out.println(
      "Il nome esteso dell'articolo è: " +
      codice +
      "-" +
      marca +
      "-" +
      nome.replaceAll("\\s+", "-")
    );
  }

  //* SETTERS
  public void setNome(String newNome) {
    this.nome = newNome;
  }

  public void setMarca(String newMarca) {
    this.marca = newMarca;
  }

  public void setPrezzo(BigDecimal newPrezzo) {
    this.prezzo = newPrezzo;
    this.iva = calcolaIva(); // Recalculate IVA when price changes
  }

  public void setPrimaNecessita(boolean newPrimaNecessita) {
    this.primaNecessita = newPrimaNecessita;
    this.iva = calcolaIva();
  }
}
