package lk.jiat.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(6666);
            registry.bind("message_service",new MessageImpl());
            registry.bind("student_service",new StudentServiceImpl());
            System.out.println("RMI Server started....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

