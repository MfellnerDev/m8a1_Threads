/**
 * Class PingPongR - Thread that prints "Ping" or "Pong", implements the Runnable class
 *
 * @author Manuel Fellner
 * @version 2024-02-19
 */
public class PingPonR implements Runnable {
    private String name;
    private boolean running;

    public PingPonR (String name)    {
        this.name = name;
        this.running = true;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run()   {
        while (this.running) {
            System.out.println(this.name + "\n");
        }
    }
}
