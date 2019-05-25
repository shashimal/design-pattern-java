package com.duleendra.designpattern.decorator.role;

public class RoleDemo {
    public static void main(String[] args) {
        RevokeListQuery query = new FSUserQuery(new NormalUserQuery());
        System.out.println("FS Query: "+query.getQuery());

        RevokeListQuery query2 = new FSUserQuery(new ADUserQuery(new NormalUserQuery()));
        System.out.println("AD and FS:"+ query2.getQuery());

        RevokeListQuery query3 = new FSUserQuery(new ADUserQuery(new ITAOUserQuery(new NormalUserQuery())));
        System.out.println("AD and FS and ITAO:"+ query3.getQuery());
    }
}
