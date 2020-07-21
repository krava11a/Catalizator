package kan.catalizator.repo;

import kan.catalizator.domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepo extends ReactiveCrudRepository<Message,Long> {

}
