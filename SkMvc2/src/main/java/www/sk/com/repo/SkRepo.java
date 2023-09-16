package www.sk.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.sk.com.model.Student;

@Repository
public interface SkRepo extends JpaRepository<Student,Integer>
{

}
