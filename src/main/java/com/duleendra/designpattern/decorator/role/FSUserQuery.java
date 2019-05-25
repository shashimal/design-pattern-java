package com.duleendra.designpattern.decorator.role;

public class FSUserQuery extends RevokeQueryListDecorator {

    public FSUserQuery(RevokeListQuery revokeListQuery) {
        super(revokeListQuery);
    }

    @Override
    public String getQuery() {
        return this.revokeListQuery.getQuery() + " OR  (fs.id=rs.id AND type=2)";
    }
}
