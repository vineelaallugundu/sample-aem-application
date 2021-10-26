package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)


public class UserDetail {

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
        private String firstname;


        @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
        private String lastname;
       @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
         private String age;

        @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
        private String address;
      @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
       private String favcolour;

    @ChildResource
    private List<UserDetailModel> mobile;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getFavcolour() {
        return favcolour;
    }

    public List<UserDetailModel> getMobile() {
        return mobile;
    }
}
