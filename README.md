# **Java-RMI (Remote Method Invocation)**

This repository contains two projects: **RMIServer** and **RMIClient**, demonstrating the use of Java RMI (Remote Method Invocation) for communication between a client and a server.

## 📽️ Demo Video

[![Java RMI Project Demo](https://img.youtube.com/vi/26gqxZdCt7E/0.jpg)](https://youtu.be/26gqxZdCt7E)


## **RMIServer**

The **RMIServer** project implements a server that exposes two remote services using RMI:

1. **Message Service**: A simple service with the `hello(String name)` method, which returns a greeting message.
2. **Student Service**: A service providing a list of `Student` objects, accessed via the `getStudents()` method.

### **Usage**:

1. The **RMIServer** binds both services (`message_service` and `student_service`) to the RMI registry on port `6666`.
2. The server listens for incoming client requests and responds with the appropriate data from the remote methods.

### **Running RMIServer**:

To start the server, run the **`RMIServer.java`** file:

```bash
java lk.jiat.rmi.RMIServer
```

This will start the RMI server and bind the remote services to the registry.

---

## **RMIClient**

The **RMIClient** project is a client application that interacts with the **RMIServer** by calling the remote services exposed by the server.

1. **Message Service**: The client calls the `message_service` to retrieve a greeting.
2. **Student Service**: The client calls the `student_service` to get a list of students.

### **Usage**:

1. The **RMIClient** connects to the server's RMI registry running on `localhost:6666`.
2. It looks up and calls the `message_service` for a greeting.
3. It also calls the `student_service` to retrieve a list of students.

### **Running RMIClient**:

To run the client, execute the **`RMIClient.java`** file:

```bash
java lk.jiat.rmi.RMIClient
```

The client will connect to the RMI server and display:

* A greeting from the `message_service`.
* A list of students fetched from the `student_service`.

---

## **Setup Instructions**

### 1. Clone the Repository:

```bash
git clone https://github.com/chamikathereal/Java-RMI.git
cd Java-RMI
```

### 2. Build the Projects:

Make sure you have **Java** and a build tool like **Maven** or **Gradle** installed. If using Maven:

```bash
mvn clean install
```

### 3. Run the RMIServer:

In the **RMIServer** project, run the **`RMIServer.java`** file to start the server:

```bash
java lk.jiat.rmi.RMIServer
```

### 4. Run the RMIClient:

In the **RMIClient** project, run the **`RMIClient.java`** file to start the client:

```bash
java lk.jiat.rmi.RMIClient
```

---

## **Example Output**

After running the **RMIClient**, you should see output similar to this:

```bash
message_service
Hello, Chamika
1 Krishan : Kandy
2 Kamal : Colombo
3 Krishan : Gall
```

---

## **Contributing**

Feel free to fork this repository and submit pull requests with any improvements or bug fixes. Make sure to follow the coding conventions and write tests for any new features added.


