package in.pwskills.nitin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/app")
public class MyController {

	@GetMapping("/getMessage")
	public ResponseEntity<String> getProductDetails() {
		String body = "Hello Developer...!";
		return ResponseEntity.ok(body);
	}
}
