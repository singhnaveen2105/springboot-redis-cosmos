package springbootrediscosmos.springbootrediscosmos;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends ReactiveCosmosRepository<Employee,String> {
}
