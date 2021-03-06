package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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
}
