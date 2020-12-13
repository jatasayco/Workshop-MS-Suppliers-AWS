package ms.suppliers.domain.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSupplierStateCommand {
    private Integer id;
    private Boolean is_active;
}
