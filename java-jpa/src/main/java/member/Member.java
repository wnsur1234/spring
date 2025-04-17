package member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Data
@Entity
@DynamicInsert
public class Member {
    @Id
    private String userId;
    private String password;
    private String email;
    private String role = "ROLE_USER";
    private String tel;
    private Boolean activated = true;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime rentableDate = LocalDateTime.now().plus(7, ChronoUnit.DAYS);
}
