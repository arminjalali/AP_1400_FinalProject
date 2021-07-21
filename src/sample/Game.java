package sample;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Game {
    private int time;

    public Game(){
        time = 180;
    }
    public void startTimeOfGame() throws InterruptedException {
        TimerTask timeOfGame = new TimerTask() {
            @Override
            public void run() {
                while (time != 0){
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        time--;
                        System.out.println(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("End of Game!");
                System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timeOfGame , 1);
    }
}
