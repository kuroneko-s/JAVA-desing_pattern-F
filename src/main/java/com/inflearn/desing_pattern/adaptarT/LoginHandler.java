package com.inflearn.desing_pattern.adaptarT;

public class LoginHandler {

    private UserDetailesService userDetailesService;

    public LoginHandler(UserDetailesService userDetailesService) {
        this.userDetailesService = userDetailesService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailesService.loadUser(username);
        if(userDetails.getUsername().equals(username)){
            return userDetails.getUsername();
        }else {
            throw new IllegalArgumentException();
        }
    }
}
