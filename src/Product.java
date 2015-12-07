import java.rmi.*;

/**
  Interfaz del objeto remoto Product 
*/
public interface Product extends Remote { 
   /**
     Recoge la descripci�n de un producto 
     @return la descripci�n del producto 
   */
   String getDescription() throws RemoteException;
}
