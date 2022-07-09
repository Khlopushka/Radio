package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void currentStationNumber() {
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());

    }

    @Test
    void currentStationNumberV2() {
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void currentStationNumberV3() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void currentStationNumberV4() {
        radio.setCurrentStation(1);
        Assertions.assertEquals(1, radio.getCurrentStation());

    }

    @Test
    void currentStationNumberV5() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void nextStation() {
        radio.setCurrentStation(8);
        radio.setNextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void nextStationV2() {

        radio.setCurrentStation(9);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(3);
        radio.setPrevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());

    }

    @Test
    void prevStationV2() {
        radio.setCurrentStation(9);
        radio.setPrevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());

    }

    @Test
    void prevStationV3() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void findCurrentVolume() {
        radio.setCurrentVolumе(35);
        Assertions.assertEquals(35, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolumeV2() {
        radio.setCurrentVolumе(4);
        Assertions.assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolumeV3() {
        radio.setCurrentVolumе(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolumeV4() {
        radio.setCurrentVolumе(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolumeV5() {
        radio.setCurrentVolumе(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolumeV6() {
        radio.setCurrentVolumе(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void turnUpTheVolume() {
        radio.setCurrentVolumе(35);
        radio.setIncreaseVolume();
        Assertions.assertEquals(36, radio.getCurrentVolume());

    }

    @Test
    void turnUpTheVolumeV2() {
        radio.setCurrentVolumе(99);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void turnUpTheVolumeV3() {
        radio.setCurrentVolumе(100);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void turnDownTheVolume() {
        radio.setCurrentVolumе(1);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void turnDownTheVolumeV2() {
        radio.setCurrentVolumе(100);
        radio.setDecreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void turnDownTheVolumeV3() {
        radio.setCurrentVolumе(0);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
