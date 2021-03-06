package com.ee.ctp.security;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ee.ctp.security.KAES;

public class KAESTest {

	@Test
	public void testEncrypt() {
		String key = "DAGET0Q2VRCT1B0J";
		byte[] src = new byte[] {
				0x79,0x4d,0x77,0x42,0x69,0x64,0x35,0x65,0x33,0x58,0x48,0x6b,0x69,0x4f,0x55,0x74,
				0x4d,0x69,0x63,0x63,0x4b,0x30,0x78,0x74,0x38,0x4b,0x79,0x4f,0x31,0x48,0x6b,0x78,
				0x74,0x50,0x36,0x4c,0x30,0x39,0x59,0x33,0x34,0x46,0x6f,0x6e,0x74,0x67,0x4f,0x66,
				0x77,0x31,0x71,0x67,0x5a,0x58,0x48,0x37,0x46,0x66,0x54,0x45,0x57,0x65,0x62,0x6f,
				0x31,0x66,0x37,0x31,0x6f,0x35,0x35,0x74,0x49,0x72,0x4f,0x61,0x48,0x43,0x6e,0x64,
				0x42,0x4e,0x74,0x42,0x49,0x61,0x47,0x6c,0x70,0x41,0x5a,0x6b,0x4d,0x38,0x47,0x4e,
				0x6e,0x4e,0x4f,0x4d,0x52,0x52,0x64,0x78,0x69,0x31,0x46,0x5a,0x42,0x33,0x63,0x64,
				0x4f,0x44,0x4f,0x76,0x4c,0x73,0x51,0x39,0x32,0x51,0x74,0x4d,0x59,0x37,0x7a,0x6b
		};
		
		byte[] result = new byte[] {
				0x6f,0x50,0x36,0x4f,0x4c,0x49,0x44,0x4a,0x4f,0x53,0x50,0x6c,0x77,0x61,0x52,0x48,
				0x69,0x31,0x75,0x48,0x6d,0x7a,0x65,0x4f,0x7a,0x77,0x7a,0x34,0x59,0x7a,0x52,0x55,
				0x47,0x57,0x30,0x47,0x75,0x4e,0x79,0x51,0x39,0x6b,0x6e,0x56,0x52,0x52,0x56,0x38,
				0x35,0x6f,0x54,0x55,0x76,0x75,0x50,0x38,0x47,0x39,0x34,0x54,0x6a,0x74,0x36,0x32,
				0x6f,0x49,0x71,0x34,0x57,0x48,0x31,0x36,0x66,0x48,0x38,0x76,0x32,0x64,0x47,0x6d,
				0x61,0x7a,0x52,0x42,0x37,0x35,0x51,0x62,0x5a,0x6f,0x62,0x34,0x77,0x5a,0x65,0x6f,
				0x4d,0x75,0x4c,0x37,0x71,0x6d,0x5a,0x79,0x4a,0x38,0x4d,0x66,0x50,0x68,0x75,0x46,
				0x36,0x71,0x74,0x5a,0x43,0x58,0x52,0x69,0x39,0x31,0x58,0x6e,0x78,0x51,0x30,0x62
		};
		
		byte[] encrypt = KAES.DEFAULT_INSTANCE.encrypt(src, key.getBytes());
		assertEquals(128, encrypt.length);
		assertEquals(new String(encrypt), new String(result));
	}
}
