package example.com.githubissues.api;

import java.util.List;

import example.com.githubissues.entities.Issue;
import example.com.githubissues.entities.Item;
import example.com.githubissues.entities.Repositorio;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by shahbaz on 14/05/17.
 */

public interface GithubApiService {

    @GET("/search/repositories")

    Call<List<Item>> search(@Query("language") String language);

    @GET("/repos/{owner}/{repo}/issues")
    Call<List<Issue>> getIssues(@Path("owner") String owner, @Path("repo") String repo);
}
