package com.adobe.aem.guides.wknd.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Bank Service Configuration", description = "This is a demo configuration in OsgiService")

public @interface BankServiceConfigurations {

	@AttributeDefinition(name = "Withdraw Amount")
	String depositAmount() default "Nothing";

	@AttributeDefinition(name = "Deposit Amount")
	String withdrawAmount() default "Nothing";
}
