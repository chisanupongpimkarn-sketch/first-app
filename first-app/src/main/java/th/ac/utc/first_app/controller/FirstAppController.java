package th.ac.utc.first_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    public class FirstAppController {
        @GetMapping("/")
        public String home(){
            return "Hello Spring Boot!";

        }
        @GetMapping("/about")
        public String about(){
            return "This is my FirsyApp Version 0.1 ";
        }
        @GetMapping("/hello")
        public  String hello(@RequestParam(defaultValue =  "Guest") String name) {
            return  "สวัสดี " + name + " ยินดีต้อนรับสู่ Spring Boot";

        }
}
