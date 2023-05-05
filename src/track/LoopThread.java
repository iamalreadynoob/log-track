package track;

import javax.swing.*;
public class LoopThread
{
    private boolean isRun;
    private int situation;
    private Tracking tracking;

    public LoopThread(int situation)
    {
<<<<<<< HEAD
=======
        this.situation = situation;
        isRun = true;
    }

    @Override
    public void start()
    {
>>>>>>> 319a8cde6f9b2dd19235051a6133df05bbb88059
        tracking = new Tracking(situation);
        tracking.process();
        isRun = true;
    }


    public void stopLoop()
    {
        tracking.stopListening();
        isRun = false;
    }
}
