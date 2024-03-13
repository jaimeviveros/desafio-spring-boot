package cl.previred.challenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String description;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User assignedUser;

  @ManyToOne
  @JoinColumn(name = "status_id")
  private TaskStatus status;

}
