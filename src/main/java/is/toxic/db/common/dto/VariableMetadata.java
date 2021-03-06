package is.toxic.db.common.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class VariableMetadata {
    private Integer id;
    private LocalDateTime updated_at;
}
