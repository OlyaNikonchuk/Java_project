package by.Nikonchuk.kpop.models.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_USER, ROLE_ADMIN, ROLE_SALESMAN;

    @Override
    public String getAuthority() {
        return name();
    }
}
