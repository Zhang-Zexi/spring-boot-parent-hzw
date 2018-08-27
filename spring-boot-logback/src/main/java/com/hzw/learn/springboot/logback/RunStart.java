package com.hzw.learn.springboot.logback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hzw.learn.springboot.logback.runer1.LevelTest1;
import com.hzw.learn.springboot.logback.runer2.LevelTest2;
import com.hzw.learn.springboot.logback.runerother.ExceptionTest;
import com.hzw.learn.springboot.logback.runerother.OutLogForHHH;
import com.hzw.learn.springboot.logback.runerother.OutLogForWWW;
import com.hzw.learn.springboot.logback.runerother.OutLogForZZZ;

@Component
public class RunStart implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("run start ...");
		new Thread(new LevelTest1()).start();
//		new Thread(new LevelTest2()).start();
//		new Thread(new ExceptionTest()).start();
		new Thread(new OutLogForHHH()).start();
		new Thread(new OutLogForZZZ()).start();
		new Thread(new OutLogForWWW()).start();
		
	}

}
