import javax.swing.*;

/**
 * Class PingPongMain - Starts the Threads of both PingPonR and PingPongT
 *
 * @author Manuel Fellner
 * @version 2024-02-19
 */
public class PingPongMain {
    public static void main(String[] args) {
        try {
            // 2 Threads from PingPongT
            PingPongT ppT1 = new PingPongT("Ping");
            PingPongT ppT2 = new PingPongT("Ping");

            // 2 Threads from PingpongR
            PingPonR ppR1 = new PingPonR("Thread 3.", "Pong");
            PingPonR ppR2 = new PingPonR("Thread 4.", "Pong");
            Thread ppR1Thread = new Thread(ppR1);
            Thread ppR2Thread = new Thread(ppR2);

            // start all threads
            ppT1.start();
            ppT2.start();
            ppR1Thread.start();
            ppR2Thread.start();

            // wait 10s (= 10 000ms)
            Thread.sleep(10000);

            // end all threads
            ppT1.setRunning(false);
            ppT2.setRunning(false);
            ppR1.setRunning(false);
            ppR2.setRunning(false);
        } catch (Exception e) { }
    }
}
