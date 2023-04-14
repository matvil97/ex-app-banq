public class BanqueService {
    
    public static void transferer(CompteBancaire source, CompteBancaire destination, double montant) {
        if(source.getSolde() >= montant) {
            source.setSolde(source.getSolde() - montant);
            destination.setSolde(destination.getSolde() + montant);
            System.out.println("Transfert de " + montant + " effectué de " + source.getNumero() + " à " + destination.getNumero());
        } else {
            System.out.println("Solde insuffisant pour effectuer le transfert");
        }
    }
}

