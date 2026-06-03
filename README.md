# MULTITHREADED-CHAT-APPLICATION

COMPANY:CODTECH IT SOLUTIONS PRIVATE LIMITED

NAME:ANISHA PRIYADARSHINI

INTERN ID:CITS333

DOMAIN:JAVA PROGRAMMING

DURATION:6 WEEKS

MENTOR:NEELA SANTOSH

Multithreaded Chat Application Using Java

Introduction

Communication systems are an important part of modern software applications. Chat applications allow users to exchange messages in real time through a network connection. This project demonstrates the development of a Multithreaded Chat Application using Java Socket Programming and Multithreading concepts. The application follows a client-server architecture where multiple clients can connect to a central server and communicate with each other simultaneously.

The project helps in understanding networking concepts, socket communication, thread management, and real-time message broadcasting in Java.

Objective

The primary objective of this project is to build a client-server chat application that enables multiple users to communicate in real time. The server manages client connections and message distribution, while clients can send and receive messages concurrently.

Project Overview

The application consists of three main classes:

ChatServer.java
ClientHandler.java
ChatClient.java

The server listens for incoming client connections and creates a separate thread for each connected client. This allows multiple users to interact with the server simultaneously without affecting the performance of other users.

Each client connects to the server using sockets and can send messages that are broadcast to all other connected clients.

Working of the Application

When the server program starts, it creates a ServerSocket on port 1234 and waits for client connections. Whenever a new client joins, the server accepts the connection and creates a new ClientHandler thread for that client.

The ClientHandler class continuously listens for messages from its assigned client. Whenever a message is received, it is forwarded to the server. The server then broadcasts the message to all other connected clients.

On the client side, the user enters their name and connects to the server. Two activities occur simultaneously:

Sending messages to the server.
Receiving messages from other users.

To achieve this, a separate thread is used for receiving messages while the main thread handles user input and message transmission.

Technologies Used

Java Programming Language,
Java Socket Programming,
Multithreading,
ServerSocket,
Socket,
BufferedReader,
PrintWriter,
Object-Oriented Programming (OOP)

Features

Real-time communication between multiple users.
Client-server architecture.
Multithreaded server implementation.
Simultaneous message sending and receiving.
Automatic message broadcasting.
Support for multiple client connections.
Console-based user interface.
Class Description

ChatServer.java

Starts the server.
Accepts client connections.
Maintains a list of connected clients.
Broadcasts messages to all clients.
ClientHandler.java

Handles communication with individual clients.
Runs in a separate thread.
Receives and forwards messages.
ChatClient.java

Connects users to the server.
Sends messages entered by the user.
Receives messages from other clients using a dedicated thread.

OUTPUT

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/8049b94e-feb5-4795-970c-4cd36fb35195" />
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/92984fa5-f038-40ca-8681-9a3794d2ff45" />
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/c6e44722-c1e6-455a-b427-f6f4bc498810" />
