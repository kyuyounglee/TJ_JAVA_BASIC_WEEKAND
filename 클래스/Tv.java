package com.java.object;

/**
 * 
 * ���� ä��, ���� , �ø��� �ѹ�(0�� ���� �����ؼ� �������̸� ���° ������ǰ���� �˷��ش�) channel(0 ~ 200)
 * volume(0 ~ 50) serial(0~ ) �޼ҵ� ��������(++) ����(--) volumeUp --> �������� �ϳ� ����
 * volumDown --> �������� �ϳ� ���� ä������(++) ����(--) channelUp --> ä�ΰ��� �ϳ� ���� channelDown
 * --> ä�ΰ��� �ϳ� ����
 * 
 */
public class Tv {
	private int channel, volume, serial;
	private static int number;
	
	// ��ü�� �����ɶ� ���� serial���� ������Ų��... serial++
	// --> �����ڸ� �̿��ض�..
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
