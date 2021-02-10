package ru.netology;

public class Radio {
    private int stationNumber;
    private int stationVolume;

    final int firstStation = 0, lastStation = 9;
    final int minVolume = 0, maxVolume = 10;

    public int next(){
        int stationNumber = getStationNumber();

        if (stationNumber == lastStation)
            stationNumber = firstStation;
        else
            ++stationNumber;

        return tune(stationNumber);
    }

    public int prev(){
        int stationNumber = getStationNumber();

        if (stationNumber == firstStation)
            stationNumber = lastStation;
        else
            --stationNumber;

        return tune(stationNumber);
    }

    public int tune(int stationNumber) {
        setStationNumber(stationNumber);
        return getStationNumber();
    }

    void setStationNumber(int stationNumber) {
        if (stationNumber < firstStation)
            return;
        if (stationNumber > lastStation)
            return;

        this.stationNumber = stationNumber;
    }

   public int getStationNumber() {
        return stationNumber;
    }




    public int volUp() {
        int vol = getStationVolume();

        if (vol < maxVolume)
            ++vol;

        return volume(vol);
    }

    public int volDn() {
        int vol = getStationVolume();

        if (vol > minVolume)
            --vol;

        return volume(vol);
    }

    int volume(int vol) {
        setStationVolume(vol);
        return getStationVolume();
    }

    void setStationVolume(int stationVolume) {
        this.stationVolume = stationVolume;
    }

    public int getStationVolume() {
        return stationVolume;
    }
}
