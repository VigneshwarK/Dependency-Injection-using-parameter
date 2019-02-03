package com.vignesh.DIpractice.Player;

import com.vignesh.DIpractice.Map.MapInterface;

public class PlayerImplementation implements PlayerInterface{

	MapInterface mapInterface;
	int a;
	String b;
	
	public PlayerImplementation (MapInterface mapInterface, int a, String b) {
		this.a = a;
		this.b = b;
		this.mapInterface = mapInterface;
	}
	
	public void getMap() {
		// TODO Auto-generated method stub
		this.mapInterface.setMap(this.a, this.b);
	}

}