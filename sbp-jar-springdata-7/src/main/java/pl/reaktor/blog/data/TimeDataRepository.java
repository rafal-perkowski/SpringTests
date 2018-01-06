package pl.reaktor.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.reaktor.blog.model.TimeData;

@Repository
public interface TimeDataRepository extends JpaRepository<TimeData, Long>{
	
}