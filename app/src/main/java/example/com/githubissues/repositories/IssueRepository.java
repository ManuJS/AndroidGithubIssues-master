package example.com.githubissues.repositories;

import android.arch.lifecycle.LiveData;

import example.com.githubissues.entities.ApiResponse;
import example.com.githubissues.entities.Repositorio;

/**
 * Created by James on 5/25/2017.
 */

public interface IssueRepository {

    LiveData<ApiResponse> getIssues(String owner, String repo);
    LiveData<Repositorio> getRepos (String language);
}
