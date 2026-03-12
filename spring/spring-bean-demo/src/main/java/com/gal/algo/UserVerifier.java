package com.gal.algo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserVerifier {
//	@Autowired
	OtpGenerator otpGenerator;
	@Autowired
	public UserVerifier(OtpGenerator otpGenerator) {
		super();
		this.otpGenerator = otpGenerator;
	}

	public OtpGenerator getOtpGenerator() {
		return otpGenerator;
	}

	public void setOtpGenerator(OtpGenerator otpGenerator) {
		this.otpGenerator = otpGenerator;
	}

	public void verifyUser() {
		String otp = otpGenerator.getOTP();
		if (otp != null)
			System.out.println("user verified");
		else
			System.out.println("verification failed");
	}
}