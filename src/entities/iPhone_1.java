package entities;

import interfaces.Browser;
import interfaces.CellPhone;
import interfaces.MP3_Player;

import java.util.List;

public class iPhone_1 extends iPhone implements Browser, CellPhone, MP3_Player {
    @Override
    public void toCall(String number) {
        System.out.println("Calling...");
    }

    @Override
    public void inviteSMS(String number, String message) {
        System.out.printf("Inviting SMS: %s \n", message);
    }

    @Override
    public void play(List<Music> musicList) {
        System.out.println("Playing music list...");
    }

    @Override
    public void stop(List<Music> musicList) {
        System.out.println("Stopping music list...");
    }

    @Override
    public void next(List<Music> musicList) {
        System.out.println("Next music list...");
    }

    @Override
    public void prev(List<Music> musicList) {
        System.out.println("Previous music list...");
    }

    @Override
    public void openBrowser(Browser browser) {
        System.out.println("Opening browser...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser...");
    }
}
