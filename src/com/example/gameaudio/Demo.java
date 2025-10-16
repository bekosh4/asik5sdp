package com.example.gameaudio;

// Client
public class Demo {
    public static void main(String[] args) {
        GameAudioFacade audio = new GameAudioFacade();

        audio.playPeacefulMode();
        System.out.println("--- transition --->");
        audio.playBattleMode();
        System.out.println("--- cutscene --->");
        audio.playCutscene("Hero", "We will win.");
        System.out.println("--- stop all --->");
        audio.stopAll();
    }
}
