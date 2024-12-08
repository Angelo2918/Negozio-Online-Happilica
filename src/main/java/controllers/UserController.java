package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

}
