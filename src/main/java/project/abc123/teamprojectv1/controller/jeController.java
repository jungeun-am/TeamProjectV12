package project.abc123.teamprojectv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jeController {
    @GetMapping("/je")
    public String index() {
        return "views/jungeun";
    }
}
