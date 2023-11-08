package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements Iconversion {

    public ConversionImpl() throws RemoteException {
        // Constructeur par défaut, nécessaire pour l'enregistrement RMI
    }

    @Override
   
    	public double convertirMontant(double mt) throws RemoteException {
    	    try {
    	        // Appliquez votre logique de conversion ici
    	        double tauxDeChange = 0.85; // Exemple : 1 dollar = 0.85 euro
    	        double montantConverti = mt * tauxDeChange;
    	        return montantConverti;
    	    } catch (Exception e) {
    	        // En cas d'erreur, levez une RemoteException
    	        throw new RemoteException("Erreur lors de la conversion : " + e.getMessage());
    	    }
    }
}
