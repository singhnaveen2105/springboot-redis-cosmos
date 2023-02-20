package springbootrediscosmos.springbootrediscosmos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Mono<Employee> getEmployeeById(String id){
        return employeeRepository.findById(id);
    }
}
