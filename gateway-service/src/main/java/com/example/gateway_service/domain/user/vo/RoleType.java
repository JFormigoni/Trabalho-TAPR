package com.example.gateway_service.domain.user.vo;

public enum RoleType {
    GUEST(1),
    USER(2),
    ADMIN(3);

    private final int level;

    RoleType(int level) {
        this.level = level;
    }

    public boolean covers(RoleType other) {
        return this.level >= other.level;
    }
}
