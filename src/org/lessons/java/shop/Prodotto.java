package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public boolean primaNecessita;
    public float iva;

    Prodotto(String nome, String descrizione, float prezzo, boolean primaNecessita) {
        this.codice = assegnaNumeroProdotto();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.primaNecessita = primaNecessita;
        this.iva = calcolaIva();
    }

    // utility methods
    public float calcolaIva() {
        if (primaNecessita) {
            return iva = (prezzo / 100) * 5;
        } else {
            return iva = (prezzo / 100) * 22;
        }
    }

    public int assegnaNumeroProdotto() {
        Random rand = new Random();
        int max = 999999999;
        int result = rand.nextInt(max);
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
        System.out.println("il prezzo finale dell'articolo " + nome + " è " + String.format("%.2f$", (prezzo + iva))
                + " di cui IVA " + String.format("%.2f$", iva));
    }
}
