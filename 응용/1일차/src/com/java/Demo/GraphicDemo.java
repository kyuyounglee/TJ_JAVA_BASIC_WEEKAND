package com.java.Demo;

import com.java.graphic.Amd;
import com.java.graphic.GraphicCard;
import com.java.graphic.Nvidia;

public class GraphicDemo {

	public static void main(String[] args) {		
//		GraphicCard gc = new GraphicCard();
//		gc.process();
//		gc = new Amd();
//		gc.process();
//		gc = new Nvidia();
//		gc.process();
		
		GraphicCard[] gcArray = new GraphicCard[5];
		gcArray[0] = new Nvidia();
		gcArray[1] = new Amd();
		gcArray[2] = new Amd();
		gcArray[3] = new Nvidia();
		gcArray[4] = new Nvidia();
		
		for (int i = 0; i < gcArray.length; i++) {
			gcArray[i].process();
		}
	}

}
