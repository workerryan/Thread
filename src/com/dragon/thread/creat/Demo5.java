package com.dragon.thread.creat;

import java.util.Timer;
import java.util.TimerTask;

public class Demo5 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("running ... ");
			}
		}, 0, 1000);
	}
}
