package fasade;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class Main {

    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.load();
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvdRom);

        Computer computer = new Computer();
        computer.copy();
    }
}

class Power{
    void on(){
        System.out.println("On power");
    }

    void off(){
        System.out.println("Off power");
    }
}

class DVDRom{

    private boolean data = false;

    public boolean hasData(){
        return this.data;
    }

    public void load(){
        data = true;
    }

    public void unload(){
        data = false;
    }
}

class HDD{
    public void copyFromDVD(DVDRom dvdRom){
        if (dvdRom.hasData()){
            System.out.println("Copy data from disk");
        }else {
            System.out.println("Insert disc");
        }
    }
}


//fasade
class Computer{
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}