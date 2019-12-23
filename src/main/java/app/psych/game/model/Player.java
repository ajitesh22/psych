package app.psych.game.model;

        import lombok.Getter;
        import lombok.Setter;
        import org.springframework.data.annotation.CreatedDate;
        import org.springframework.data.annotation.LastModifiedDate;

        import javax.persistence.*;
        import javax.validation.constraints.NotBlank;
        import java.io.Serializable;
        import java.util.Date;

@Entity
@Table(name = "players")
public  class Player implements Serializable {

    @Getter
    @Setter
    @NotBlank
    private String name;

}
