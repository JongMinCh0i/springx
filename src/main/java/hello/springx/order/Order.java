package hello.springx.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders") // order by 예약어로 인해서 보통 실무에서 orders 사용
@Setter
@Getter
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String username;  // 정상, 예외, 잔고부족
    private String paystatus; // 대기, 완료

}
