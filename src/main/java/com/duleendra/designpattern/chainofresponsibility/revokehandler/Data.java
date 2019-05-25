package com.duleendra.designpattern.chainofresponsibility.revokehandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    public static List<String> getTemTeamMembers(int teachnicalTeam,int workflowId) {
        HashMap<Integer,HashMap<Integer,List<String>>> temTeamMembers = new HashMap<>();


        List<String> w1 = new ArrayList<>();
        w1.add("Shashimal");
        w1.add("Imalka");

        List<String> w2 = new ArrayList<>();
        w2.add("Nadeeth");

        List<String> w3 = new ArrayList<>();
        w3.add("Sameera");

        HashMap<Integer,List<String>> worflow = new HashMap();
        //worflow.put(1,w1);
        //worflow.put(2,w2);
        worflow.put(3,w3);

        temTeamMembers.put(1,worflow);


        return temTeamMembers.get(teachnicalTeam).get(workflowId);
    }

    public static List<String> getSaTeamembers(int teachnicalTeam,int workflowId) {
        return null;
    }
}
