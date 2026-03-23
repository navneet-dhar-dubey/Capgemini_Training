package com.gal.algo;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class SixDigitOTPGenerator implements OtpGenerator {
	public String getOTP() {
		return ""+ new Random().nextInt(1000000);
	}
}
