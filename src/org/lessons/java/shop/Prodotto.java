package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public boolean primaNecessita;
    public BigDecimal iva;

    Prodotto(String nome, String descrizione, BigDecimal prezzo, boolean primaNecessita) {
        this.codice = assegnaNumeroProdotto();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.primaNecessita = primaNecessita;
        this.iva = calcolaIva();
    }

    // utility methods
    /*
     * // ! BigDecimal non accetta calcoli come al solito, ma solo con metodi
     * public float calcolaIva() {
     * if (primaNecessita) {
     * return iva = (prezzo / 100) * 5;
     * } else {
     * return iva = (prezzo / 100) * 22;
     * }
     * }
     */

    public BigDecimal calcolaIva() {
        if (prezzo != null && iva != null) {
            BigDecimal percentuale = primaNecessita ? new BigDecimal("5") : new BigDecimal("22");
            BigDecimal cento = new BigDecimal("100");
            return prezzo.multiply(percentuale).divide(cento);
        }
        return null;
    }

    public int assegnaNumeroProdotto() {
        Random rand = new Random();
        int result = rand.nextInt(999999999);
        return result;
    }

    // display methods
    public void stampaCodice() {
        System.out.println("Il codice del prodotto " + nome + " è " + codice);
    }

    public void stampaPrezzo() {
        System.out.println("Il prezzo base dell'articolo " + nome + " è " + String.format("%.2f$", prezzo));
    }

    public void stampaPrezzoPieno() {
        System.out.println("il prezzo finale dell'articolo " + nome + " è " + String.format("%.2f$", prezzo.add(iva))
                + " di cui IVA " + String.format("%.2f$", iva));
    }

    // replaceAll per far sembrare coearente la scelta del trattino
    public void stampaNomeEsteso() {
        System.out.println("Il nome esteso dell'articolo è: " + codice + "-" + nome.replaceAll("\\s+", "-"));
    }
}
