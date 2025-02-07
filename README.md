# Java Chat Application

This is a simple client-server chat application written in Java. It allows multiple clients to connect to a server and exchange messages in real-time.

## Features

- Supports multiple clients using threading.
- Server-side broadcasting of messages.
- Clients can send and receive messages asynchronously.
- The server can send messages to all clients.

## Project Structure

- `Server.java` - Handles client connections and message broadcasting.
- `Client.java` - Connects to the server and facilitates user communication.
- `App.java` - Entry point (not yet implemented).

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed (Java 8 or later).

### Running the Server

1. Compile the server code:
   ```sh
   javac Server.java
2. Run the server code:
   ```sh
   java Server
### Running the Client

1. Compile the Client code:
   ```sh
   javac Client.java
2. Run the Client code:
   ```sh
   java Client
