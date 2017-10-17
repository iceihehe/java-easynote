package com.iceihehe.easynote.repository;

import com.iceihehe.easynote.domain.User;

public class UserRepoCustomImpl implements UserRepoCustom {

    @Override
    public User findByUsername(String username) {
        System.out.println(username);
        return null;
    }
}
