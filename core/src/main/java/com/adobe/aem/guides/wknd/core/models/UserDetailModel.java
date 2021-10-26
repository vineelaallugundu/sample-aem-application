package com.adobe.aem.guides.wknd.core.models;


import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class  UserDetailModel {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private  String mobileno;

    public String getMobileno() {
        return mobileno;
    }
}



