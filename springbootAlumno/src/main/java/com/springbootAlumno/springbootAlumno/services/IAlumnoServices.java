package com.springbootAlumno.springbootAlumno.services;

import com.springbootAlumno.springbootAlumno.model.Alumno;
import java.util.List;

public interface IAlumnoServices {
    List<Alumno> getAllAlumnos();
    Alumno saveAlumno(Alumno alumno);
    Alumno getAlumnoById(int id);

    void deleteAlumno(int id);
    Alumno updateAlumno(int id, Alumno alumno);

}
