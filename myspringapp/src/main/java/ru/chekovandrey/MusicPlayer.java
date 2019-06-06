package ru.chekovandrey;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList=new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    // IoC
    public MusicPlayer(List<Music> music) {
        this.musicList=music;
    }


    public MusicPlayer(){}

    public void setMusicList(List<Music> musicList){ //Spring из конфигурац. файла ищет метод set"name"
        this.musicList=musicList;              //name=music, поэтому он ищет setMusic и выполняет
    }

    public void playMusic(){
        for(Music ml:musicList)
        System.out.println("Playing: "+ml.getSong());
    }
}
