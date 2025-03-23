package lk.ac.vau.fas.ict.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class StudentController {
	@GetMapping("/myname")
	public String myMessage() {
		 return "MY name is Maleesha";
	}
}