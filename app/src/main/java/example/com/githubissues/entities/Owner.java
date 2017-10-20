package example.com.githubissues.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by emanuellemenali on 20/10/17.
 */

public class Owner {

    @SerializedName("login")
    @Expose
    public String login;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("avatar_url")
    @Expose
    public String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    public String gravatarId;
}
