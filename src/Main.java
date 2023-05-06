import gui.Screen;
import track.Tracking;
import fileReading.SavfReading;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;


public class Main
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();
        SavfReading svf = new SavfReading();
        svf.scan("./data/settings.savf");
        Integer frequency = Integer.parseInt(svf.getValue("freq"));
        frequency = frequency*1000;
        timer.schedule(new Main.MyTask(), frequency);

        // screen
        new Screen();
    }
    static class MyTask extends TimerTask {
        public void run() {
            System.out.println("Smtp run");
        }
    }
}