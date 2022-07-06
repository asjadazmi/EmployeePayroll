package com.bridgelabzemployeepayroll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NIOFileApiTest {
	private static String HOME=System.getProperty("user.home");
	private static String Play_NIO="TempPlayGround";
	@Test
	public void confirm() throws IOException {
		Path homepath=Paths.get(HOME);
	    Assertions.assertTrue(Files.exists(homepath));
			
		}
	
	}



