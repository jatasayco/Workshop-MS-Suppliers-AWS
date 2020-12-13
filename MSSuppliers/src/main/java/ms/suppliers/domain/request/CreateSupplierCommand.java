package ms.suppliers.domain.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSupplierCommand {
    private String code;
    private String name;
    private String adress;
    private String contact_person;
    private String register_date;
}
