public class Main {
    
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire("111111", 1500.0);
        CompteBancaire compte2 = new CompteBancaire("222222", 523.0);
        CompteBancaire compte3 = new CompteBancaire("333333", 2123.0);

        
        Client client1 = new Client("Dupont", "Pierre", compte1);
        Client client2 = new Client("Martin", "Sophie", compte2);
        Client client3 = new Client("Polnareff", "Jean-Pierre", compte3);

        
        System.out.println("Solde du compte de " + client1.getPrenom() + " : " + client1.getCompteBancaire().getSolde());
        System.out.println("Solde du compte de " + client2.getPrenom() + " : " + client2.getCompteBancaire().getSolde());
        System.out.println("Solde du compte de " + client3.getPrenom() + " : " + client3.getCompteBancaire().getSolde());

        
        BanqueService.transferer(client1.getCompteBancaire(), client2.getCompteBancaire(), 500.0);
        BanqueService.transferer(client2.getCompteBancaire(), client3.getCompteBancaire(), 135.0);

        
        System.out.println("Solde du compte de " + client1.getPrenom() + " : " + client1.getCompteBancaire().getSolde());
        System.out.println("Solde du compte de " + client2.getPrenom() + " : " + client2.getCompteBancaire().getSolde());
        System.out.println("Solde du compte de " + client3.getPrenom() + " : " + client3.getCompteBancaire().getSolde());

    }
}


