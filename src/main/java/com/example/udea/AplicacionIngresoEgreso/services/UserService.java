package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.entities.User;
import com.example.udea.AplicacionIngresoEgreso.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User createUser(User newUser){
        return this.userRepository.save(newUser);
    }

    public User getOrCreateUser(Map<String, Object> userData){
        String email = (String) userData.get("email");

        User user = this.findByEmail(email);
        if (user == null){
            String name = (String) userData.get("name");
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");


            User newUser = new User(email=email, image=image, auth0Id=auth0Id);
            return createUser(newUser);
        }
        return user;
    }

    public User setEmpleadoCedula(String email, String cedula){
        User user = this.findByEmail(email);
        if (user != null){
            user.setEmpleadoCedula(cedula);
            return this.userRepository.save(user);
        }
        return null;
    }
}
