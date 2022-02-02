package com.dxc.learning.Repository;

public class Bookrepository {
    
import com.springboot.demo.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Author , Integer> {
    
}
    
}
