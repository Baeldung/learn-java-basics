package com.baeldung.domain;

import java.util.Objects;

public final class Campaign {

    private final String code;

    public Campaign(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Campaign campaign = (Campaign) o;
        return Objects.equals(code, campaign.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Campaign[" + "code='" + code + '\'' + ']';
    }
}