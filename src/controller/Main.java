package controller;

import java.io.IOException;
import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws IOException {
		
	// Fill your code
		ConnectionManager cm = new ConnectionManager();
		cm.getConnection();	
		
	}
}
