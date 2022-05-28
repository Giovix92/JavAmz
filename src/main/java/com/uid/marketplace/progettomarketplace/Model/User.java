package com.uid.marketplace.progettomarketplace.Model;

public record User(String email, String nome, String cognome, String indirizzo, Integer saldo) {

        @Override
        public String toString() {
            return email + ";" + nome + ";" + cognome + ";" + indirizzo + ";" + saldo;
        }
    }

