package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechTeamTwoRevocation implements ResourceRevocationRoleChain {
    ResourceRevocationRoleChain nextChain;

    @Override
    public void setNextChain(ResourceRevocationRoleChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public Map<String,Object> getAuthorizedTechTeam(int technicalAccountId) {
        //Get the tem team lists
        List<String> teamTeamTwo = Data.getTemTeamMembers(technicalAccountId,2);
        List<String> saTeamTwo = Data.getSaTeamembers(technicalAccountId,2);

        String teamName ="";
        Map<String,Object> authorization = new HashMap<>();
        List<String> actors = null;

        if((teamTeamTwo == null || teamTeamTwo.isEmpty()) && (saTeamTwo == null || saTeamTwo.isEmpty() )) {
            return this.nextChain.getAuthorizedTechTeam(technicalAccountId);
        }else {
            if(!teamTeamTwo.isEmpty()) {
                teamName = "TEM";
                actors = teamTeamTwo;
            }else {
                teamName = "SA";
                actors = saTeamTwo;
            }
        }

        authorization.put("team",teamName);
        authorization.put("workflowStep",2);
        authorization.put("actors",actors);

        return authorization;
    }
}
