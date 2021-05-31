package net.javaguides.springboot.tutorial.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.tutorial.entity.Student;
import net.javaguides.springboot.tutorial.entity.UserBB;
import net.javaguides.springboot.tutorial.repository.UserBBRepository;

@Controller
@RequestMapping("/user/")
public class UserBBController {

	private final UserBBRepository repo;

	@Autowired
	public UserBBController(UserBBRepository UserBBRepository) {
		this.repo = UserBBRepository;
	}

	@GetMapping("list1")
	public String showUpdateForm1() {
		return "index";
	}
	@GetMapping("aboutus")
	public String AboutUS() {
		return "about-us";
	}

	@GetMapping("signup")
	public String showSignUpForm(UserBB userBB) {
		return "add-student";
	}

	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("users", repo.findAll());
		return "index";
	}

	@PostMapping("add")
	public String addStudent(@Valid UserBB student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-student";
		}

		repo.save(student);
		return "redirect:list";
	}
	
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		UserBB student = repo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
		model.addAttribute("user", student);
		return "update-student";
	}
	
	@PostMapping("update/{id}")
	public String updateStudent(@PathVariable("id") long id, @Valid UserBB userBB, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			userBB.setId(id);
			return "update-student";
		}

		repo.save(userBB);
		model.addAttribute("users", repo.findAll());
		return "index";
	}

	@GetMapping("delete/{id}")
	public String deleteStudent(@PathVariable("id") long id, Model model) {
		UserBB student = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
		repo.delete(student);
		model.addAttribute("users", repo.findAll());
		return "index";
	}

}
