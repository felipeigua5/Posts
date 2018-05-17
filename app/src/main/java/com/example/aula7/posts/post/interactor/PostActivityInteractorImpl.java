package com.example.aula7.posts.post.interactor;

import com.example.aula7.posts.post.presenter.PostActivityPresenter;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityInteractorImpl implements PostActivityPresenter {

    private PostActivityPresenter postActivityPresenter;

    public PostActivityInteractorImpl(PostActivityPresenter postActivityPresenter) {
        this.postActivityPresenter = postActivityPresenter;
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
