package com.example.gameaudio.subsystem;

//subsystem 4
public class EnvironmentAudio {
    private int reverb = 30;
    public void setReverb(int value) {
        reverb = clamp(value); System.out.println("[Env] Reverb=" + reverb);
    }
    public void playAmbience(String name) {
        System.out.println("[Env] Ambience '" + name + "' playing (reverb=" + reverb + ")");
    }
    public void stop() { System.out.println("[Env] Stop"); }
    private int clamp(int v) { return Math.max(0, Math.min(100, v)); }
}
