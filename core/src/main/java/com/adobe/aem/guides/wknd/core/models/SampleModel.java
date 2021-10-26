package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class, adapters = SampleModel.class, resourceType = SampleModel.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SampleModel {
    private static final Logger LOG = LoggerFactory.getLogger(SampletwoModel.class);
    final protected static String RESOURCE_TYPE = "wknd/components/sample";



    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String firstname;


    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String lastname;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String address;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String mobileno;;


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileno() {
        return mobileno;
    }
}

