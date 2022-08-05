package hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments {
    @Id
    private Integer id;
    private Integer user_id;
    private String comment;
    private Integer status;
    private Integer id_comment_type;
    private Date created_at;
}