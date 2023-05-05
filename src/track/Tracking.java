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

                break;
            case 1:
                System.out.println("keyboard is listening");
                break;
            case 2:
                System.out.println("both of them are listening");
                // keyboard

                break;
        }
    }

    protected void stopListening() {
        System.out.println("Stop");
    }
}
