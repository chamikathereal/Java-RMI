package lk.jiat.rmi;

import lk.jiat.rmi.client.StudentService;
import lk.jiat.rmi.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {

    StudentServiceImpl() throws RemoteException {}

    @Override
    public List<Student> getStudents() throws RemoteException {
        return List.of(
            new Student(1,"Krishan","Kandy","0772101809"),
            new Student(2,"Kamal","Colombo","0721737320"),
            new Student(3,"Krishan","Gall","0765251578")
        );

    }

}
