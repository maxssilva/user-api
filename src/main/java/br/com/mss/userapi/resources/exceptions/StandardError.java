package br.com.mss.userapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * The type Standard error.
 */
@AllArgsConstructor
@Getter @Setter
public class StandardError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}
