package com.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.entity.Restorent;
import com.mongodb.repository.RestorentRepository;

@RestController
public class RestorentController {
	
	
	@Autowired
	
	private RestorentRepository repo; 
	@PostMapping("/add")
	public ResponseEntity<?> addRestorent(@RequestBody Restorent restorent){
		
		Restorent save=this.repo.save(restorent);
		return ResponseEntity.ok(save);
		
	}
	@GetMapping("/")
	public ResponseEntity<?>getRestorent(){
		return ResponseEntity.ok(this.repo.findAll());
	}
	@DeleteMapping("/delete/{id}")
	public String deleteResto(@PathVariable int id) {
		repo.deleteById(id);
		return "restorent deleted with id:"+id;
	}
//  @PutMapping("/update")
//    public Restorent updates(@RequestBody resto,@PathVariable("id"));
//	

}
