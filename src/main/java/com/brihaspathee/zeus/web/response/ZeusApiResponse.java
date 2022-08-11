package com.brihaspathee.zeus.web.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 03, February 2022
 * Time: 5:45 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.response
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZeusApiResponse<E> {

    /**
     * Time stamp when the response was generated
     */
    private LocalDateTime timestamp;

    private int statusCode;

    private HttpStatus status;

    private String reason;

    private String message;

    private String developerMessage;

    private E response;


    @Override
    public String toString() {
        return "ZeusApiResponse{" +
                "timestamp=" + timestamp +
                ", statusCode=" + statusCode +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", message='" + message + '\'' +
                ", developerMessage='" + developerMessage + '\'' +
                ", response=" + response +
                '}';
    }
}
