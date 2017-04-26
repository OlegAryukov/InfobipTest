package ru.aryukov.web;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import ru.aryukov.domain.Account;
import ru.aryukov.storage.UsersStorageUtils;
import ru.aryukov.web.form.Error;
import ru.aryukov.web.form.Result;
import ru.aryukov.web.form.Success;

/**
 * Created by olega on 26.04.17.
 */

@RestController
@RequestMapping(value = "/configure")
public class ConfigureController {
    private UsersStorageUtils usu = new UsersStorageUtils();

    @RequestMapping(value = "/account", method = RequestMethod.POST, produces = "application/json")
    public Result post(@RequestBody Account account){
        final Result result;
        /*headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<String> response = null;*/
        if(!usu.checkUser(account.getLogin())){
            /*Account newAccount = new Account(account.getLogin(), "500NSczx");
            usu.addUser(account);*/
            result = new Success<Account>(this.usu.addUser(account));
        } else {
            result = new Error(String.format("User %s is already exist", usu.getUser(account.getLogin())));
        }
        return result;
    }

}
