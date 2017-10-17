package com.iceihehe.easynote.repository;

import com.iceihehe.easynote.domain.User;

public interface UserRepoCustom {

    User findByUsername(String username);
}
