package com.adobe.aem.guides.wknd.core.models;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.commons.Externalizer;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LinkModel {

	@OSGiService
	private Externalizer externalizer;

	@OSGiService
	private ResourceResolver resourceResolver;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String linkLable;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String linkPath;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private boolean internal;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private boolean external;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String dropDown;

	@PostConstruct
	protected void init() {

		this.linkPath = StringUtils.join(this.externalizer.authorLink(resourceResolver, linkPath), ".html");
	}

	public String getLinkLable() {
		return linkLable;
	}

	public String getLinkPath() {
		return linkPath;
	}

	public boolean getInternal() {
		return internal;
	}

	public boolean getExternal() {
		return external;
	}

	public String getDropDown() {
		return dropDown;
	}

}
