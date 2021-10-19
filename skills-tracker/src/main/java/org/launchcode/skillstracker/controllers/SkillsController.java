package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
            public String welcomePage() {
        String html =
                "<html>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Programming Languages</h2>" +
                        "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>" +
                        "</html>";
                return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        String form =
                "<html>" +
                        "<form method = 'post' action = '/form'>" +
                        "<input type = 'text' name = 'coder' placeholder = 'Enter Name' />" +
                        "<p></p>" +

                        "<label for=firstLanguage>My favorite language:</label>" +
                        "<select id=firstLanguage name=firstLanguage>" +
                        "<option value=java>Java</option>" +
                        "<option value=javaScript>JavaScript</option>" +
                        "<option value=python>Python</option>" +
                        "</select>" +
                        "<p></p>" +

                        "<label for=secondLanguage>My second favorite language:</label>" +
                        "<select id=secondLanguage name=secondLanguage>" +
                        "<option value=java>Java</option>" +
                        "<option value=javaScript>JavaScript</option>" +
                        "<option value=python>Python</option>" +
                        "</select>" +
                        "<p></p>" +

                        "<label for= thirdLanguage>My third favorite language:</label>" +
                        "<select id=thirdLanguage name=thirdLanguage>" +
                        "<option value=java>Java</option>" +
                        "<option value=javaScript>JavaScript</option>" +
                        "<option value=python>Python</option>" +
                        "</select>" +
                        "<p></p>" +

                        "<input type = 'submit' value = 'Submit!' />" +
                        "</form>" +

                "</html>";
        return form;

    }
@PostMapping("form")
    public String hello(@RequestParam String coder, String firstLanguage, String secondLanguage, String thirdLanguage) {
    return "<html>" +
            "Hello, " + coder + "! <br> Here are your lanuage choices: " +
            "1." + firstLanguage + "<br>" +
            "2." + secondLanguage + "<br>" +
            "3." + thirdLanguage + "<br>" +
            "</html>";

}
}
