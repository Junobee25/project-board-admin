package com.fastcampus.projectboardadminstart.domain.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // 필드를 포함하고 있는 생성자를 자동으로 만들어 줌
public enum RoleType {
    USER("ROLE_USER"),
    MANAGER("ROLE_MANAGER"),
    DEVELOPER("ROLE_DEVELOPER"),
    ADMIN("ROLE_ADMIN");

    @Getter private final String roleName;

    // @RequiredArgsConstructor이 자동으로 생성 해주는 부분
//    RoleType(String name) {
//        this.name = name;
//    }
}