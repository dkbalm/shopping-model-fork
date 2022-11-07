package shopping.model.fork.domain;

import shopping.model.fork.domain.*;
import shopping.model.fork.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Long orderId;
}


