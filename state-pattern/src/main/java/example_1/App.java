package example_1;

/**
 * Created by Mezentsev.Y on 2/25/2016.
 */
public class App {
    public static void main(String[] args) {
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);

        for (int i = 0; i<10; i++){
            radio.play();
            radio.nextStation();

        }
    }
}
