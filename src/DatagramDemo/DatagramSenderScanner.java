package DatagramDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class DatagramSenderScanner {

   // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    //InetAddress toAdr = InetAddress.getLocalHost();
    InetAddress toAdr = InetAddress.getByName("172.20.200.118");
    int toPort = 55555;
    DatagramSocket socket = new DatagramSocket();
    DatagramPacket packet;
    byte[] data;
    String prompt = "Och vad har du på hjärtat? ";
    String message;

    public DatagramSenderScanner() throws UnknownHostException, SocketException, IOException {
        System.out.println(prompt);
        while (sc.hasNextLine()) {
            message = sc.nextLine();
            if (message.equals("bye")) System.exit(0);
            data = message.getBytes();
            packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
            System.out.println(prompt);
        }
        System.exit(0);
    }

    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        DatagramSenderScanner dgs = new DatagramSenderScanner();
    }
}
