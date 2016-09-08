package org.cap.bankapp.test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runners.JUnit4;

public class TestRunners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JUnit4 unitCore= new JUnitCore();
unitCore.addListener(new TextListener(System.out));

	}

}
