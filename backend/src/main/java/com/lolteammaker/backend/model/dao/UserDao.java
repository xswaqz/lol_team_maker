package com.lolteammaker.backend.model.dao;

import com.lolteammaker.backend.model.dto.User;

public interface UserDao {
    // 사용자 등록
    void insertUser(User user);

    // 사용자 조회
    User selectUser(String id);

    // 사용자 삭제
    void deleteUser(String id);

}
