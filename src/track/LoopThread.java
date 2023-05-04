package track;

public class LoopThread extends Thread
{
    private boolean isRun;

    public LoopThread()
    {
        isRun = true;
    }

    @Override
    public void start() {

        while (isRun)
        {
            new Tracking().process();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        isRun = true;
    }

    public void stopLoop() {isRun = false;}
}
