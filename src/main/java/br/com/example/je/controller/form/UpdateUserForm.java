package br.com.example.je.controller.form;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import br.com.example.je.model.User;
import br.com.example.je.repository.UserRepository;

public class UpdateUserForm {
	
	@NotNull @NotEmpty
	private String name;
	@NotNull @NotEmpty
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User update(Long id, UserRepository userRepository) {
		User user = userRepository.getOne(id);
		user.setName(this.name);
		user.setEmail(this.email);
		return user;
	}

}
