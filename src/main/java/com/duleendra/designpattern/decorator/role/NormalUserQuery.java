package com.duleendra.designpattern.decorator.role;

public class NormalUserQuery implements RevokeListQuery {
    @Override
    public String getQuery() {
        return " ( (type=1 OR type=2 OR type=3) AND userId=1) ";
    }
}
