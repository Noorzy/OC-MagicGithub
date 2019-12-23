package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import com.openclassrooms.magicgithub.api.FakeApiService;

import java.util.ArrayList;


import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

      //private List<User> WorkArray = new ArrayList<>(FAKE_USERS);


    public List<User> getUsers() {
        // TODO: A modifier





        //return WorkArray;
        return apiService.getUsers();




    }

    public void generateRandomUser() {
        // TODO: A modifier
       // WorkArray.add(User.random());
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier

        // WorkArray.remove(user);
        apiService.deleteUser(user);


    }
}
