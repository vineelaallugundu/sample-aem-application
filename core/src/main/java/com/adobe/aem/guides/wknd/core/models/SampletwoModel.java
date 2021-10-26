package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class, adapters = SampletwoModel.class, resourceType = SampletwoModel.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SampletwoModel {
    private static final Logger LOG = LoggerFactory.getLogger(SampletwoModel.class);
    final protected static String RESOURCE_TYPE = "wknd/components/sampletwo";

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String studentid;


    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String address;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String major;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String gender;

    public String getStudentid() {
        return studentid;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public String getGender() {
        return gender;
    }
}


