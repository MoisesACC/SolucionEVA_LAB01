package com.springbootAlumno.springbootAlumno.repository;

import com.springbootAlumno.springbootAlumno.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Integer> {
}
