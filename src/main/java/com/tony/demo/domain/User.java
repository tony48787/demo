package com.tony.demo.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class User {
    private final String name;
    private final String desc;

    public User() {
        this("dummy", "dummy desc");
    }
}
