package com.example.todo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DuplicatedEmailException extends RuntimeException {

    // 기본생성자 + 에러메시지를 받는 생성자
    public DuplicatedEmailException(String message) {
        super(message);
    }
}
