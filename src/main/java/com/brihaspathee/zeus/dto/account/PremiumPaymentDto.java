package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, July 2024
 * Time: 6:06 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class PremiumPaymentDto {

    /**
     * Enrollment span code to which the payment is made
     */
    @JsonProperty(required = true)
    @Schema(description = "Enrollment Span Code",
            example = "IDNTD4VNLJK9VL3",
            requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotBlank
    private String enrollmentSpanCode;

    /**
     * The payment amount that is received
     */
    @JsonProperty(required = true)
    @Schema(description = "Premium Amount being paid",
            example = "350.00",
            requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal paymentAmount;

    /**
     * Payment date of the premium
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The payment date of the premium span", example = "1/1/2021", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate paymentDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "PremiumPaymentDto{" +
                "enrollmentSpanCode='" + enrollmentSpanCode + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
