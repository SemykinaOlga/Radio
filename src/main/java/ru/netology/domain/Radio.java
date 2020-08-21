package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int currentStation, int maxStation, int currentVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume(){
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume = currentVolume - 1;
    }
    public void increaseStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        }
        else currentStation = currentStation + 1;
    }

    public void decreaseStation(){
        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
        else currentStation = currentStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }
}
