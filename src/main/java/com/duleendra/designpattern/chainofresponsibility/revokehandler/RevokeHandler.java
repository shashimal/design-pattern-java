package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.Map;

public class RevokeHandler {
    public static void main(String[] args) {

        ResourceRevocationRoleChain c1 = new TechTeamOneRevocation();
        ResourceRevocationRoleChain c2= new TechTeamTwoRevocation();
        ResourceRevocationRoleChain c3 = new TechTeamThreeRevocation();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        Map<String,Object> authorizationDetails = c1.getAuthorizedTechTeam(1);
        System.out.println(authorizationDetails);

    }
}
