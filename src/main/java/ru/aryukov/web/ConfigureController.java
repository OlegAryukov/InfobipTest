package ru.aryukov.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.aryukov.domain.Account;
import ru.aryukov.storage.AccountStorageUtilsImpl;
import ru.aryukov.web.form.Error;
import ru.aryukov.web.form.Result;
import ru.aryukov.web.form.Success;

/**
 * Created by olega on 26.04.17.
 */

@RestController
@RequestMapping(value = "/configure")
public class ConfigureController {
    @Autowired
    private AccountStorageUtilsImpl asu;

    @RequestMapping(value = "/account", method = RequestMethod.POST, produces = "application/json")
    public Result post(@RequestBody Account account){
        final Result result;
        if(!asu.checkUser(account.getLogin())){
            Account newAccount = new Account(account.getLogin(), asu.genPassword());
            this.asu.addUser(newAccount);
            result = new Success<>(this.asu.getUser(account.getLogin()));
        } else {
            result = new Error(String.format("User %s is already exist", asu.getUser(account.getLogin())));
        }
        return result;
    }

}
