package ru.netology.smarthome;

/**
 * The type Radio, implements:
 *
 * next()
 * prev()
 * tune(int)
 *
 * volUp()
 * volDn()
 *
 */
public class Radio {
    private static final int FIRST_STATION = 0;
    private static final int LAST_STATION = 9;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 10;

    private int stationNumber;
    private int stationVolume;

    public int next() {
        int num = getStationNumber();
        if (num == LAST_STATION) {
            num = FIRST_STATION;
        } else
            ++num;

        return tune(num);
    }

    public int prev() {
        int num = getStationNumber();
        if (num == FIRST_STATION) {
            num = LAST_STATION;
        } else
            --num;

        return tune(num);
    }

    public int tune(int stationNumber) {
        setStationNumber(stationNumber);
        return getStationNumber();
    }

    void setStationNumber(int stationNumber) {
        if (stationNumber < FIRST_STATION || stationNumber > LAST_STATION) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int volUp() {
        int vol = getStationVolume();
        if (vol < MAX_VOLUME) {
            vol = volume(vol + 1);
        }
        return vol;
    }

    public int volDn() {
        int vol = getStationVolume();
        if (vol > MIN_VOLUME) {
            vol = volume(vol - 1);
        }
        return vol;
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
