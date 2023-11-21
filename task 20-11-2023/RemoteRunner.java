package com.driver;

import com.things.Remote;

public class RemoteRunner {
	public static void main(String[] args) {
		Remote remote=new Remote();
		Remote remote1=new Remote();
		remote1.model="vvv";
		System.out.println("class name is:"+remote.getClass());
		System.out.println("string is:"+remote.toString());
		System.out.println("hash code is:"+remote.hashCode());
		System.out.println("hash code remote1 is:"+remote1.hashCode());
		
		//System.out.println(remote.equals(remote));
		System.out.println(remote.equals(remote1));
	}
}
