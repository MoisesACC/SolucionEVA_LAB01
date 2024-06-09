package com.springbootAlumno.springbootAlumno.rest;

import com.springbootAlumno.springbootAlumno.model.Alumno;
import com.springbootAlumno.springbootAlumno.services.IAlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class AlumnoController {
    IAlumnoServices alumnoServices;

    @Autowired
    public AlumnoController(IAlumnoServices alumnoServices) {
        this.alumnoServices = alumnoServices;
    }

    @GetMapping("/alumnos")
    public List<Alumno> getAll() {
        return alumnoServices.getAllAlumnos();
    }

    @GetMapping("/alumno/{id}")
    public Alumno getById(@PathVariable int id) {
        return alumnoServices.getAlumnoById(id);
    }

    @PostMapping("/alumno")
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoServices.saveAlumno(alumno);
    }

    @DeleteMapping("/alumno/{id}")
    public void delete(@PathVariable int id) {
        alumnoServices.deleteAlumno(id);
    }

    @PutMapping("/alumno/{id}")
    public Alumno update(@PathVariable int id, @RequestBody Alumno alumno) {
        return alumnoServices.updateAlumno(id, alumno);
    }
}
