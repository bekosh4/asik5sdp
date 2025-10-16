package com.example.gameaudio.subsystem;

//subsystem 3
public class VoicePlayer {
    private boolean compression = true;
    public void enableCompression(boolean on) {
        compression = on; System.out.println("[Voice] Compression=" + compression);
    }
    public void playLine(String actor, String line) {
        System.out.println("[Voice] " + actor + ": \"" + line + "\"");
    }
    public void stop() { System.out.println("[Voice] Stop"); }
}
