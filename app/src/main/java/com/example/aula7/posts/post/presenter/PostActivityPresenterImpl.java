package com.example.aula7.posts.post.presenter;

import com.example.aula7.posts.post.interactor.PostActivityInteractor;
import com.example.aula7.posts.post.view.PostActivityView;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityPresenterImpl implements PostActivityPresenter {

    private PostActivityView postActivityView;
    private PostActivityInteractor postActivityInteractor;

    public PostActivityPresenterImpl(PostActivityView postActivityView) {
        this.postActivityView = postActivityView;
        postActivityInteractor = new PostActivityPresenterImpl();
        }


    @Override
    public void showError() {

    }

    @Override
    public void showResult() {

    }

    @Override
    public void showData() {

    }
}
