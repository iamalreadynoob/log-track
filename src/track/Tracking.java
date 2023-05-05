package track;




public class Tracking {


    private int limitSize, situation;




    public Tracking(int situation) {
        this.situation = situation;


        //TODO: null pointer excepiton
        //limitSize = TextReading.getSize("data/info.log", 8);
    }

    public Tracking() {
    }



    protected void process() {
        switch (situation) {
            case 0:
                System.out.println("mouse is listening");
<<<<<<< HEAD
=======
                try {
                    GlobalScreen.registerNativeHook();
                } catch (NativeHookException ex) {
                    System.err.println("Failed to register native hook");
                    System.exit(1);
                }
                GlobalScreen.addNativeMouseListener(new Tracking());
                GlobalScreen.addNativeMouseMotionListener(new Tracking());
>>>>>>> 319a8cde6f9b2dd19235051a6133df05bbb88059

                break;
            case 1:
                System.out.println("keyboard is listening");
                break;
            case 2:
                System.out.println("both of them are listening");
                // keyboard
                try {
                    GlobalScreen.registerNativeHook();
                } catch (NativeHookException e) {
                    e.printStackTrace();
                }
                GlobalScreen.addNativeKeyListener(listener);

<<<<<<< HEAD
=======

                // mouse
                try {
                    GlobalScreen.registerNativeHook();
                } catch (NativeHookException ex) {
                    System.err.println("Failed to register native hook");
                    System.exit(1);
                }
                GlobalScreen.addNativeMouseListener(new Tracking());
                GlobalScreen.addNativeMouseMotionListener(new Tracking());

>>>>>>> 319a8cde6f9b2dd19235051a6133df05bbb88059
                break;
        }
    }

    protected void stopListening() {
        System.out.println("Stop");
    }
}
