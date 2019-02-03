package com.vignesh.DIpractice.Injector;

import com.vignesh.DIpractice.Map.ErangleImplementation;
import com.vignesh.DIpractice.Player.PlayerImplementation;
import com.vignesh.DIpractice.Player.PlayerInterface;

public class ErangleInjector implements InjectorInterface{

		@Override
	public PlayerInterface getPlayer(int a, String b) {
		// TODO Auto-generated method stub
		PlayerImplementation Obj = new PlayerImplementation(new ErangleImplementation(), a, b);
		return Obj;
	}
}
