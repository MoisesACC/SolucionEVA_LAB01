package com.springbootAlumno.springbootAlumno.services.Impl;

import com.springbootAlumno.springbootAlumno.model.Alumno;
import com.springbootAlumno.springbootAlumno.repository.IAlumnoRepository;
import com.springbootAlumno.springbootAlumno.services.IAlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServices implements IAlumnoServices {
    IAlumnoRepository _alumnoRepository;

    @Autowired
    public AlumnoServices(IAlumnoRepository alumnoRepository) {
        _alumnoRepository = alumnoRepository;
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        return _alumnoRepository.findAll();
    }

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        return _alumnoRepository.save(alumno);
    }

    @Override
    public Alumno getAlumnoById(int id) {
        Optional<Alumno> optionalAlumno = _alumnoRepository.findById(id);
        return optionalAlumno.orElse(null);
    }

    @Override
    public void deleteAlumno(int id) {
        _alumnoRepository.deleteById(id);
    }

    @Override
    public Alumno updateAlumno(int id, Alumno alumno) {
        Optional<Alumno> optionalAlumno = _alumnoRepository.findById(id);
        if (optionalAlumno.isPresent()) {
            Alumno existingAlumno = optionalAlumno.get();
            existingAlumno.setNombre(alumno.getNombre());
            existingAlumno.setCarrera(alumno.getCarrera());
            existingAlumno.setEdad(alumno.getEdad());
            existingAlumno.setCiclo(alumno.getCiclo());
            return _alumnoRepository.save(existingAlumno);
        } else {
            return null;
        }
    }
}
