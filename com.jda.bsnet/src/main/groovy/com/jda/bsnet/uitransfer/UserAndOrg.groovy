package com.jda.bsnet.uitransfer

import com.jda.bsnet.model.Organization;

class UserAndOrg {
	String username
	String password
	String emailId
	String mobileNo
	Organization org
	boolean success

	boolean isSuccess() {
		return success
	}

}
