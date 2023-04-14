public class Client {
    private String nom;
    private String prenom;
    private CompteBancaire compteBancaire;
    
    public Client(String nom, String prenom, CompteBancaire compteBancaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.compteBancaire = compteBancaire;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public CompteBancaire getCompteBancaire() {
        return this.compteBancaire;
    }
}

