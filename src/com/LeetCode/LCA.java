package com.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 10/22/2016.
 */
// Find  Least Common Ancestor of two given keys.
 /*
When there is a conflict between two employees, the closest common manager should help resolve the conflict.
The developers plan to test the service by providing an example reporting hierarchy to enable the identification of the closest common manager for two employees.
Your goal is to develop an algorithm for IBM to efficiently perform this task.
To keep things simple, they just use a single relationship "isManagerOf" between any two employees.
For example, consider a reporting structure represented as a set of triples:

Tom isManagerOf Mary
Mary isManagerOf Bob
Mary isManagerOf Sam
Bob isManagerOf John
Sam isManagerOf Pete
Sam isManagerOf Katie

The manager who should resolve the conflict between Bob and Mary is Tom(Mary's manager).
The manager who should resolve the conflict between Pete and Katie is Sam(both employees' manager).
The manager who should resolve the conflict between Bob and Pete is Mary(Bob's manager and Pete's manager's manager). Assumptions:

There will be at least one isManagerOf relationship.
There can be a maximum of 15 team member to a single manager
No cross management would exist i.e., a person can have only one manager
There can be a maximum of 100 levels of manager relationships in the corporation


Input:



R1,R2,R3,R4...Rn,Person1,Person2 R1...Rn - A comma separated list of "isManagerOf" relationships.
Each relationship being represented by an arrow "Manager->Person".
Person1,Person2 - The name of the two employee that have conflict



Output:



The name of the manager who can resolve the conflict Note: Please be prepared to provide a video follow-up response to describe your approach to this exercise.



Test 1
Test Input Download Test Input

Frank->Mary,Mary->Sam,Mary->Bob,Sam->Katie,Sam->Pete,Bob->John,Bob,Katie

Expected Output Download Test Output

Mary

Test 2
Test Input Download Test Input

Sam->Pete,Pete->Nancy,Sam->Katie,Mary->Bob,Frank->Mary,Mary->Sam,Bob->John,Sam,John

Expected Output Download Test Output

Mary
 *
 * */

public class LCA {

    public void findAncestor(String s, String e1, String e2){
        String temp[] = s.split("\\,");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        String e1M=null,e2M=null;

        for(int i=0;i<temp.length;i++){
            String a[] = temp[i].split("\\->");
            hashMap.put(a[1],a[0]);
        }
        e1M = hashMap.get(e1);
        arrayList.add(e1M);
        e2M = hashMap.get(e2);
        if(e2M.equals(e1)){
            System.out.println("Manager Resolving Issues---" + e1M);
            return;
        }
        if(e2.equals(e1M)){
            System.out.println("Manager Resolving Issues---" + e2M);
            return;
        }
        if(e2M.equals(e1M)){
            System.out.println("Manager Resolving Issues---" + e2M);
            return;
        }
        arrayList.add(e2M);
        while(true){

            e1M = hashMap.get(e1M);
            e2M = hashMap.get(e2M);
            if(!e1M.equals(e2M)){
                if(!arrayList.contains(e1M)){
                    System.out.println("Manger1"+e1M);
                    arrayList.add(e1M);
                }
                else{
                    System.out.println("Manager Resolving Issues---"+e1M);
                    break;
                }
                if(!arrayList.contains(e2M)){
                    System.out.println("Manger2"+e2M);
                    arrayList.add(e2M);
                }
                else{
                    System.out.println("Manager Resolving Issues---"+e2M);
                    break;
                }
            }
            else{
                System.out.println("Manager Resolving Issues---"+e1M);
                break;
            }

        }




    }


}
