package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechTeamThreeRevocation implements ResourceRevocationRoleChain {
    ResourceRevocationRoleChain nextChain;

    @Override
    public void setNextChain(ResourceRevocationRoleChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public Map<String,Object> getAuthorizedTechTeam(int technicalAccountId) {
        //Get the tem team lists
        List<String> teamTeamThree = Data.getTemTeamMembers(technicalAccountId,3);
        List<String> saTeamThree = Data.getSaTeamembers(technicalAccountId,3);

        String teamName ="";
        Map<String,Object> authorization = new HashMap<>();
        List<String> actors = null;


        if((teamTeamThree == null || teamTeamThree.isEmpty()) && (saTeamThree == null || saTeamThree.isEmpty() )) {
            if(this.nextChain == null) {
                return null ;
            }

            return this.nextChain.getAuthorizedTechTeam(technicalAccountId);
        }else {
            if(!teamTeamThree.isEmpty()) {
                teamName = "TEM";
                actors = teamTeamThree;
            }else {
                teamName = "SA";
                actors = saTeamThree;
            }
        }

        authorization.put("team",teamName);
        authorization.put("workflowStep",3);
        authorization.put("actors",actors);

        return authorization;
    }
}
