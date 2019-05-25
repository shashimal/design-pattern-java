package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.List;
import java.util.Map;

public interface ResourceRevocationRoleChain {
    void setNextChain(ResourceRevocationRoleChain nextChain);
    Map<String, Object> getAuthorizedTechTeam(int technicalAccountId);
}
