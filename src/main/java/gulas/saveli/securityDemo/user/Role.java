package gulas.saveli.securityDemo.user;

import lombok.Getter;

import java.util.List;

@Getter
public enum Role {
    USER(new Authority[]{Authority.USER_AUTHORITIES}), ADMIN(new Authority[]{Authority.USER_AUTHORITIES, Authority.EDIT_USERS});

    private final List<Authority> AUTHORITY_LIST;

    Role(Authority[] AUTHORITY_ARRAY) {
        this.AUTHORITY_LIST = List.of(AUTHORITY_ARRAY);
    }
}
