package KPjava.emailSender.repository;

import KPjava.emailSender.entity.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmailRepository extends CrudRepository<Email, Long> {
}
