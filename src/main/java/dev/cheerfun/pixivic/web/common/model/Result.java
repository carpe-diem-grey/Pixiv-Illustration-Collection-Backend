package dev.cheerfun.pixivic.web.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author echo huang
 * @version 1.0
 * @date 2019-07-13 14:18
 * @description 公共响应类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Result<T> {
    @JsonIgnore
    private HttpStatus httpStatus;
    private String message;
    private T data;
    public Result(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public void set(HttpStatus httpStatus, String message, T data) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }
}

