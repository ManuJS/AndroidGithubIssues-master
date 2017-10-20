package example.com.githubissues.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by emanuellemenali on 20/10/17.
 */

public class Repositorio {

    @SerializedName("total_count")
    @Expose
    public Integer totalCount;
    @SerializedName("incomplete_results")
    @Expose
    public Boolean incompleteResults;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;

    private Throwable error;

    public Repositorio(Throwable error) {
        this.error = error;
        this.items = null;
    }

    public Repositorio(List<Item> item) {
        this.items = item;
        this.error = null;
    }

    public Throwable getError() {
        return error;
    }

    public List<Item> getItems() {
        return items;
    }
}
