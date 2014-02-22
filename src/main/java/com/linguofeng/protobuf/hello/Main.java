package com.linguofeng.protobuf.hello;

import com.google.protobuf.InvalidProtocolBufferException;
import com.linguofeng.protobuf.hello.Hello.Test;

public class Main {

	public static void main(String[] args) {
		Test test = Test.newBuilder().setName("Hello World!!").build();
		System.out.println(test.toByteString());
		
		try {
			Test test2 = Test.parseFrom(test.toByteString());
			System.out.println("name: " + test2.getName());
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}
