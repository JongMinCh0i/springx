package hello.springx.propagation;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;


    public Member() { // JPA 스펙상 기본 생성자가 있어야 한다.
    }

    public Member(String username) {
        this.username = username;
    }
}
