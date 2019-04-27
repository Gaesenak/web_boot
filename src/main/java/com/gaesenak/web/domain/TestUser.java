package com.gaesenak.web.domain;

import lombok.*;

@Data                 // @Getter + @Setter + @ToString 등
@AllArgsConstructor  // 모든 필드값을 인자로 받는 생성자
@NoArgsConstructor   // 기본 생성자
public class TestUser {
    private int id_user;
    private String email;
    private String password;
    private String nickname;
    private String created;
}
