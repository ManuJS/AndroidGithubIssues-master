package example.com.githubissues.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import example.com.githubissues.entities.ApiResponse;
import example.com.githubissues.entities.Repositorio;
import example.com.githubissues.repositories.IssueRepository;
import example.com.githubissues.repositories.IssueRepositoryImpl;

/**
 * Created by James on 5/21/2017.
 */

public class ListIssuesViewModel extends ViewModel {

    private MediatorLiveData<ApiResponse> mApiResponse;
    private MediatorLiveData<Repositorio> mApiResponseRepository;
    private IssueRepository mIssueRepository;

    public ListIssuesViewModel() {
        mApiResponse = new MediatorLiveData<>();
        mApiResponseRepository = new MediatorLiveData<>();
        mIssueRepository = new IssueRepositoryImpl();
    }

    @NonNull
    public LiveData<ApiResponse> getApiResponse() {
        return mApiResponse;
    }

    @NonNull
    public LiveData<Repositorio> getApiResponseRepository(){
        return mApiResponseRepository;
    }

    public LiveData<ApiResponse> loadIssues(@NonNull String user, String repo) {
        mApiResponse.addSource(
                mIssueRepository.getIssues(user, repo),
                apiResponse -> mApiResponse.setValue(apiResponse)
        );
        return mApiResponse;
    }

    public LiveData<Repositorio> loadRepositories(String language){

        mApiResponseRepository.addSource(
                mIssueRepository.getRepos(language),
                apiResponseRepository -> mApiResponseRepository.setValue(apiResponseRepository)
        );
        return mApiResponseRepository;


    }

}