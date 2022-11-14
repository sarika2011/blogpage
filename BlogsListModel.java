package com.ttn.bootcamp.amc.mockproject.core.models.blogs;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogsListModel {


    @ValueMapValue
    private String mainTitle;
    @ValueMapValue
    private String img1;
    @ValueMapValue
    private String img2;
    @ValueMapValue
    private String img3;

    @ValueMapValue
    private String linkimage;
    @ValueMapValue
    private String content;

    @ValueMapValue
    private String tabsButtonText;

    @ValueMapValue
    private String tabsLinkitem;


    public String getTabsButtonText() {
        return tabsButtonText;
    }



    public String getContent() {
        return content;
    }

    public String getMainTitle() {
        return mainTitle;
    }


    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }

    public String getImg3() {
        return img3;
    }

    public String getTabsLinkitem() {
        return tabsLinkitem;
    }

    public String getLinkimage() {
        return linkimage;
    }
}
