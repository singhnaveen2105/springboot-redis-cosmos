package springbootrediscosmos.springbootrediscosmos;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emp")
public class EmployeeControllers {
    private final EmployeeService employeeService;
    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }
}
