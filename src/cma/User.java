/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cma;

import java.util.Map;

public abstract class User {
   
    protected String userType;
    Map<String, Object> userDeatils;

    public User(Map<String, Object> userDeatils, String userType) {
        this.userDeatils = userDeatils;
        this.userType = userType;
    }

    // Common methods for all users
    public abstract void openUserPage(); // Abstract method to open the respective user page
}
