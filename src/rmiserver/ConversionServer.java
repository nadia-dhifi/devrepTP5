package rmiserver;

	import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
	import java.rmi.registry.Registry;

import rmiClient.ConversionImpl;

	public class ConversionServer {

	    public static <IConversion> void main(String[] args) {
	        try {
	            // Créez une instance de ConversionImpl
	            IConversion conversionService = (IConversion) new ConversionImpl();

	            // Créez un registre RMI sur le port 1099 (port par défaut)
	            Registry registry = LocateRegistry.createRegistry(1099);

	            // Liez le service de conversion au registre RMI avec un nom
	            registry.rebind("ConversionService", (Remote) conversionService);

	            System.out.println("Serveur RMI prêt.");
	        } catch (Exception e) {
	            System.err.println("Erreur du serveur : " + e.toString());
	            e.printStackTrace();
	        }
	    }
	}

