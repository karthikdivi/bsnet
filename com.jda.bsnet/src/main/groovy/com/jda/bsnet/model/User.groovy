package com.jda.bsnet.model

import net.vz.mongodb.jackson.Id

public class User {
	String _id
	String username
	String password
	String emailId
	String mobileNo
	String orgName
	boolean orgAdmin

	boolean isOrgAdmin() {
		return orgAdmin
	}
}