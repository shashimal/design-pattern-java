package com.duleendra.designpattern.decorator.role;

public class ITAOUserQuery extends RevokeQueryListDecorator {
    public ITAOUserQuery(RevokeListQuery revokeListQuery) {
        super(revokeListQuery);
    }

    @Override
    public String getQuery() {
        return this.revokeListQuery.getQuery() + " OR  (fs.id=rs.id AND type=1)";
    }
}
