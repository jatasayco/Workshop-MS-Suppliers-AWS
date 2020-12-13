package ms.suppliers.domain.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupplierViewModel {
    private Integer id;
    private String code;
    private String name;
    private String adress;
    private String contact_person;
    private boolean active;
    private String register_date;
}
