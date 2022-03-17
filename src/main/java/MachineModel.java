import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MachineModel {

    private String time;

    private Long goodParts;

    private Long scrapParts;

    private Long machine;

    private Long sequenceNumber;

}
