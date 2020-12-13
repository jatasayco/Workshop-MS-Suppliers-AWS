package ms.suppliers.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Supplier {
    private Integer id;
    private String code;
    private String name;
    private String address;
    private String contactPerson;
    private String registerDate;
}
