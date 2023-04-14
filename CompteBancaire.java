public class CompteBancaire {
  private String numero;
  private double solde;
  
  public CompteBancaire(String numero, double solde) {
      this.numero = numero;
      this.solde = solde;
  }
  
  public String getNumero() {
      return this.numero;
  }
  
  public double getSolde() {
      return this.solde;
  }
  
  public void setSolde(double solde) {
      this.solde = solde;
  }
}

