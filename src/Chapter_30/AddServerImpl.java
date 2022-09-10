package Chapter_30;

import java.rmi.server.*;
import java.rmi.*;

public class AddServerImpl extends UnicastRemoteObject {
    protected AddServerImpl() throws RemoteException {
    }

    public double add(double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}
