package test.observer.kuzatuvchilar;

import test.observer.Subject;

public class UzumUz implements Observer, Element {
    String tv;
    String mobile;
    String laptop;
    Subject omborxona;

    public UzumUz(Subject subject){
        this.omborxona = subject;
        omborxona.registerObserver(this);
    }
    @Override
    public void update(String tv, String mobile, String laptop) {
        this.tv = tv;
        this.mobile = mobile;
        this.laptop = laptop;
        display();
    }

    @Override
    public void display() {
        System.out.println("Uzum marketda: \t\t\t\t\n" +
                            "tv: " + tv +"\t\t\t\t\n"+
                            "mobile: " + mobile + "\t\t\t\t\n"+
                            "laptop: " + laptop + "\t\t\t\t\n");
    }
}
