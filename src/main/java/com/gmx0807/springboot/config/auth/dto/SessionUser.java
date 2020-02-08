package com.gmx0807.springboot.config.auth.dto;

import com.gmx0807.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * SessionUser는 인증(로그인)된 유저 정보만 필요로한다.
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
