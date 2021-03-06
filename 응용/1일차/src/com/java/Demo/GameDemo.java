package com.java.Demo;

import com.java.graphic.Amd;
import com.java.graphic.Game;
import com.java.graphic.Nvidia;

public class GameDemo {

	public static void main(String[] args) {
		Game g = new Game();
		g.display(new Amd());
		g.display(new Nvidia());
	}

}
