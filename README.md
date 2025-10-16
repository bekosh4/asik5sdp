# Facade Pattern — Game Audio System

## Idea
Provide a simple, unified interface (`GameAudioFacade`) to a complex audio subsystem (music, sfx, voice, ambience).  
Client code becomes clean: `playBattleMode()`, `playCutscene(...)`, `stopAll()`.

## Structure
- Subsystems: `MusicPlayer`, `SoundEffectPlayer`, `VoicePlayer`, `EnvironmentAudio`
- Facade: `GameAudioFacade`
- Client: `Demo`

## Why Facade (vs Adapter/Bridge)
- Facade **simplifies usage** of multiple subsystems.
- Adapter **converts** one interface to another.
- Bridge **decouples** abstraction from implementation.

## Run
```bash
javac -d out $(find src -name "*.java")
java -cp out com.example.gameaudio.Demo
