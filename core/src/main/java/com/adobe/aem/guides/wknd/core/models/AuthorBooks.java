package com.adobe.aem.guides.wknd.core.models;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.List;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class  AuthorBooks {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String author;


    @ChildResource
    private List<AuthorBookImp> section;




    public String getAuthor() {
        return author;
    }

    public List<AuthorBookImp> getSection() {

        return section;
    }


        @PostConstruct
    protected void init() {

    }







}
