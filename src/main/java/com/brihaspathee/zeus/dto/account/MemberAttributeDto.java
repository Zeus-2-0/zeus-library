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
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, September 2022
 * Time: 10:10 AM
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
public class MemberAttributeDto {

    /**
     * The primary key of the member attribute
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Attribute SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberAttributeSK;

    /**
     * The primary key of the attribute
     */
    @JsonProperty(required = true)
    @Schema(description = "Attribute SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID attributeSK;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The value of the attribute
     */
    @JsonProperty(required = true)
    @Schema(description = "The value of the attribute", example = "FFM-FL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String attributeValue;

    /**
     * The source of the data
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the data", example = "MARKETPLACE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String source;

    /**
     * Identifies if the attribute was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the attribute was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The date when the attribute was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the attribute was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the attribute was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the attribute was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "MemberAttributeDto{" +
                "memberAttributeSK=" + memberAttributeSK +
                ", attributeSK=" + attributeSK +
                ", memberSK=" + memberSK +
                ", attributeValue='" + attributeValue + '\'' +
                ", source='" + source + '\'' +
                ", changed=" + changed +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
