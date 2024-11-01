package gdu.__java.API_demo.model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MyDB extends JpaRepository<Student, Integer> 
{

}
