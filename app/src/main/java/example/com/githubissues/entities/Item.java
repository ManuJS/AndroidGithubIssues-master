package example.com.githubissues.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.security.acl.Owner;

/**
 * Created by emanuellemenali on 20/10/17.
 */

public class Item {
    @SerializedName("id")
    @Expose
    public Integer id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("full_name")
    @Expose
    public String fullName;

    @SerializedName("owner")
    @Expose
    public Owner owner;

    @SerializedName("private")
    @Expose
    public Boolean _private;

    @SerializedName("html_url")
    @Expose
    public String htmlUrl;

    @SerializedName("description")
    @Expose
    public String description;

}
