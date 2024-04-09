package com.jtask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Jtask {
	@GetMapping(value="/Ezoo")
	public String get() {
		return "SHASIBURI DANA";
	}

}
