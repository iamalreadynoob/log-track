package track;

import fileReading.TextReading;

public class Tracking
{
    private int limitSize;
    public Tracking()
    {
        limitSize = TextReading.getSize("data/info.log", 8);
    }
    public void process()
    {
        //TODO: while comes here
    }

}
