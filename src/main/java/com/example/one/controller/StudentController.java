package com.example.one.controller;

import com.example.one.model.Student;
import com.example.one.repositories.Studentrepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    public Studentrepositories studentrepositories;
    @GetMapping
    public String execute(){

        return "Htmlfile";
    }
    @GetMapping("/addnew")
    public String execute2(Model model){
        model.addAttribute(new Student());
        return "addStudent";
    }

    @GetMapping("/edit/{id}")
    public String updateStu(@PathVariable(value = "id") int  id, Model model){
        model.addAttribute("student", studentrepositories.findById(id));
        return "updateStudent";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("allStudents", studentrepositories.findAll());
        return "viewStudents";
    }
    @PostMapping("/save")
        public String tosave(@ModelAttribute("student")Student student){
        System.out.println("id :"+student.getId());
        studentrepositories.save(student);
        return "redirect:/list";
    }

    @PutMapping("/update")
    public String update(@ModelAttribute("student")Student student){
        studentrepositories.save(student);
        return "redirect:/list";
    }

}
