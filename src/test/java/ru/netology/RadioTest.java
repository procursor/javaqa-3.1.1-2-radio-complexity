package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio station = new Radio();

    @Test
    void shouldIncrementStationNumber() {
        station.tune(5);
        assertEquals(6, station.next());
    }

    @Test
    void shouldDecrementStationNumber() {
        station.tune(5);
        assertEquals(4, station.prev());
    }

    @Test
    void shouldSetFirstStationNumberOnIncrement() {
        station.tune(9);
        assertEquals(0, station.next());
    }

    @Test
    void shouldSetLastStationNumberOnDecrement() {
/*      Radio station.stationNumber should be initialized by 0 on object creation
        station.tune(0);
*/
        assertEquals(9, station.prev());
    }

    @Test
    void shouldNotSetStationIfNumberLessThanFirstStation() {
        station.tune(5);
        assertEquals(5, station.tune(-10));
    }
    @Test
    void shouldNotSetStationIfNumberGreaterThanLastStation() {
        station.tune(5);
        assertEquals(5, station.tune(10));
    }


    @Test
    void volUpAboveMax(){
        station.volume(10);
        assertEquals(10, station.volUp());
    }

    @Test
    void volDownBelowMin(){
        station.volume(0);
        assertEquals(0, station.volDn());
    }

    @Test
    void volUpNormal(){
        station.volume(5);
        assertEquals(6, station.volUp());
    }

    @Test
    void volDnNormal(){
        station.volume(5);
        assertEquals(4, station.volDn());
    }
}