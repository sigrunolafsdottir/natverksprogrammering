package V3_ÖvnUppg1_Citat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class QuoteSender {
    List<String> quoteList = List.of(
            "Dreams and deception is a powerful combination",
            "Whatever your're thinking, think bigger.",
            "Maybe swearing will help?");
    int listCounter = 0;
    InetAddress toAdr = InetAddress.getLocalHost();
    int toPort = 55555;

    public QuoteSender() throws IOException, InterruptedException {
        DatagramSocket socket = new DatagramSocket();
        while (true) {
            byte[] data = quoteList.get(listCounter).getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
            listCounter = (listCounter + 1) % 3;
            Thread.sleep(3000);
        }
    }

    public static void main(String[] args) throws UnknownHostException, SocketException, IOException, InterruptedException {
        QuoteSender sender = new QuoteSender();
    }
}
