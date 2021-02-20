package com.java.object;

/**
 * 
 * 변수 채널, 볼륨 , 시리얼 넘버(0번 부터 시작해서 정수형이며 몇번째 생산제품인지 알려준다) channel(0 ~ 200)
 * volume(0 ~ 50) serial(0~ ) 메소드 볼륨증가(++) 감소(--) volumeUp --> 볼륨값을 하나 증가
 * volumDown --> 볼륨값을 하나 감소 채널증가(++) 감소(--) channelUp --> 채널값을 하나 증가 channelDown
 * --> 채널값을 하나 감소
 * 
 */
public class Tv {
	private int channel, volume, serial;
	private static int number;
	
	// 객체가 생성될때 마다 serial값을 증가시킨다... serial++
	// --> 생성자를 이용해라..
	public Tv() {
		number++;
		serial = number;
	}

	void volumeUp() {
		if(!(volume >= 50)){
			volume++; 
		}		
	}

	void volumeDown() {
		if (!(volume <= 0)) {
			volume--;
		}
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
	
	int getSerial() {
		return serial;
	}

}
