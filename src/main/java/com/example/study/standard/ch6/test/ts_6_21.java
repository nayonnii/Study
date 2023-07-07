package test;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CAHNNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
		if(volume > MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {
		if(channel == MAX_CAHNNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}
	
	void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CAHNNEL;
		}
		channel--;
	}
	
}

public class ts_6_21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL: " + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL: " + t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL: " + t.volume);

	}
}
