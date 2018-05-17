package com.example.aula7.posts.post.interactor;

import com.example.aula7.posts.post.model.Post;

import java.util.List;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public interface PostActivityInteractor {
    void listData(List<Post>postList); //auntemar esto en postactivityinteractorimpl
    void validateData();
    void searchData();
}
