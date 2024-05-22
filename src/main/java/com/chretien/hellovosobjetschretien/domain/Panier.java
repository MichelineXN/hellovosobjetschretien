package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity

        public class Panier {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            private String identifiantUtilisateur;  // Identifiant unique pour l'utilisateur ou la session utilisateur
            private String product;
            private int montant;
            private String quantite;
            private String commandeNum;
            private int paiement;
            private Date datePaiement;
            private String typePaiement;
            private String statusPaiement;

            private LocalDateTime dateMiseAJour;    // Date de création ou de la dernière mise à jour du panier
            private double totalBrut;  // Total avant remises
            private double remiseTotale;  // Remise totale appliquée sur le panier

            private double totalNet;   // Total après remises



    public Panier() {

    }

    public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public String getIdentifiantUtilisateur() {
                return identifiantUtilisateur;
            }

            public void setIdentifiantUtilisateur(String identifiantUtilisateur) {
                this.identifiantUtilisateur = identifiantUtilisateur;
            }

            public String getProduct() {
                return product;
            }



            public void setProduct(String product) {
                this.product = product;
            }

            public int getMontant() {
                return montant;
            }

            public void setMontant(int montant) {
                this.montant = montant;
            }

            public String getQuantite() {
                return quantite;
            }

            public void setQuantite(String quantite) {
                this.quantite = quantite;
            }

            public String getCommandeNum() {
                return commandeNum;
            }

            public void setCommandeNum(String commandeNum) {
                this.commandeNum = commandeNum;
            }

            public int getPaiement() {
                return paiement;
            }

            public void setPaiement(int paiement) {
                this.paiement = paiement;
            }

            public Date getDatePaiement() {
                return datePaiement;
            }

            public void setDatePaiement(Date datePaiement) {
                this.datePaiement = datePaiement;
            }

            public String getTypePaiement() {
                return typePaiement;
            }

            public void setTypePaiement(String typePaiement) {
                this.typePaiement = typePaiement;
            }

            public String getStatusPaiement() {
                return statusPaiement;
            }

            public void setStatusPaiement(String statusPaiement) {
                this.statusPaiement = statusPaiement;
            }

            public LocalDateTime getDateMiseAJour() {
                return dateMiseAJour;
            }

            public void setDateMiseAJour(LocalDateTime dateMiseAJour) {
                this.dateMiseAJour = dateMiseAJour;
            }

            public double getTotalBrut() {
                return totalBrut;
            }

            public void setTotalBrut(double totalBrut) {
                this.totalBrut = totalBrut;
            }

            public double getRemiseTotale() {
                return remiseTotale;
            }

            public void setRemiseTotale(double remiseTotale) {
                this.remiseTotale = remiseTotale;
            }

            public double getTotalNet() {
                return totalNet;
            }

            public void setTotalNet(double totalNet) {
                this.totalNet = totalNet;
            }

            public Panier(Long id, String identifiantUtilisateur, String product, int montant, String quantite, String commandeNum, int paiement, Date datePaiement, String typePaiement, String statusPaiement,
                          LocalDateTime dateMiseAJour, double totalBrut, double remiseTotale, double totalNet) {
                this.id = id;
                this.identifiantUtilisateur = identifiantUtilisateur;
                this.product = product;
                this.montant = montant;
                this.quantite = quantite;
                this.commandeNum = commandeNum;
                this.paiement = paiement;
                this.datePaiement = datePaiement;
                this.typePaiement = typePaiement;
                this.statusPaiement = statusPaiement;
                this.dateMiseAJour = dateMiseAJour;
                this.totalBrut = totalBrut;
                this.remiseTotale = remiseTotale;
                this.totalNet = totalNet;


            }
        }