package com.hzw.learn.springboot.mina.scin1.c1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hzw.learn.springboot.mina.scin1.zother.HzwAbstractIoHandler;
import com.hzw.learn.springboot.mina.scin1.zother.HzwLongTermClientIoHandler;
import com.hzw.learn.springboot.mina.scin1.zother.HzwShortTermClientIoHandler;

public class C1Handler 
//extends HzwLongTermClientIoHandler 
extends HzwShortTermClientIoHandler
{
	
	Logger log = LoggerFactory.getLogger("C1");
}
