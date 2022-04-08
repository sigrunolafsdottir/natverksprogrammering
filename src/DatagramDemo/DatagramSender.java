package DatagramDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DatagramSender {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    InetAddress toAdr = InetAddress.getLocalHost();
    int toPort = 55555;
    DatagramSocket socket = new DatagramSocket();
    DatagramPacket packet;
    byte[] data;
    String prompt = "Och vad har du på hjärtat? ";
    String message;

    public DatagramSender() throws UnknownHostException, SocketException, IOException {
        System.out.println(prompt);
        while ((message = in.readLine()) != null) {
            if (message.equals("bye")) System.exit(0);
            data = message.getBytes();
            packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
            System.out.println(prompt);
        }
        System.exit(0);
    }

    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        DatagramSender dgs = new DatagramSender();
    }
}
