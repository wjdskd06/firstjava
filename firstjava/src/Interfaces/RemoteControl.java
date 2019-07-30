package Interfaces;

public interface RemoteControl {
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리합니다.");
		else
			System.out.println("무음처리를 해제 합니다.");
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체 합니다.");
	}

}
