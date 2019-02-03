package com.vignesh.DIpractice.Game;

import java.util.Scanner;

import com.vignesh.DIpractice.Injector.ErangleInjector;
import com.vignesh.DIpractice.Injector.MirarmerInjector;
import com.vignesh.DIpractice.Player.PlayerInterface;

public class StartMatch {

	public static void main(String[] args) {
		System.out.println("Enter id, name and map\n Map available only : erangle, mirarmer");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter id ");
		int id = in.nextInt();
		System.out.print("Enter name ");
		String name = in.next();
		System.out.print("Enter available map ");
		String map = in.next();
		PlayerInterface player = null;
		switch(map) {
		// TODO Auto-generated method stub
		default:
			System.out.println(map+" map is not available");
			
		case "erangle":
		{
			ErangleInjector erangleObject = new ErangleInjector();
			player = erangleObject.getPlayer(id, name);
			player.getMap();
			break;
		}
		case "mirarmer":
		{
			MirarmerInjector mirarmerObject = new MirarmerInjector();
			player = mirarmerObject.getPlayer(id,name);
			player.getMap();
			break;
		}
	}
}

}
