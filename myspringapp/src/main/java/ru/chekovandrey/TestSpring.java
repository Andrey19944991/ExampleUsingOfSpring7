package ru.chekovandrey;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationcontext.xml");
        //данный класс обращается к applicationscontext, читает его, создаёт бины
        //и помещает их в ClassPathXmlApplicationContext
        //Music music =context.getBean("musicBean",Music.class);//получаем наш бин, первый арг=id,
        // второй название класса,
        //В конфигурационном файле можно менять тип музыки
        //Ручное внедрение зависимости (не через Spring):
        //MusicPlayer musicPlayer=new MusicPlayer(music);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        // и также именно в конфигурационном файле меняется тип музыки
        context.close(); //в конце закрываем
    }
}
