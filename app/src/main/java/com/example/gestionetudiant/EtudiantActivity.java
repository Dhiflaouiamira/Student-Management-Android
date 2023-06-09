package com.example.gestionetudiant;


public class EtudiantActivity {
    public EtudiantActivity() {
    }

    private String etudiantId,etudiantNom,etudiantprenom,etudiantEmail,etudiantPassword,etudiantAdress,etudiantPhoneNumber;

    public EtudiantActivity(String etudiantId,String etudiantNom, String etudiantprenom, String etudiantEmail, String etudiantPassword,String etudiantAdress,String etudiantPhoneNumber) {
        this.etudiantId = etudiantId;
        this.etudiantNom= etudiantNom;
        this.etudiantprenom = etudiantprenom;
        this.etudiantEmail = etudiantEmail;
        this.etudiantPassword = etudiantPassword;
        this.etudiantAdress=etudiantAdress;
        this.etudiantPhoneNumber=etudiantPhoneNumber;

    public void setEtudiantId(String etudiantId) {
        this.etudiantId = etudiantId;
    }

        public void setClientName(String etudiantNom) {
        this.etudiantNom = etudiantNom;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public String getClientPassword() {
        return clientPassword;
    }
}
