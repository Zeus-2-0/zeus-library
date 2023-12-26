package com.brihaspathee.zeus.dto.transaction;

import com.brihaspathee.zeus.test.ZeusTransactionControlNumber;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, December 2023
 * Time: 5:02 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.transaction
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDetailDto {

    private UUID fileDetailSK;

    private String zeusFileControlNumber;

    private String fileName;

    private LocalDateTime fileReceivedDate;

    private String tradingPartnerId;

    private String senderId;

    private String receiverId;

    private String lineOfBusinessTypeCode;

    private String businessUnitTypeCode;

    private String marketplaceTypeCode;

    private String stateTypeCode;

    private String fileData;

    /**
     * This is used only during integration testing
     * The transaction control number and the entity codes that needs to be
     * created are provided here instead of being randomly created
     * so that testing can be done by comparing against those codes
     */
    private List<ZeusTransactionControlNumber> transactionControlNumbers;

    @Override
    public String toString() {
        return "FileDetailDto{" +
                "fileDetailSK=" + fileDetailSK +
                ", zfcn='" + zeusFileControlNumber + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileReceivedDate=" + fileReceivedDate +
                ", tradingPartnerId='" + tradingPartnerId + '\'' +
                ", senderId='" + senderId + '\'' +
                ", receiverId='" + receiverId + '\'' +
                ", lineOfBusinessTypeCode='" + lineOfBusinessTypeCode + '\'' +
                ", marketplaceTypeCode='" + marketplaceTypeCode + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", fileData='" + fileData + '\'' +
                ", transactionControlNumbers='" + transactionControlNumbers + '\'' +
                '}';
    }
}
