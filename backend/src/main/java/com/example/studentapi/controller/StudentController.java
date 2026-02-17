package com.example.studentapi.controller;

import com.example.studentapi.entity.Student;
import com.example.studentapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // ✅ CREATE
    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.save(student);
    }

    // ✅ READ
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    // ✅ UPDATE
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.update(id, student);
}

    @GetMapping("/")
    public String home() {
        return "Student API is running 🚀";
    }

}
