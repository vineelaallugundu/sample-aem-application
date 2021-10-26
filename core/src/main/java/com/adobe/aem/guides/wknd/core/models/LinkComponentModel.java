package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.services.BankService;
import com.adobe.cq.wcm.core.components.models.Page;
import com.day.cq.commons.Externalizer;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LinkComponentModel {

	@ScriptVariable

	private Page currentPage;

	@OSGiService
	private Externalizer eternalizer;

	@OSGiService
	private ResourceResolver resourceResolver;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String title;

	@ChildResource
	private List<LinkModel> sectionOne;

	@ChildResource
	private List<LinkModel> sectionTwo;

	@ChildResource
	private List<LinkModel> sectionThree;

	private String currentPageTitle;

	private String currentPagePath;

	private String withdrawVal;

	private String depositVal;

	@OSGiService
	private BankService bankService;

	@PostConstruct
	protected void init() {

		if (bankService != null) {
			this.withdrawVal = this.bankService.withdrawAmount();
			this.depositVal = this.bankService.depositAmount();
		}
		if (currentPage != null) {
			this.currentPageTitle = this.currentPage.getTitle();

		}

	}

	public List<LinkModel> getSectionOne() {
		return sectionOne;
	}

	public String getTitle() {
		return title;
	}

	public Page getCurrentPage() {
		return currentPage;
	}

	public Externalizer getEternalizer() {
		return eternalizer;
	}

	public ResourceResolver getResourceResolver() {
		return resourceResolver;
	}

	public List<LinkModel> getSectionTwo() {
		return sectionTwo;
	}

	public List<LinkModel> getSectionThree() {
		return sectionThree;
	}

	public String getCurrentPageTitle() {
		return currentPageTitle;
	}

	public String getCurrentPagePath() {
		return currentPagePath;
	}

	public String getWithdrawVal() {
		return withdrawVal;
	}

	public String getDepositVal() {
		return depositVal;
	}

	public BankService getBankService() {
		return bankService;
	}

}
