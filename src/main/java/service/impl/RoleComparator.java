package service.impl;

import enumm.Role;
import models.User;

import java.util.Comparator;

public class RoleComparator implements Comparator<User>{

    @Override
    public int compare(User u1, User u2) {
        Role role1 = u1.getRole();
        Role role2 = u2.getRole();

        if(role1 == role2){
            return 0;
        }if(role1 == Role.TEACHER){
            return -1;
        }if(role2 == Role.TEACHER){
            return 1;
        }if(role1 == Role.SENIOR_STUDENT){
            return -1;
        }if(role2 == Role.SENIOR_STUDENT){
            return 1;
        }

        return 0;
    }
}
