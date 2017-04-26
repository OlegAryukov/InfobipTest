package ru.aryukov.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aryukov.User;
import ru.aryukov.storage.UsersStorageUtils;

/**
 * Created by olega on 26.04.17.
 */

@RestController
@RequestMapping(value = "/configure")
public class ConfigureController {
    private final HttpHeaders headers = new HttpHeaders();
    private UsersStorageUtils usu = new UsersStorageUtils();

    @RequestMapping(value = "/account", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> post(@PathVariable String AccountId){
        boolean result = false;
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<String> response = null;
        if(!usu.checkUser(AccountId)){
            User user = new User(AccountId, "500NSczx");
            usu.addUser(user);
            response = new ResponseEntity<>(user.toString(),headers, HttpStatus.OK);
        } else {
            response = new ResponseEntity<>("User is already exist",headers, HttpStatus.OK);
        }
        return response;
    }

}
