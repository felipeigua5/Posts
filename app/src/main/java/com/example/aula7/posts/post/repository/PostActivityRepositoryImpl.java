package com.example.aula7.posts.post.repository;

import com.example.aula7.posts.post.interactor.PostActivityInteractor;
import com.example.aula7.posts.post.model.Post;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityRepositoryImpl implements PostActivityInteractor {

    PostActivityInteractor postActivityInteractor;
    PostActivityRepository postActivityRepository;

    public PostActivityRepositoryImpl(PostActivityRepository postActivityRepository) {
        this.postActivityRepository = postActivityRepository;
    }

    public PostActivityRepositoryImpl(PostActivityInteractor postActivityInteractor) {
        this.postActivityInteractor = postActivityInteractor;
        postActivityRepository = new PostActivityRepositoryImpl(this);
    }
}
