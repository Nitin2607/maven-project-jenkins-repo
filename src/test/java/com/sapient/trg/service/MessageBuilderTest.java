package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageBuilderTest {

	@Test
	void testGetMessageForInValidname() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertEquals("Hello Nitin",messageBuilder.getMessage("Nitin"));				
		}

	@Test
	void testGetMessageForNull() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertEquals("Please provide a name!",messageBuilder.getMessage(null));
	}
	
	
	
	
}
