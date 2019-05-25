package com.duleendra.designpattern.decorator.role;

public class ADUserQuery extends RevokeQueryListDecorator {
    public ADUserQuery(RevokeListQuery revokeListQuery) {
        super(revokeListQuery);
    }

    @Override
    public String getQuery() {
        return this.revokeListQuery.getQuery() + " OR  (fs.id=rs.id AND type=3)";
    }
}
