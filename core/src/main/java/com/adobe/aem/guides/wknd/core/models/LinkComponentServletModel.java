package com.adobe.aem.guides.wknd.core.models;



import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class LinkComponentServletModel {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonLabel;

   

    @OSGiService
    private ResourceResolver resourceResolver;

   

    @PostConstruct
    protected void init()
    {

    }

    public String getTitle() {
        return title;
    }

    public String getButtonLabel() {
        return buttonLabel;
    }

    
    
}
