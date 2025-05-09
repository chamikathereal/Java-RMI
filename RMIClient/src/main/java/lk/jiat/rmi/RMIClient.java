package lk.jiat.rmi;

import lk.jiat.rmi.client.Message;
import lk.jiat.rmi.client.StudentService;
import lk.jiat.rmi.model.Student;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Properties;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 6666);
            String[] list = registry.list();
            for (String s : list) {
                System.out.println(s); // message_service
            }

            //Remote remote = registry.lookup("message_service");
            //System.out.println(remote);
            //Proxy[Message,RemoteObjectInvocationHandler[UnicastRef [liveRef: [endpoint:[192.168.1.7:8169](remote),objID:[-59526508:196b6546009:-7ffe, -2443470175206334636]]]]]

            Message message = (Message) registry.lookup("message_service");
            System.out.println(message.hello("Chamika")); // Hello, Chamika

            //StudentService studentService = (StudentService) registry.lookup("student_service");
            //List<Student> students = studentService.getStudents();
            //students.forEach(
                    //student -> {
                        //System.out.println(student.getId() + " " + student.getName()+ " :" + student.getAddress());
                        //1 Krishan :Kandy
                        //2 Kamal :Colombo
                        //3 Krishan :Gall
                    //}
            //);

            Properties prop = new Properties();
            prop.put(Context.PROVIDER_URL, "rmi://localhost:6666");
            prop.put(Context.INITIAL_CONTEXT_FACTORY,
                    "com.sun.jndi.rmi.registry.RegistryContextFactory");

            InitialContext ctx = new InitialContext(prop);
            StudentService studentService = (StudentService) ctx.lookup("student_service");

            //StudentService studentService = (StudentService) Naming.lookup("rmi://localhost:6666/student_service");
            List<Student> students = studentService.getStudents();
            students.forEach(
                    student -> {
                        System.out.println(student.getId() + " " + student.getName()+ " :" + student.getAddress());
                        //1 Krishan :Kandy
                        //2 Kamal :Colombo
                        //3 Krishan :Gall
                    }
            );

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
