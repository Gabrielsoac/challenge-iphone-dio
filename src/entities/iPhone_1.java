package entities;

import interfaces.Browser;
import interfaces.CellPhone;
import interfaces.MP3_Player;

public class iPhone_1 extends iPhone implements Browser, MP3_Player, CellPhone {

    public iPhone_1(String MAC, String model, Double RAM, Double storagement) {
        super(MAC, model, RAM, storagement);
    }

    @Override
    public void toCall() {
        System.out.println("Calling...");
    }

    @Override
    public void inviteSMS() {
        System.out.println("Inviting SMS...");
    }

    @Override
    public void play() {
        System.out.println("Playing music list...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music list...");
    }

    @Override
    public void next() {
        System.out.println("Next music list...");
    }

    @Override
    public void prev() {
        System.out.println("Previous music list...");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening browser...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser...");
    }

    @Override
    void turnOn() {
        System.out.println("Iphone on");
    }

    @Override
    void turnOff() {
        System.out.println("Iphone off");
    }

    @Override
    public String toString() {
        return "iPhone_1{" +
                "MAC='" + MAC + '\'' +
                ", model='" + model + '\'' +
                ", RAM=" + RAM +
                ", storagement=" + storagement +
                '}';
    }
}
