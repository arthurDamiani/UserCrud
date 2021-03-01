package br.com.example.je.controller.form;

import javax.validation.constraints.NotEmpty;

import org.springframework.security.crypto.bcrypt.BCrypt;

import br.com.example.je.model.User;

import com.sun.istack.NotNull;

public class UserForm {
	
	@NotNull @NotEmpty
	private String name;
	@NotNull @NotEmpty
	private String email;
	@NotNull @NotEmpty
	private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User converter() {
		return new User(name, email, BCrypt.hashpw(password, BCrypt.gensalt()));
	}

}
