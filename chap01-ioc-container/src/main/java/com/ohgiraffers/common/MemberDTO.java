package com.ohgiraffers.common;


import lombok.*;

//lombok이 있으면 어노테이션으로도 같은 기능 가능
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 초기화하는 생성자
@Setter
@Getter
@ToString

@Data //위 모든것을 포함하는 어노테이션이지만 하나하나 추가하는 것을 권장

public class MemberDTO {

    private int sequence;
    private String id;
    private String pwd;
    private String name;


}
