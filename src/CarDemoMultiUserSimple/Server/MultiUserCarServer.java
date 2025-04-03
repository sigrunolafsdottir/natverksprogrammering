package CarDemoMultiUserSimple.Server;

import CarDemoProtocol.Server.CarProtokoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class MultiUserCarServer extends Thread {

    private Socket clientSocket;
    private Database db = new Database();

    public MultiUserCarServer(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
    }


    public void run() {

        try (
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine;
            String outputLine;

            System.out.println("up and running");
            out.println("Servern önskar hej och välkommen!");

            while ((inputLine = in.readLine()) != null) {
                outputLine = db.getCarData(inputLine.trim());
                if (outputLine == null) {
                    out.println("Denna bil finns inte i databasen");
                } else {
                    out.println(outputLine);
                }
            }

            /*
            CarProtokoll protocol = new CarProtokoll();
            out.println(protocol.processInput(null));

            while ((inputLine = in.readLine()) != null) {
                out.println(protocol.processInput(inputLine));
            }

             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
