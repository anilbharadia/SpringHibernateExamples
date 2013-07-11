package org.rw.util;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * @since 1.0
 * @author anil.bharadia
 */
public class PasswordEncoder {

	public static void main(String[] args) {
		
		StandardPasswordEncoder passwordEncoder = new StandardPasswordEncoder();
		
		String anil = passwordEncoder.encode("anil");
		System.out.println("anil = " + anil);
		
		String teller1 = passwordEncoder.encode("teller1");
		System.out.println("teller1 = " + teller1);
		
		String scott = passwordEncoder.encode("scott");
		System.out.println("scott = " + scott);
		
		String user1 = passwordEncoder.encode("user1");
		System.out.println("user1 = " + user1);
		
	}
	
}
