package com.duleendra.designpattern.decorator.role;

public class RevokeQueryListDecorator implements RevokeListQuery {

    RevokeListQuery revokeListQuery;

    public RevokeQueryListDecorator(RevokeListQuery revokeListQuery) {
        this.revokeListQuery = revokeListQuery;
    }

    @Override
    public String getQuery() {
        return revokeListQuery.getQuery();
    }
}