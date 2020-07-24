package org.launchcode.skillstracker.controllers;

/*
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {


    @GetMapping(value="/form")
    @ResponseBody
    public String skillsTracker(){
        String html =
                "<html>" +
                        "<body>" +
                            "<h1>Skills Tracker</h1>" +
                            "<h2>Skills to Learn</h2>" +
                            "<ol>" +
                                "<li>Java</li>" +
                                "<li>JavaScript</li>" +
                                "<li>Python</li>" +
                            "</ol>" +
                        "</body>" +
                "</html>";
            return html;
    }

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="/success")
    @ResponseBody
    public String skillsTrackerForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to Learn</h2>" +
                        "<form method = 'get' action = '/success'>" +
                        "<select>" +
                            "<option id='Java' name ='Java' value='Java'>" +
                            "<option id='JavaScript' name ='JavaScript' value='JavaScript'>" +
                            "<option id='Python' name='Python' value='Python'>"+
                        "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
} */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value ={""})
public class SkillsController {

    // Handles request at /hello/hello
//    @GetMapping("")
//    //@ResponseBody
//    public String hello() {
//        return "Hello";
//    }

    // Handles request at /hello/goodbye
    @GetMapping("goodbye")
    //@ResponseBody
    public String goodbye() {
        return "goodbye, Spring!";
    }

    //Handles request of the form /hello?name=LaunchCode
    //@GetMapping("hello")
    //@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    //@ResponseBody
    //public String helloWithQueryParam(@RequestParam String name) {
    //    return "Hello!";
    //}

    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    //@ResponseBody
//    public String helloWithParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    @GetMapping("form")
    //@ResponseBody
    public String skillsTrackerForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to Learn</h2>" +
                        "<form method = 'get' action = '/success'>" +
                        "<label name='option1'> Choose a language" +
                        "<select name ='option1' id='option1>"  +

                        "<option id='Java' name ='option1' value='Java'>" + "Java" + "</option>" +
                       "<option id='Java' name='Java' value='Java'>" + "Java Coffee" + "</option>"+
                        "<option id='JavaScript' name ='option1' value='JavaScript'>" + "JavaScript" + "</option>" +
                        "<option id='Python' name='option1' value='Python'>"+ "Python" + "</option>" +
                        "</select> </label>" + "<br/>" +

                        "<select name ='option2' id='option2>" + "Choose a language" +
                        "<option id='Java' name ='option2' value='Java'>" + "Java" + "</option>" +

//                        "<option id='Java' name='Java' value='Java'>" + "Java Coffee" + "</option>"+
                        "<option id='JavaScript' name ='option2' value='JavaScript'>" + "JavaScript" + "</option>" +
                        "<option id='Python' name='option2' value='Python'>"+ "Python" + "</option>" +
                        "</select>" + "<br/>" +

                        "<select name ='option3' id='option3>" + "Choose a language" +
                        "<option id='Java' name ='option3' value='Java'>" + "Java" + "</option>" +

//                        "<option id='Java' name='Java' value='Java'>" + "Java Coffee" + "</option>"+
                        "<option id='JavaScript' name ='option3' value='JavaScript'>" + "JavaScript" + "</option>" +
                        "<option id='Python' name='option3' value='Python'>"+ "Python" + "</option>" +
                        "</select>" + "<br/>" +

                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"/success"})
    public static String skillsTracker(@RequestParam String option1, @RequestParam String option2, @RequestParam String option3){
            String html =
                    "<html>" +
                            "<body>" +
                            "<h1>Skills Tracker</h1>" +
                            "<h2>Skills to Learn</h2>" +
                            "<ol>" +
                            "<li>" + option1 + "</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                            "</ol>" +
                            "</body>" +
                            "</html>";
            return html;
        }


}
