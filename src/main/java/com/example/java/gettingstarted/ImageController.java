package com.example.java.gettingstarted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class ImageController {

	@Autowired
	public ImageService imageService;
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
		System.out.println("ICI");
		imageService.uploadFile(file);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
}
