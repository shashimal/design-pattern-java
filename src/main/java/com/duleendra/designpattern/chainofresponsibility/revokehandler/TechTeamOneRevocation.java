package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechTeamOneRevocation implements ResourceRevocationRoleChain {
    ResourceRevocationRoleChain nextChain;

    @Override
    public void setNextChain(ResourceRevocationRoleChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public Map<String,Object> getAuthorizedTechTeam(int technicalAccountId) {
        List<String> teamTeamOne = Data.getTemTeamMembers(technicalAccountId,1);
        List<String> saTeamOne = Data.getSaTeamembers(technicalAccountId,1);

        String teamName ="";
        Map<String,Object> authorization = new HashMap<>();
        List<String> actors = null;

        if((teamTeamOne == null || teamTeamOne.isEmpty()) && (saTeamOne == null || saTeamOne.isEmpty() )) {
            return this.nextChain.getAuthorizedTechTeam(technicalAccountId);
        }else {
            if(!teamTeamOne.isEmpty()) {
                teamName = "TEM";
                actors = teamTeamOne;
            }else {
                teamName = "SA";
                actors = saTeamOne;
            }
        }

        authorization.put("team",teamName);
        authorization.put("workflowStep",1);
        authorization.put("actors",actors);

        return authorization;
    }
}
