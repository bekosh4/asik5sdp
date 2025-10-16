package com.example.gameaudio.subsystem;

//subsystem 2
public class SoundEffectPlayer {
    private int volume = 80;
    public void preload(String... names) {
        for (String n : names) System.out.println("[SFX] Preload: " + n);
    }
    public void play(String name) {
        System.out.println("[SFX] Play '" + name + "' (vol=" + volume + ")");
    }
    public void setVolume(int v) {
        volume = clamp(v); System.out.println("[SFX] Volume=" + volume);
    }
    public void stopAll() {
        System.out.println("[SFX] Stop all");
    }
    private int clamp(int v) { return Math.max(0, Math.min(100, v)); }
}
