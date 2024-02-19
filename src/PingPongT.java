/**
 * Class PingPongT - Thread that prints "Ping" or "Pong", extends the Thread class directly
 *
 * @author Manuel Fellner
 * @version 2024-02-19
 */
public class PingPongT extends Thread {
    private String pingOrPong;
    private boolean running;

    public PingPongT (String pingOrPong)    {
        this.pingOrPong = pingOrPong;

        this.running = true;
    }

    public void setRunning (boolean running)    {
        this.running = running;
    }

    @Override
    public void run()   {
        while (this.running)    {
            System.out.println(this.getName() + ": " + this.pingOrPong);
        }
    }
}
