package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int amountStations = 10;
    private int minStation;
    private int maxStation = 9;

    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public int getAmountStation() {
        return amountStations;
    }

    public Radio(int amountStations) {
        this.amountStations = amountStations;

    }

    public Radio() {

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > amountStations - 1) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        if (currentStation == amountStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = amountStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolumе(int currentVolumе) {
        if (currentVolumе < minVolume) {
            return;
        }
        if (currentVolumе > maxVolume) {
            return;
        }
        this.currentVolume = currentVolumе;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }


    public void setDecreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }


}
