package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value ={""})
public class SkillsController {

    @GetMapping("form")
    //@ResponseBody
    public String skillsTrackerForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to Learn</h2>" +
                        "<form method = 'post' action = '/success'>" +
                        "<label name='option1'> Your Favorite:   " +
                        "<select name ='option1' id='option1'>"  +
                        "<option id='Java' name ='option1' value='Java'>" + "Java" + "</option>" +
                       "<option id='JavaCoffee' name='JavaCoffee' value='JavaCoffee'>" + "Java Coffee" + "</option>"+
                        "<option id='JavaScript' name ='option1' value='JavaScript'>" + "JavaScript" + "</option>" +
                        "<option id='Python' name='option1' value='Python'>"+ "Python" + "</option>" +
                        "</select> </label>" + "<br/>" +

                        "<label name='option2'> 2nd Favorite:   " +
                        "<select name ='option2' id='option2'>" + "Choose a language" +
                        "<option id='Java' name ='option2' value='Java'>" + "Java" + "</option>" +
                        "<option id='JavaCoffee' name='JavaCoffee' value='JavaCoffee'>" + "Java Coffee" + "</option>"+
                        "<option id='JavaScript' name ='option2' value='JavaScript'>" + "JavaScript" + "</option>" +
                        "<option id='Python' name='option2' value='Python'>"+ "Python" + "</option>" +
                        "</select> </label>" + "<br/>" +

                        "<label name='option3'> 3rd Favorite:   " +
                        "<select name ='option3' id='option3'>" + "Choose a language" +
                        "<option id='Java' name ='option3' value='Java'>" + "Java" + "</option>" +
                       "<option id='JavaCoffee' name='JavaCoffee' value='JavaCoffee'>" + "Java Coffee" + "</option>"+
                        "<option id='JavaScript' name ='option3' value='JavaScript'>" + "JavaScript" + "</option>" +
                        "<option id='Python' name='option3' value='Python'>"+ "Python" + "</option>" +
                        "</select> </label>" + "<br/>" +


                        "<input type = 'submit' value = 'Choose your favorites!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping(value = {"/success"})
    public static String skillsTracker(@RequestParam String option1, @RequestParam String option2, @RequestParam String option3){
            String html =
                    "<html>" +
                            "<body>" +
                            "<h1>Skills Tracker</h1>" +
                            "<h2>Skills to Learn</h2>" +
                            "<ol>" +
                            "<li>" + option1 + "</li>" +
                            "<li>" + option2 + "</li>" +
                            "<li>" + option3 +"</li>" +
                            "</ol>" +
                            "</body>" +
                            "</html>";
            return html;
        }




}
