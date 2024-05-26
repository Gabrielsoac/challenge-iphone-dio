package interfaces;

import entities.Music;

import java.util.ArrayList;
import java.util.List;

public interface MP3_Player {

    List<Music> musicList = new ArrayList<>();

    void play(List<Music> musicList);
    void stop(List<Music> musicList);
    void next(List<Music> musicList);
    void prev(List<Music> musicList);

}
