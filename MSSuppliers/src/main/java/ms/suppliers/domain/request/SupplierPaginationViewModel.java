package ms.suppliers.domain.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SupplierPaginationViewModel {
    private List<SupplierViewModel> rows;
    private Integer page;
    private Integer records;
    private Integer total;
}
