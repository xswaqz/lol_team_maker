package com.lolteammaker.backend.model.service;

import com.lolteammaker.backend.model.dto.User;

public interface UserService {
    // 사용자 등록
    void registUser(User user);

    // 사용자 조회
    User selectUser(String id);

    // 사용자 삭제
    void removeUser(String id);
}
