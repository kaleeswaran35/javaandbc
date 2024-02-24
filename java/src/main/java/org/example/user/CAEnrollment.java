package main.java.org.example.user;

import java.io.Serializable;
import java.security.PrivateKey;

import org.hyperledger.fabric.sdk.Enrollment;

//Enrollment metadata
public class CAEnrollment implements Enrollment, Serializable {
	private static final long serialVersionUID = 550416591376968096L;
	private PrivateKey key;
	private String cert;

	public CAEnrollment(PrivateKey pkey, String signedPem) {
		this.key = pkey;
		this.cert = signedPem;
	}

	public PrivateKey getKey() {
		return key;
	}

	public String getCert() {
		return cert;
	}

}
