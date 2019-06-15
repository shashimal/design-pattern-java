package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.Map;

public interface ResourceRevocationRoleChain {
    void setNextChain(ResourceRevocationRoleChain nextChain);
    Map<String, Object> getAuthorizedTechTeam(int technicalAccountId);
}
