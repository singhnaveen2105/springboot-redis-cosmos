package springbootrediscosmos.springbootrediscosmos;

import com.azure.spring.data.cosmos.core.mapping.Container;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Container(containerName = "emp",autoCreateContainer = false)
public class Employee {
    @Id
    private String id;
    private String name;
}
