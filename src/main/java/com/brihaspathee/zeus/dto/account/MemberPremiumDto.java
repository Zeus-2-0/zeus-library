package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, September 2022
 * Time: 7:11 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberPremiumDto {

    /**
     * The primary key of the member premium span
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Premium Span SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberPremiumSK;

    /**
     * A unique code assigned to the member
     */
    @JsonProperty(required = true)
    @Schema(description = "A unique member code", example = "SDG3543SDFG23GF", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String memberCode;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The exchange member id of the member associated with the premium span
     */
    @JsonProperty(required = true)
    @Schema(description = "The exchange member id of the member", example = "2323452", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String exchangeMemberId;

    /**
     * The member's premium amount
     */
    @JsonProperty(required = true)
    @Schema(description = "The premium amount for the respective member", example = "150.00", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal individualPremiumAmount;

    /**
     * The date when the member premium span was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the premium span was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the member premium span was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the premium span was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberPremiumDto{" +
                "memberPremiumSK=" + memberPremiumSK +
                ", memberCode='" + memberCode + '\'' +
                ", memberSK=" + memberSK +
                ", exchangeMemberId='" + exchangeMemberId + '\'' +
                ", individualPremiumAmount=" + individualPremiumAmount +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
