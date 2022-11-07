package shopping.model.fork.domain;

import shopping.model.fork.domain.*;
import shopping.model.fork.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InventoryDeducted extends AbstractEvent {

    private Long id;
    private String name;
    private Long qty;

    public InventoryDeducted(Product aggregate){
        super(aggregate);
    }
    public InventoryDeducted(){
        super();
    }
}
