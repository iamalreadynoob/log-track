package track;

import fileReading.TextReading;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tracking
{
    private int limitSize;
    public Tracking()
    {
        //TODO: null pointer excepiton
        //limitSize = TextReading.getSize("data/info.log", 8);
    }
    public void process(JButton stopper)
    {
        LoopThread loop = new LoopThread();

        loop.run();
        stopper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                loop.stopLoop();
                //TODO: Log send
            }
        });

    }

}
