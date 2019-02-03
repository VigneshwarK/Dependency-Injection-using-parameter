package com.vignesh.DIpractice.Injector;

import com.vignesh.DIpractice.Map.MirarmerImplementation;
import com.vignesh.DIpractice.Player.PlayerImplementation;
import com.vignesh.DIpractice.Player.PlayerInterface;

public class MirarmerInjector implements InjectorInterface{

	@Override
	public PlayerInterface getPlayer(int a, String b) {
		// TODO Auto-generated method stub
		PlayerImplementation obj = new PlayerImplementation(new MirarmerImplementation(), a, b);
		return obj;
	}

}
