package V3_ÖvnUppg5_multiVäder;


import java.io.IOException;
import java.net.*;

public class TemperatureCollector {

    TemperatureCollector() throws  IOException {
        String ip = "234.235.236.237";
        InetAddress iadr = InetAddress.getByName(ip);
        int port = 12540;

        MulticastSocket socket = new MulticastSocket(port);
        InetSocketAddress group = new InetSocketAddress(iadr, port);
        //got by running ListNetworkInterface-program, yours may be different
        NetworkInterface netIf = NetworkInterface.getByName("wlan3");

        socket.joinGroup(group, netIf);
        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);
        }
    }

    public static void main(String[] args) throws  IOException {
        TemperatureCollector tc = new TemperatureCollector();
    }
}
