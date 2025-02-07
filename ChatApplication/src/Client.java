import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try {

            @SuppressWarnings("resource")
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Connected to server at " + SERVER_ADDRESS + ":" + SERVER_PORT);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            new Thread(() -> {
                try{
                    String serverResponse;
                    while((serverResponse = in.readLine()) != null){
                        System.out.println(serverResponse);
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
            
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            String userInput;
            while(true){
                userInput = scanner.nextLine();
                out.println(userInput);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

