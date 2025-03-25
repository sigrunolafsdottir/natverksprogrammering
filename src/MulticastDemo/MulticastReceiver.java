package MulticastDemo;

import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;

public class MulticastReceiver {

    public static void main(String[] args) throws IOException {
        int port = 20480;
        String ip = "239.0.1.2";
        InetAddress iadr = InetAddress.getByName(ip);

        InetSocketAddress group = new InetSocketAddress(iadr, port);
        NetworkInterface netIf = NetworkInterface.getByName("wlan3");

        MulticastSocket socket = new MulticastSocket(port);
        socket.joinGroup(group, netIf);

        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Meddelande från " + packet.getAddress().getHostAddress() + " " + LocalDateTime.now());
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);
        }
    }
}
