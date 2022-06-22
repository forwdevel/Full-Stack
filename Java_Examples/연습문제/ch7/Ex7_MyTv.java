package ch7;

public class Ex7_MyTv {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setChannel(20);
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		
		t.setVolume(20);
		System.out.println("VOL: "+t.getVolume());
	}
}

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev;
	private int next;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		prev = this.channel; //Save previous channel
		this.channel = channel;
		next = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void gotoPrevChannel(){
		this.channel = prev; //Return to last channel
		prev = next;
	}
}// MyTv2
