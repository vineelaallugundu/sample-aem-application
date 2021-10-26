package com.adobe.aem.guides.wknd.core.services;

import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = BankService.class, immediate = true)
@Designate(ocd = BankServiceConfigurations.class)
public class BankServiceImpl implements BankService {

	private BankServiceConfigurations config;

	@Activate
	private void activate(BankServiceConfigurations config) {

		this.config = config;

	}

	@Override
	public String withdrawAmount() {
		return StringUtils.join("Amount with deposite is sucessfull :", this.config.withdrawAmount());
	}

	@Override
	public String depositAmount() {
		return StringUtils.join("Amount with draw is sucessfull :", this.config.depositAmount());
	}

}
