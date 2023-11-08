package rmiClient;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // Obtenez le registre RMI du serveur sur le port 1099 (port par défaut)
            Registry registry = LocateRegistry.getRegistry("adresse_du_serveur", 1099);

            // Recherchez le service de conversion par son nom
            rmiClientm.IConversion conversionService = (rmiClientm.IConversion) 
            		registry.lookup("ConversionService");

            // Utilisez le service pour effectuer la conversion
            double montant = 100.0; // Exemple : montant en dollars
         

            String montantConverti = null;
			System.out.println("Montant converti : " + montantConverti);
        } catch (Exception e) {
            System.err.println("Erreur du client : " + e.toString());
            e.printStackTrace();
        }
    }
}
