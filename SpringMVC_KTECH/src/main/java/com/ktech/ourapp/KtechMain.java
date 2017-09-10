package com.ktech.ourapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ktech.ourapp.service.IKtechService;

public class KtechMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("spring/application-config.xml");
		IKtechService ktechService = context.getBean("ktechService", IKtechService.class);
		
	}
}
