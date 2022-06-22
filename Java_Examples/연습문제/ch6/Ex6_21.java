package ch6;

public class Ex6_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: "+t.channel+", VOL: "+t.volume);

		t.channelDown();
		t.volumeDown();
		System.out.println("CH: "+t.channel+", VOL: "+t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: "+t.channel+", VOL: "+t.volume);
	}
}

class MyTv{
	//클래스 멤버 = 클래스 변수 = 클래스 필드
	boolean isPowerOn;
	int channel;
	int volume;
	
	//final이라 값이 변하지않음, 고정된 값
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//!는 현재 boolean의 반대값을 반환
	void turnOnOff(){
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume<MAX_VOLUME)
			volume++;
	}
	
	void volumeDown() {
		if(volume>MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {
		if(channel<MAX_CHANNEL)
			channel++;
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
	}
	
	void channelDown() {
		if(channel>MIN_CHANNEL)
			channel--;
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
	}
}
