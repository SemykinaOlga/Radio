package ru.netology.domain;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation = 10;
    private int maxStation = 15;
    private int minStation = 0;
    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;

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
    }}
