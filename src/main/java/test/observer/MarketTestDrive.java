package test.observer;

import test.observer.kuzatuvchilar.Observer;
import test.observer.kuzatuvchilar.UzumUz;

public class MarketTestDrive {
    public static void main(String[] args) {
        Omborxona omborxona = new Omborxona();
        UzumUz u = new UzumUz(omborxona);
        omborxona.setMeasurement("artel 41", "iphone 15max", "acer 2247");
    }
}
