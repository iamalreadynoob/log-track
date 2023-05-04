package track;

public class LoopThread extends Thread
{
    private boolean isRun;

    protected LoopThread()
    {
        isRun = true;
    }
    @Override
    public void run() {
        super.run();

        while (isRun)
        {
            System.out.println("This is working");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopLoop()
    {
        isRun = false;
    }
}
