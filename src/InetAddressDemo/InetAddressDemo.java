package InetAddressDemo;

import java.io.UnsupportedEncodingException;
import java.net.*;

class InetAddressDemo {

    public static void main(String args[]) throws UnknownHostException {
        //Mitt eget IP

        InetAddress Address = InetAddress.getLocalHost();

        System.out.println(Address);
        System.out.println(Address.getHostAddress());
        System.out.println(Address.getHostName());

        //Loopback, pekar alltid på den egna datorn
        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println(loopback);
    }
}