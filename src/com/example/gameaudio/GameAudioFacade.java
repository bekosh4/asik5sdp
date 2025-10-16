package com.example.gameaudio;

import com.example.gameaudio.subsystem.*;

// Facade
public class GameAudioFacade {
    private final MusicPlayer music = new MusicPlayer();
    private final SoundEffectPlayer sfx = new SoundEffectPlayer();
    private final VoicePlayer voice = new VoicePlayer();
    private final EnvironmentAudio env = new EnvironmentAudio();

    // high level
    public void playPeacefulMode() {
        System.out.println("== Enter Peaceful Mode ==");
        music.loadTrack("peaceful_theme");
        music.setVolume(45);
        music.play();

        env.setReverb(20);
        env.playAmbience("birds_and_wind");

        sfx.setVolume(50);
        sfx.preload("ui_click");

        voice.enableCompression(true);
    }

    public void playBattleMode() {
        System.out.println("== Enter Battle Mode ==");
        music.loadTrack("battle_theme");
        music.setVolume(85);
        music.play();

        env.setReverb(60);
        env.playAmbience("battlefield_rumble");

        sfx.setVolume(95);
        sfx.preload("sword_swing", "explosion", "damage");

        voice.enableCompression(false); // для выразительности реплик
        voice.playLine("Commander", "For glory!");
        sfx.play("sword_swing");
    }

    public void playCutscene(String actor, String line) {
        System.out.println("== Enter Cutscene ==");
        music.loadTrack("cutscene_theme");
        music.setVolume(55);
        music.play();

        env.setReverb(35);
        env.playAmbience("hall_echo");

        sfx.setVolume(40);
        voice.enableCompression(true);
        voice.playLine(actor, line);
    }

    public void stopAll() {
        System.out.println("== Stop All Audio ==");
        music.stop();
        env.stop();
        voice.stop();
        sfx.stopAll();
    }

    // additional settings
    public void sfx(String name) { sfx.play(name); }
}
