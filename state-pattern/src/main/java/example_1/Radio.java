package example_1;

/**
 * Created by Mezentsev.Y on 2/25/2016.
 */
//context
public class Radio {

    Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation(){
        if (station instanceof Radio7){
            setStation(new RadioDFM());
        }else if (station instanceof RadioDFM){
            setStation(new VestiFm());
        }else if (station instanceof VestiFm){
            setStation(new Radio7());
        }
    }

    public void play(){
        station.play();
    }
}
