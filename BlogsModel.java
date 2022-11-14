package com.ttn.bootcamp.amc.mockproject.core.models.blogs;

import com.ttn.bootcamp.amc.mockproject.core.models.header.HeaderListItem;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogsModel {


    @ValueMapValue
    private String mainTitle;
    @ValueMapValue
    private String img1;
    @ValueMapValue
    private String img2;
    @ValueMapValue
    private String img3;

    public String getContent() {
        return content;
    }

    @ValueMapValue
    private String content;
    @ValueMapValue
    private String tags;


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

    public String getTags() {
        return tags;
    }
}
