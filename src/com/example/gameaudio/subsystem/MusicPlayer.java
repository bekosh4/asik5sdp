package com.example.gameaudio.subsystem;

//subsystem 1
public class MusicPlayer {
    private int volume = 70;
    public void loadTrack(String name) {
        System.out.println("[Music] Load track: " + name);
    }
    public void play() {
        System.out.println("[Music] Play (vol=" + volume + ")");
    }
    public void stop() {
        System.out.println("[Music] Stop");
    }
    public void setVolume(int v) {
        volume = clamp(v); System.out.println("[Music] Volume=" + volume);
    }
    private int clamp(int v) { return Math.max(0, Math.min(100, v)); }
}
