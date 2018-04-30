package org.cactuarr.springquickstart.courseapi.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllTopics(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	} 
	
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable User id) {
		userService.updateUser(id, user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

}
