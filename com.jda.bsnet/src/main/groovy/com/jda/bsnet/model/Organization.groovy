package com.jda.bsnet.model

import net.vz.mongodb.jackson.Id

public class Organization {
	String _id
	String orgName
	boolean buyer
	boolean supplier
	Address address
	boolean approved

	boolean isBuyer() {
		return buyer
	}
	boolean isSupplier() {
		return supplier
	}
	boolean isApproved() {
		return approved
	}


}

