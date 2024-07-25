package com.brihaspathee.zeus.test.validator;

import com.brihaspathee.zeus.constants.ZeusServiceNames;
import com.brihaspathee.zeus.dto.account.*;
import com.brihaspathee.zeus.dto.transaction.TransactionRuleDto;
import com.brihaspathee.zeus.dto.transaction.TransactionRuleMessageDto;
import com.brihaspathee.zeus.edi.models.enrollment.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 02, June 2023
 * Time: 3:31 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.test.validator
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Setter
@Getter
public class AccountValidator {

    private String testServiceName;

    /**
     * Validate the details the account
     * @param expectedAccountList
     * @param actualAccountList
     */
    public void assertAccount(AccountList expectedAccountList,
                              AccountList actualAccountList) {
        Set<AccountDto> expectedAccountDtos = expectedAccountList.getAccountDtos();
        Set<AccountDto> actualAccountDtos = actualAccountList.getAccountDtos();
//        log.info("Ex Accounts:{}", expectedAccountDtos);
//        log.info("Ac Account:{}", actualAccountDtos);
        expectedAccountDtos.stream().forEach( (expectedAccountDto -> {
            AccountDto actualAccount = actualAccountDtos.stream().filter(
                            (actualAccountDto) -> {
                                return expectedAccountDto.getAccountNumber().equals(actualAccountDto.getAccountNumber());
                            })
                    .findFirst().orElse(AccountDto.builder()
                            .accountSK(UUID.randomUUID())
                            .accountNumber("Random Account")
                            .build());
            try {
                assertAccount(expectedAccountDto, actualAccount);
            } catch (JsonProcessingException e) {
//                throw new RuntimeException(e);
                log.info(e.getMessage());
            }
        }));
    }

    /**
     * Compare the data of the account dot
     * @param expectedAccountDto the expected account details
     * @param actualAccountDto the actual account details
     */
    public void assertAccount(AccountDto expectedAccountDto,
                              AccountDto actualAccountDto) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String actualAccountDtoString = objectMapper.writeValueAsString(actualAccountDto);
        log.info("Expected Account:{}", expectedAccountDto);
        log.info("Actual Account:{}", actualAccountDto);
        log.info("Actual Account String :{}", actualAccountDtoString);
        assertEquals(expectedAccountDto.getAccountNumber(), actualAccountDto.getAccountNumber());
        assertZtcn(expectedAccountDto.getZtcn(), actualAccountDto.getZtcn());
        assertSource(expectedAccountDto.getSource(), actualAccountDto.getSource());
        assertEnrollmentSpans(expectedAccountDto.getEnrollmentSpans(), actualAccountDto.getEnrollmentSpans());
        assertMemberDetails(expectedAccountDto.getMembers(), actualAccountDto.getMembers());
        assertBrokers(expectedAccountDto.getBrokers(), actualAccountDto.getBrokers());
        assertSponsors(expectedAccountDto.getSponsors(), actualAccountDto.getSponsors());
        assertPayers(expectedAccountDto.getPayers(), actualAccountDto.getPayers());
    }

    /**
     * Assert the enrollment spans
     * @param expectedEnrollmentSpans
     * @param actualEnrollmentSpans
     */
    private void assertEnrollmentSpans(Set<EnrollmentSpanDto> expectedEnrollmentSpans,
                                       Set<EnrollmentSpanDto> actualEnrollmentSpans){
        if(expectedEnrollmentSpans == null || expectedEnrollmentSpans.isEmpty()){
            assertNull(actualEnrollmentSpans);
            return;
        }else{
            assertNotNull(actualEnrollmentSpans);
        }
        int expectedEnrollmentSpanSize = expectedEnrollmentSpans.size();
        int actualEnrollmentSpanSize = actualEnrollmentSpans.size();
        assertEquals(expectedEnrollmentSpanSize, actualEnrollmentSpanSize);
        if(expectedEnrollmentSpanSize == actualEnrollmentSpanSize){
            expectedEnrollmentSpans.forEach(expectedEnrollmentSpanDto -> {
                EnrollmentSpanDto actualEnrollmentSpanDto = actualEnrollmentSpans.stream().filter(actualSpan ->
                                expectedEnrollmentSpanDto.getEnrollmentSpanCode().equals(actualSpan.getEnrollmentSpanCode()))
                        .findFirst().orElse(EnrollmentSpanDto.builder()
                                .enrollmentSpanCode("Random Enrollment Span")
                                .build());
                String expectedEnrollmentSpanCode = expectedEnrollmentSpanDto.getEnrollmentSpanCode();
                String actualEnrollmentSpanCode = actualEnrollmentSpanDto.getEnrollmentSpanCode();
                assertEquals(expectedEnrollmentSpanCode,
                        actualEnrollmentSpanCode);
                if(expectedEnrollmentSpanCode.equals(actualEnrollmentSpanCode)){
                    if(expectedEnrollmentSpanDto.getEnrollmentSpanSK() != null){
                        assertNotNull(actualEnrollmentSpanDto.getEnrollmentSpanSK());
                        assertEquals(expectedEnrollmentSpanDto.getEnrollmentSpanSK(), actualEnrollmentSpanDto.getEnrollmentSpanSK());
                    }else{
                        if(!(this.testServiceName.equals(ZeusServiceNames.MEMBER_MGMT_SERVICE) ||
                                this.testServiceName.equals(ZeusServiceNames.FILE_MGMT_SERVICE))){
                            assertNull(actualEnrollmentSpanDto.getEnrollmentSpanSK());
                        }
                    }
                    assertEquals(expectedEnrollmentSpanDto.getStateTypeCode(),
                            actualEnrollmentSpanDto.getStateTypeCode());
                    assertEquals(expectedEnrollmentSpanDto.getMarketplaceTypeCode(),
                            actualEnrollmentSpanDto.getMarketplaceTypeCode());
                    assertEquals(expectedEnrollmentSpanDto.getBusinessUnitTypeCode(),
                            actualEnrollmentSpanDto.getBusinessUnitTypeCode());
                    assertEquals(expectedEnrollmentSpanDto.getEnrollmentType(),
                            actualEnrollmentSpanDto.getEnrollmentType());
                    assertEquals(expectedEnrollmentSpanDto.getCoverageTypeCode(),
                            actualEnrollmentSpanDto.getCoverageTypeCode());
                    assertEquals(expectedEnrollmentSpanDto.getStartDate(),
                            actualEnrollmentSpanDto.getStartDate());
                    assertEquals(expectedEnrollmentSpanDto.getEndDate(),
                            actualEnrollmentSpanDto.getEndDate());
                    assertEquals(expectedEnrollmentSpanDto.getExchangeSubscriberId(),
                            actualEnrollmentSpanDto.getExchangeSubscriberId());
                    assertEquals(expectedEnrollmentSpanDto.getPlanId(),
                            actualEnrollmentSpanDto.getPlanId());
                    assertEquals(expectedEnrollmentSpanDto.getGroupPolicyId(),
                            actualEnrollmentSpanDto.getGroupPolicyId());
                    assertEquals(expectedEnrollmentSpanDto.getProductTypeCode(),
                            actualEnrollmentSpanDto.getProductTypeCode());
                    if(expectedEnrollmentSpanDto.getEffectuationDate() == null){
                        assertNull(actualEnrollmentSpanDto.getEffectuationDate());
//                        assertEquals(LocalDate.now(), actualEnrollmentSpanDto.getEffectuationDate());
                    }else{
                        assertEquals(expectedEnrollmentSpanDto.getEffectuationDate(),
                                actualEnrollmentSpanDto.getEffectuationDate());
                    }
                    if(expectedEnrollmentSpanDto.getEffectiveReason() == null){
                        assertNull(actualEnrollmentSpanDto.getEffectiveReason());
                    }else {
                        assertNotNull(actualEnrollmentSpanDto.getEffectiveReason());
                        assertEquals(expectedEnrollmentSpanDto.getEffectiveReason(), actualEnrollmentSpanDto.getEffectiveReason());
                    }
                    if(expectedEnrollmentSpanDto.getTermReason() == null){
                        assertNull(actualEnrollmentSpanDto.getTermReason());
                    }else {
                        assertNotNull(actualEnrollmentSpanDto.getTermReason());
                        assertEquals(expectedEnrollmentSpanDto.getTermReason(), actualEnrollmentSpanDto.getTermReason());
                    }
                    if(expectedEnrollmentSpanDto.getChanged() != null){
                        assertNotNull(actualEnrollmentSpanDto.getChanged());
                        assertEquals(expectedEnrollmentSpanDto.getChanged().get(),
                                actualEnrollmentSpanDto.getChanged().get());
                    }
                    assertEquals(expectedEnrollmentSpanDto.getStatusTypeCode(),
                            actualEnrollmentSpanDto.getStatusTypeCode());
                    assertZtcn(expectedEnrollmentSpanDto.getZtcn(), actualEnrollmentSpanDto.getZtcn());
                    assertSource(expectedEnrollmentSpanDto.getSource(), actualEnrollmentSpanDto.getSource());
                    assertEquals(expectedEnrollmentSpanDto.isDelinqInd(),
                            actualEnrollmentSpanDto.isDelinqInd());
                    assertEquals(expectedEnrollmentSpanDto.getClaimPaidThroughDate(),
                            actualEnrollmentSpanDto.getClaimPaidThroughDate());
                    assertEquals(expectedEnrollmentSpanDto.getPaidThroughDate(),
                            actualEnrollmentSpanDto.getPaidThroughDate());
                    assertPremiumSpanDetails(expectedEnrollmentSpanDto.getPremiumSpans(),
                            actualEnrollmentSpanDto.getPremiumSpans());
                }
            });
        }
    }

    /**
     * Assert the details of the premium spans
     * @param expectedPremiumSpans
     * @param actualPremiumSpans
     */
    private void assertPremiumSpanDetails(Set<PremiumSpanDto> expectedPremiumSpans,
                                          Set<PremiumSpanDto> actualPremiumSpans){
        int expectedPremiumSpanSize = expectedPremiumSpans.size();
        int actualPremiumSpanSize = actualPremiumSpans.size();
        assertEquals(expectedPremiumSpanSize, actualPremiumSpanSize);
        if(expectedPremiumSpanSize == actualPremiumSpanSize){
            expectedPremiumSpans.stream().forEach(expectedPremiumSpanDto -> {
                PremiumSpanDto actualPremiumSpanDto = actualPremiumSpans.stream().filter(actualPremiumSpan ->
                                expectedPremiumSpanDto.getPremiumSpanCode().equals(actualPremiumSpan.getPremiumSpanCode()))
                        .findFirst().orElse(PremiumSpanDto.builder()
                                .premiumSpanCode("Random Premium Span")
                                .build());
                assertEquals(expectedPremiumSpanDto.getPremiumSpanCode(), actualPremiumSpanDto.getPremiumSpanCode());
//                log.info("Premium Span Code:{}", expectedPremiumSpanDto.getPremiumSpanCode());
                if(expectedPremiumSpanDto.getPremiumSpanCode().equals(actualPremiumSpanDto.getPremiumSpanCode())){
                    if(expectedPremiumSpanDto.getPremiumSpanSK() != null){
                        assertNotNull(actualPremiumSpanDto.getPremiumSpanSK());
                        assertEquals(expectedPremiumSpanDto.getPremiumSpanSK(), actualPremiumSpanDto.getPremiumSpanSK());
                    }else{
                        if(!(this.testServiceName.equals(ZeusServiceNames.MEMBER_MGMT_SERVICE) ||
                                this.testServiceName.equals(ZeusServiceNames.FILE_MGMT_SERVICE))){
                            assertNull(actualPremiumSpanDto.getPremiumSpanSK());
                        }
                    }
                    assertZtcn(expectedPremiumSpanDto.getZtcn(), actualPremiumSpanDto.getZtcn());
                    assertSource(expectedPremiumSpanDto.getSource(), actualPremiumSpanDto.getSource());
                    assertEquals(expectedPremiumSpanDto.getStartDate(), actualPremiumSpanDto.getStartDate());
                    assertEquals(expectedPremiumSpanDto.getEndDate(), actualPremiumSpanDto.getEndDate());
                    assertEquals(expectedPremiumSpanDto.getStatusTypeCode(), actualPremiumSpanDto.getStatusTypeCode());
                    assertEquals(expectedPremiumSpanDto.getCsrVariant(), actualPremiumSpanDto.getCsrVariant());
                    assertEquals(expectedPremiumSpanDto.getSequence(), actualPremiumSpanDto.getSequence());
                    assertEquals(expectedPremiumSpanDto.getTotalPremiumAmount().longValue(),
                            actualPremiumSpanDto.getTotalPremiumAmount().longValue());
                    assertEquals(expectedPremiumSpanDto.getTotalResponsibleAmount().longValue(),
                            actualPremiumSpanDto.getTotalResponsibleAmount().longValue());
                    if(expectedPremiumSpanDto.getAptcAmount() != null){
                        assertEquals(expectedPremiumSpanDto.getAptcAmount().longValue(),
                                actualPremiumSpanDto.getAptcAmount().longValue());
                    }else{
                        assertNull(actualPremiumSpanDto.getAptcAmount());
                    }

                    if(expectedPremiumSpanDto.getOtherPayAmount() != null){

                        assertEquals(expectedPremiumSpanDto.getOtherPayAmount().longValue(),
                                actualPremiumSpanDto.getOtherPayAmount().longValue());
                    }else{
                        assertNull(actualPremiumSpanDto.getOtherPayAmount());
                    }
                    if(expectedPremiumSpanDto.getCsrAmount() != null){
                        assertEquals(expectedPremiumSpanDto.getCsrAmount().longValue(),
                                actualPremiumSpanDto.getCsrAmount().longValue());
                    }else{
                        assertNull(actualPremiumSpanDto.getCsrAmount());
                    }
//                    log.info("Expected Member premiums not null:{}", expectedPremiumSpanDto);
                    if(expectedPremiumSpanDto.getMemberPremiumSpans() != null &&
                        expectedPremiumSpanDto.getMemberPremiumSpans().size() > 0){
//                        log.info("Expected Premium Dto SK:{}",expectedPremiumSpanDto.getPremiumSpanCode());
//                        log.info("Actual Premium Dto SK:{}",actualPremiumSpanDto.getPremiumSpanCode());
                        assertMemberPremiums(expectedPremiumSpanDto.getMemberPremiumSpans(),
                                actualPremiumSpanDto.getMemberPremiumSpans());
                    }
                    if(expectedPremiumSpanDto.getChanged() != null){
                        assertNotNull(actualPremiumSpanDto.getChanged());
                        assertEquals(expectedPremiumSpanDto.getChanged().get(),
                                actualPremiumSpanDto.getChanged().get());
                    }

                }
            });
        }
    }

    /**
     * Assert the individual member premium spans
     * @param expectedMemberPremiums
     * @param actualMemberPremiums
     */
    private void assertMemberPremiums(Set<MemberPremiumDto> expectedMemberPremiums,
                                      Set<MemberPremiumDto> actualMemberPremiums){
        int expectedMemberPremiumSize = expectedMemberPremiums.size();
        int actualMemberPremiumSize = actualMemberPremiums.size();
//        log.info("Expected Premium Span size:{}", expectedMemberPremiumSize);
//        log.info("Actual Premium Span size:{}", actualMemberPremiumSize);
        assertEquals(expectedMemberPremiumSize, actualMemberPremiumSize);
        if(expectedMemberPremiumSize == actualMemberPremiumSize){
            expectedMemberPremiums.stream().forEach(expectedMemberPremiumDto -> {
                MemberPremiumDto actualMemberPremiumDto = actualMemberPremiums.stream().filter(actualMemberPremium ->
                                expectedMemberPremiumDto.getMemberCode().equals(actualMemberPremium.getMemberCode()))
                        .findFirst().orElse(MemberPremiumDto.builder()
                                .memberCode("Random Member Code")
                                .build());
                assertEquals(expectedMemberPremiumDto.getMemberCode(), actualMemberPremiumDto.getMemberCode());
                if(expectedMemberPremiumDto.getMemberCode().equals(actualMemberPremiumDto.getMemberCode())){
                    assertEquals(expectedMemberPremiumDto.getExchangeMemberId(),
                            actualMemberPremiumDto.getExchangeMemberId());
                    assertEquals(expectedMemberPremiumDto.getIndividualPremiumAmount().longValue(),
                            actualMemberPremiumDto.getIndividualPremiumAmount().longValue());
                }
            });
        }
    }

    /**
     * Compare the details of the brokers
     * @param expectedBrokers - Brokers expected in the account
     * @param actualBrokers - Actual brokers in the account
     */
    private void assertBrokers(Set<BrokerDto> expectedBrokers,
                               Set<BrokerDto> actualBrokers){
        if(expectedBrokers == null || expectedBrokers.isEmpty()){
            assertNull(actualBrokers);
            return;
        }
        int expectedBrokerSize = expectedBrokers.size();
        int actualBrokerSize = actualBrokers.size();
        assertEquals(expectedBrokerSize, actualBrokerSize);
        expectedBrokers.forEach(expectedBrokerDto -> {
            BrokerDto actualBrokerDto = actualBrokers.stream().filter(actualBrokDto ->
                    expectedBrokerDto.getBrokerCode().equals(actualBrokDto.getBrokerCode()))
                    .findFirst().orElse(BrokerDto.builder()
                            .brokerCode("Random Broker Code")
                            .build());
            assertEquals(expectedBrokerDto.getBrokerCode(), actualBrokerDto.getBrokerCode());
            assertZtcn(expectedBrokerDto.getZtcn(), actualBrokerDto.getZtcn());
            assertSource(expectedBrokerDto.getSource(), actualBrokerDto.getSource());
            if (expectedBrokerDto.getBrokerSK() != null){
                assertNotNull(actualBrokerDto.getBrokerSK());
                assertEquals(expectedBrokerDto.getBrokerSK(), actualBrokerDto.getBrokerSK());
            }
            if(expectedBrokerDto.getChanged() != null){
                assertNotNull(actualBrokerDto.getChanged());
                assertEquals(expectedBrokerDto.getChanged().get(),
                        actualBrokerDto.getChanged().get());
            }
            assertEquals(expectedBrokerDto.getBrokerId(), actualBrokerDto.getBrokerId());
            assertEquals(expectedBrokerDto.getBrokerName(), actualBrokerDto.getBrokerName());
            assertEquals(expectedBrokerDto.getStartDate(), actualBrokerDto.getStartDate());
            if(expectedBrokerDto.getEndDate() == null){
                assertNull(actualBrokerDto.getEndDate());
            }else {
                assertNotNull(actualBrokerDto.getEndDate());
                assertEquals(expectedBrokerDto.getEndDate(), actualBrokerDto.getEndDate());
            }
            if (expectedBrokerDto.getAgencyId() != null){
                assertNotNull(actualBrokerDto.getAgencyId());
                assertEquals(expectedBrokerDto.getAgencyId(), actualBrokerDto.getAgencyId());
            }else{
                assertNull(actualBrokerDto.getAgencyId());
            }
            if (expectedBrokerDto.getAgencyName() != null){
                assertNotNull(actualBrokerDto.getAgencyName());
                assertEquals(expectedBrokerDto.getAgencyName(), actualBrokerDto.getAgencyName());
            }else{
                assertNull(actualBrokerDto.getAgencyName());
            }
            if (expectedBrokerDto.getAccountNumber1() != null){
                assertNotNull(actualBrokerDto.getAccountNumber1());
                assertEquals(expectedBrokerDto.getAccountNumber1(), actualBrokerDto.getAccountNumber1());
            }else{
                assertNull(actualBrokerDto.getAccountNumber1());
            }
            if (expectedBrokerDto.getAccountNumber2() != null){
                assertNotNull(actualBrokerDto.getAccountNumber2());
                assertEquals(expectedBrokerDto.getAccountNumber2(), actualBrokerDto.getAccountNumber2());
            }else{
                assertNull(actualBrokerDto.getAccountNumber2());
            }
        });
    }

    /**
     * Compare the details of the sponsors
     * @param expectedSponsors - Sponsors expected in the account
     * @param actualSponsors - Actual Sponsors in the account
     */
    private void assertSponsors(Set<SponsorDto> expectedSponsors,
                               Set<SponsorDto> actualSponsors){
        if(expectedSponsors == null || expectedSponsors.isEmpty()){
            assertNull(actualSponsors);
            return;
        }
        int expectedSponsorSize = expectedSponsors.size();
        int actualSponsorSize = actualSponsors.size();
        assertEquals(expectedSponsorSize, actualSponsorSize);
        expectedSponsors.forEach(expectedSponsorDto -> {
            SponsorDto actualSponsorDto = actualSponsors.stream().filter(actualSponDto ->
                            expectedSponsorDto.getSponsorCode().equals(actualSponDto.getSponsorCode()))
                    .findFirst().orElse(SponsorDto.builder()
                            .sponsorCode("Random Sponsor Code")
                            .build());
            assertEquals(expectedSponsorDto.getSponsorCode(), actualSponsorDto.getSponsorCode());
            assertZtcn(expectedSponsorDto.getZtcn(), actualSponsorDto.getZtcn());
            assertSource(expectedSponsorDto.getSource(), actualSponsorDto.getSource());
            if (expectedSponsorDto.getSponsorSK() != null){
                assertNotNull(actualSponsorDto.getSponsorSK());
                assertEquals(expectedSponsorDto.getSponsorSK(), actualSponsorDto.getSponsorSK());
            }
            if(expectedSponsorDto.getChanged() != null){
                assertNotNull(actualSponsorDto.getChanged());
                assertEquals(expectedSponsorDto.getChanged().get(),
                        actualSponsorDto.getChanged().get());
            }
            assertEquals(expectedSponsorDto.getSponsorId(), actualSponsorDto.getSponsorId());
            assertEquals(expectedSponsorDto.getSponsorName(), actualSponsorDto.getSponsorName());
            assertEquals(expectedSponsorDto.getStartDate(), actualSponsorDto.getStartDate());
            if(expectedSponsorDto.getEndDate() == null){
                assertNull(actualSponsorDto.getEndDate());
            }else {
                assertNotNull(actualSponsorDto.getEndDate());
                assertEquals(expectedSponsorDto.getEndDate(), actualSponsorDto.getEndDate());
            }
        });
    }

    /**
     * Compare the details of the payers
     * @param expectedPayers - Payers expected in the account
     * @param actualPayers - Actual Payers in the account
     */
    private void assertPayers(Set<PayerDto> expectedPayers,
                                Set<PayerDto> actualPayers){
        if(expectedPayers == null || expectedPayers.isEmpty()){
            assertNull(actualPayers);
            return;
        }
        int expectedPayerSize = expectedPayers.size();
        int actualPayerSize = actualPayers.size();
        assertEquals(expectedPayerSize, actualPayerSize);
        expectedPayers.forEach(expectedPayerDto -> {
            PayerDto actualPayerDto = actualPayers.stream().filter(actualPyrDto ->
                            expectedPayerDto.getPayerCode().equals(actualPyrDto.getPayerCode()))
                    .findFirst().orElse(PayerDto.builder()
                            .payerCode("Random Payer Code")
                            .build());
            assertEquals(expectedPayerDto.getPayerCode(), actualPayerDto.getPayerCode());
            assertZtcn(expectedPayerDto.getZtcn(), actualPayerDto.getZtcn());
            assertSource(expectedPayerDto.getSource(), actualPayerDto.getSource());
            if (expectedPayerDto.getPayerSK() != null){
                assertNotNull(actualPayerDto.getPayerSK());
                assertEquals(expectedPayerDto.getPayerSK(), actualPayerDto.getPayerSK());
            }
            if(expectedPayerDto.getChanged() != null){
                assertNotNull(actualPayerDto.getChanged());
                assertEquals(expectedPayerDto.getChanged().get(),
                        actualPayerDto.getChanged().get());
            }
            assertEquals(expectedPayerDto.getPayerId(), actualPayerDto.getPayerId());
            assertEquals(expectedPayerDto.getPayerName(), actualPayerDto.getPayerName());
            assertEquals(expectedPayerDto.getStartDate(), actualPayerDto.getStartDate());
            if(expectedPayerDto.getEndDate() == null){
                assertNull(actualPayerDto.getEndDate());
            }else {
                assertNotNull(actualPayerDto.getEndDate());
                assertEquals(expectedPayerDto.getEndDate(), actualPayerDto.getEndDate());
            }
        });
    }

    /**
     * Asser the details of the members
     * @param expectedMembers
     * @param actualMembers
     */
    public void assertMemberDetails(Set<MemberDto> expectedMembers,
                                    Set<MemberDto> actualMembers){
        if(expectedMembers == null || expectedMembers.isEmpty()){
            assertNull(actualMembers);
            return;
        }
        int expectedMemberSize = expectedMembers.size();
        int actualMemberSize = actualMembers.size();
        assertEquals(expectedMemberSize, actualMemberSize);
        if(expectedMemberSize == actualMemberSize){
            expectedMembers.forEach(expectedMemberDto -> {
                MemberDto actualMemberDto = actualMembers.stream().filter(actualMemDto ->
                                expectedMemberDto.getMemberCode().equals(actualMemDto.getMemberCode()))
                        .findFirst().orElse(MemberDto.builder()
                                .memberCode("Random Member Code")
                                .build());
                assertEquals(expectedMemberDto.getMemberCode(), actualMemberDto.getMemberCode());
                assertZtcn(expectedMemberDto.getZtcn(), actualMemberDto.getZtcn());
                assertSource(expectedMemberDto.getSource(), actualMemberDto.getSource());
                if(expectedMemberDto.getMemberCode().equals(actualMemberDto.getMemberCode())){
                    assertEquals(expectedMemberDto.getFirstName(), actualMemberDto.getFirstName());
                    assertEquals(expectedMemberDto.getMiddleName(), actualMemberDto.getMiddleName());
                    assertEquals(expectedMemberDto.getLastName(), actualMemberDto.getLastName());
                    assertEquals(expectedMemberDto.getDateOfBirth(), actualMemberDto.getDateOfBirth());
                    assertEquals(expectedMemberDto.getRelationshipTypeCode(), actualMemberDto.getRelationshipTypeCode());
                    assertEquals(expectedMemberDto.getGenderTypeCode(), actualMemberDto.getGenderTypeCode());
                    assertEquals(expectedMemberDto.getHeight(), actualMemberDto.getHeight());
                    assertEquals(expectedMemberDto.getWeight(), actualMemberDto.getWeight());
                    if(expectedMemberDto.getChanged() != null){
                        assertNotNull(actualMemberDto.getChanged());
                        assertEquals(expectedMemberDto.getChanged().get(),
                                actualMemberDto.getChanged().get());
                    }
                    assertMemberAddresses(expectedMemberDto.getMemberAddresses(), actualMemberDto.getMemberAddresses());
                    assertMemberIdentifiers(expectedMemberDto.getMemberIdentifiers(), actualMemberDto.getMemberIdentifiers());
                    assertMemberPhones(expectedMemberDto.getMemberPhones(), actualMemberDto.getMemberPhones());
//                    assertMemberLanguages(expectedMemberDto.getMemberLanguages(), actualMemberDto.getMemberLanguages());
                    assertMemberEmails(expectedMemberDto.getMemberEmails(), actualMemberDto.getMemberEmails());
                }
            });
        }
    }

    /**
     * Assert the details of the member address
     * @param expectedMemberAddresses
     * @param actualMemberAddresses
     */
    private void assertMemberAddresses(Set<MemberAddressDto> expectedMemberAddresses,
                                      Set<MemberAddressDto> actualMemberAddresses){
        if(expectedMemberAddresses == null){
            assertNull(actualMemberAddresses);
            return;
        }
        assertNotNull(actualMemberAddresses);
        int expectedMemberAddressSize = expectedMemberAddresses.size();
        int actualMemberAddressSize = actualMemberAddresses.size();
        assertEquals(expectedMemberAddressSize, actualMemberAddressSize);
        if(expectedMemberAddressSize == actualMemberAddressSize) {
            expectedMemberAddresses.stream().forEach(expectedMemberAddressDto -> {
                MemberAddressDto actualMemberAddressDto = actualMemberAddresses.stream().filter(actualMemAddrDto ->
                                expectedMemberAddressDto.getMemberAddressCode().equals(actualMemAddrDto.getMemberAddressCode()))
                        .findFirst().orElse(MemberAddressDto.builder()
                                .memberAddressCode("Random Member Address Code")
                                .build());
                assertEquals(expectedMemberAddressDto.getMemberAddressCode(), actualMemberAddressDto.getMemberAddressCode());
                assertZtcn(expectedMemberAddressDto.getZtcn(), actualMemberAddressDto.getZtcn());
                assertSource(expectedMemberAddressDto.getSource(), actualMemberAddressDto.getSource());
                if (expectedMemberAddressDto.getMemberAddressCode().equals(actualMemberAddressDto.getMemberAddressCode())) {
                    if (expectedMemberAddressDto.getMemberAddressSK() != null){
                        assertNotNull(actualMemberAddressDto.getMemberAddressSK());
                        assertEquals(expectedMemberAddressDto.getMemberAddressSK(), actualMemberAddressDto.getMemberAddressSK());
                    }
                    if(expectedMemberAddressDto.getChanged() != null){
                        assertNotNull(actualMemberAddressDto.getChanged());
                        assertEquals(expectedMemberAddressDto.getChanged().get(),
                                actualMemberAddressDto.getChanged().get());
                    }else{
                        assertNull(actualMemberAddressDto.getChanged());
                    }
                    assertEquals(expectedMemberAddressDto.getAddressTypeCode(), actualMemberAddressDto.getAddressTypeCode());
                    assertEquals(expectedMemberAddressDto.getAddressLine1(), actualMemberAddressDto.getAddressLine1());
                    assertEquals(expectedMemberAddressDto.getAddressLine2(), actualMemberAddressDto.getAddressLine2());
                    assertEquals(expectedMemberAddressDto.getCity(), actualMemberAddressDto.getCity());
                    assertEquals(expectedMemberAddressDto.getStateTypeCode(), actualMemberAddressDto.getStateTypeCode());
                    assertEquals(expectedMemberAddressDto.getFipsCode(), actualMemberAddressDto.getFipsCode());
                    assertEquals(expectedMemberAddressDto.getZipCode(), actualMemberAddressDto.getZipCode());
                    assertEquals(expectedMemberAddressDto.getStartDate(), actualMemberAddressDto.getStartDate());
                    if(expectedMemberAddressDto.getEndDate() == null){
                        assertNull(actualMemberAddressDto.getEndDate());
                    }else {
                        assertNotNull(actualMemberAddressDto.getEndDate());
                        assertEquals(expectedMemberAddressDto.getEndDate(), actualMemberAddressDto.getEndDate());
                    }
                }
            });
        }
    }

    /**
     * Compare the identifiers
     * @param expectedMemberIdentifiers
     * @param actualMemberIdentifiers
     */
    private void assertMemberIdentifiers(Set<MemberIdentifierDto> expectedMemberIdentifiers,
                                         Set<MemberIdentifierDto> actualMemberIdentifiers){
        if (expectedMemberIdentifiers == null || expectedMemberIdentifiers.isEmpty()){
            assertNull(actualMemberIdentifiers);
            return;
        }
        assertNotNull(actualMemberIdentifiers);
        int expectedMemberIdentifierSize = expectedMemberIdentifiers.size();
        int actualMemberIdentifierSize = actualMemberIdentifiers.size();
        assertEquals(expectedMemberIdentifierSize, actualMemberIdentifierSize);
        expectedMemberIdentifiers.forEach(expectedMemberIdentifierDto -> {
            MemberIdentifierDto actualMemberIdentifierDto = actualMemberIdentifiers.stream().filter(actualMemIdentDto ->
                            expectedMemberIdentifierDto.getMemberIdentifierCode().equals(actualMemIdentDto.getMemberIdentifierCode()))
                    .findFirst().orElse(MemberIdentifierDto.builder()
                            .memberIdentifierCode("Random Member Identifier Code")
                            .build());
            assertEquals(expectedMemberIdentifierDto.getMemberIdentifierCode(), actualMemberIdentifierDto.getMemberIdentifierCode());
            assertZtcn(expectedMemberIdentifierDto.getZtcn(), actualMemberIdentifierDto.getZtcn());
            assertSource(expectedMemberIdentifierDto.getSource(), actualMemberIdentifierDto.getSource());
            if (expectedMemberIdentifierDto.getMemberIdentifierSK() != null){
//                log.info("Expected member Identifier sk:{}", expectedMemberIdentifierDto.getMemberIdentifierSK());
                assertNotNull(actualMemberIdentifierDto.getMemberIdentifierSK());
                assertEquals(expectedMemberIdentifierDto.getMemberIdentifierSK(), actualMemberIdentifierDto.getMemberIdentifierSK());
            }
            if(expectedMemberIdentifierDto.getChanged() != null){
//                log.info("Member Identifier code:{}", expectedMemberIdentifierDto.getMemberIdentifierCode());
                assertNotNull(actualMemberIdentifierDto.getChanged());
                assertEquals(expectedMemberIdentifierDto.getChanged().get(),
                        actualMemberIdentifierDto.getChanged().get());
            }else{
                assertNull(actualMemberIdentifierDto.getChanged());
            }
            assertEquals(expectedMemberIdentifierDto.getIdentifierTypeCode(), actualMemberIdentifierDto.getIdentifierTypeCode());
            assertEquals(expectedMemberIdentifierDto.getIdentifierValue(), actualMemberIdentifierDto.getIdentifierValue());
            assertEquals(expectedMemberIdentifierDto.isActive(), actualMemberIdentifierDto.isActive());
        });
    }

    /**
     * Compare the phone numbers
     * @param expectedMemberPhones
     * @param actualMemberPhones
     */
    private void assertMemberPhones(Set<MemberPhoneDto> expectedMemberPhones,
                                         Set<MemberPhoneDto> actualMemberPhones){
        if (expectedMemberPhones == null || expectedMemberPhones.isEmpty()){
            assertNull(actualMemberPhones);
            return;
        }
        assertNotNull(actualMemberPhones);
        int expectedMemberPhoneSize = expectedMemberPhones.size();
        int actualMemberPhoneSize = actualMemberPhones.size();
        assertEquals(expectedMemberPhoneSize, actualMemberPhoneSize);
        expectedMemberPhones.forEach(expectedMemberPhoneDto -> {
            MemberPhoneDto actualMemberPhoneDto = actualMemberPhones.stream().filter(actualMemPhoneDto ->
                            expectedMemberPhoneDto.getMemberPhoneCode().equals(actualMemPhoneDto.getMemberPhoneCode()))
                    .findFirst().orElse(MemberPhoneDto.builder()
                            .memberPhoneCode("Random Member Phone Code")
                            .build());
            assertEquals(expectedMemberPhoneDto.getMemberPhoneCode(), actualMemberPhoneDto.getMemberPhoneCode());
            assertZtcn(expectedMemberPhoneDto.getZtcn(), actualMemberPhoneDto.getZtcn());
            assertSource(expectedMemberPhoneDto.getSource(), actualMemberPhoneDto.getSource());
            if (expectedMemberPhoneDto.getMemberPhoneSK() != null){
//                log.info("Expected member phone sk:{}", expectedMemberPhoneDto.getMemberPhoneSK());
                assertNotNull(actualMemberPhoneDto.getMemberPhoneSK());
                assertEquals(expectedMemberPhoneDto.getMemberPhoneSK(), actualMemberPhoneDto.getMemberPhoneSK());
            }
            if(expectedMemberPhoneDto.getChanged() != null){
//                log.info("Member Phone code:{}", expectedMemberPhoneDto.getMemberPhoneCode());
                assertNotNull(actualMemberPhoneDto.getChanged());
                assertEquals(expectedMemberPhoneDto.getChanged().get(),
                        actualMemberPhoneDto.getChanged().get());
            }else{
                assertNull(actualMemberPhoneDto.getChanged());
            }
            assertEquals(expectedMemberPhoneDto.getPhoneTypeCode(), actualMemberPhoneDto.getPhoneTypeCode());
            assertEquals(expectedMemberPhoneDto.getPhoneNumber(), actualMemberPhoneDto.getPhoneNumber());
            assertEquals(expectedMemberPhoneDto.getStartDate(), actualMemberPhoneDto.getStartDate());
            if(expectedMemberPhoneDto.getEndDate() == null){
                assertNull(actualMemberPhoneDto.getEndDate());
            }else {
                assertNotNull(actualMemberPhoneDto.getEndDate());
                assertEquals(expectedMemberPhoneDto.getEndDate(), actualMemberPhoneDto.getEndDate());
            }
        });
    }

    /**
     * Compare the languages
     * @param expectedMemberLanguages
     * @param actualMemberLanguages
     */
    private void assertMemberLanguages(Set<MemberLanguageDto> expectedMemberLanguages,
                                    Set<MemberLanguageDto> actualMemberLanguages){
        if (expectedMemberLanguages == null || expectedMemberLanguages.isEmpty()){
            assertNull(actualMemberLanguages);
            return;
        }
        assertNotNull(actualMemberLanguages);
        int expectedMemberLanguageSize = expectedMemberLanguages.size();
        int actualMemberLanguageSize = actualMemberLanguages.size();
        assertEquals(expectedMemberLanguageSize, actualMemberLanguageSize);
        expectedMemberLanguages.forEach(expectedMemberLanguageDto -> {
            MemberLanguageDto actualMemberLanguageDto = actualMemberLanguages.stream().filter(actualMemLangDto ->
                            expectedMemberLanguageDto.getMemberLanguageCode().equals(actualMemLangDto.getMemberLanguageCode()))
                    .findFirst().orElse(MemberLanguageDto.builder()
                            .memberLanguageCode("Random Member Language Code")
                            .build());
            assertEquals(expectedMemberLanguageDto.getMemberLanguageCode(), actualMemberLanguageDto.getMemberLanguageCode());
            assertZtcn(expectedMemberLanguageDto.getZtcn(), actualMemberLanguageDto.getZtcn());
            assertSource(expectedMemberLanguageDto.getSource(), actualMemberLanguageDto.getSource());
            if (expectedMemberLanguageDto.getMemberLanguageSK() != null){
//                log.info("Expected member language sk:{}", expectedMemberLanguageDto.getMemberLanguageSK());
                assertNotNull(actualMemberLanguageDto.getMemberLanguageSK());
                assertEquals(expectedMemberLanguageDto.getMemberLanguageSK(), actualMemberLanguageDto.getMemberLanguageSK());
            }
            if(expectedMemberLanguageDto.getChanged() != null){
//                log.info("Member Language code:{}", expectedMemberLanguageDto.getMemberLanguageCode());
                assertNotNull(actualMemberLanguageDto.getChanged());
                assertEquals(expectedMemberLanguageDto.getChanged().get(),
                        actualMemberLanguageDto.getChanged().get());
            }else{
                assertNull(actualMemberLanguageDto.getChanged());
            }
            assertEquals(expectedMemberLanguageDto.getLanguageTypeCode(), actualMemberLanguageDto.getLanguageTypeCode());
            assertEquals(expectedMemberLanguageDto.getLanguageCode(), actualMemberLanguageDto.getLanguageCode());
            assertEquals(expectedMemberLanguageDto.getStartDate(), actualMemberLanguageDto.getStartDate());
            if(expectedMemberLanguageDto.getEndDate() == null){
                assertNull(actualMemberLanguageDto.getEndDate());
            }else {
                assertNotNull(actualMemberLanguageDto.getEndDate());
                assertEquals(expectedMemberLanguageDto.getEndDate(), actualMemberLanguageDto.getEndDate());
            }
        });
    }

    /**
     * Compare the emails
     * @param expectedMemberEmails
     * @param actualMemberEmails
     */
    private void assertMemberEmails(Set<MemberEmailDto> expectedMemberEmails,
                                       Set<MemberEmailDto> actualMemberEmails){
        if (expectedMemberEmails == null || expectedMemberEmails.isEmpty()){
            assertNull(actualMemberEmails);
            return;
        }
        assertNotNull(actualMemberEmails);
        int expectedMemberEmailSize = expectedMemberEmails.size();
        int actualMemberEmailSize = actualMemberEmails.size();
        assertEquals(expectedMemberEmailSize, actualMemberEmailSize);
        expectedMemberEmails.forEach(expectedMemberEmailDto -> {
            MemberEmailDto actualMemberEmailDto = actualMemberEmails.stream().filter(actualMemEmailDto ->
                            expectedMemberEmailDto.getMemberEmailCode().equals(actualMemEmailDto.getMemberEmailCode()))
                    .findFirst().orElse(MemberEmailDto.builder()
                            .memberEmailCode("Random Member Email Code")
                            .build());
            assertEquals(expectedMemberEmailDto.getMemberEmailCode(), actualMemberEmailDto.getMemberEmailCode());
            assertZtcn(expectedMemberEmailDto.getZtcn(), actualMemberEmailDto.getZtcn());
            assertSource(expectedMemberEmailDto.getSource(), actualMemberEmailDto.getSource());
            if (expectedMemberEmailDto.getMemberEmailSK() != null){
//                log.info("Expected member email sk:{}", expectedMemberEmailDto.getMemberEmailSK());
                assertNotNull(actualMemberEmailDto.getMemberEmailSK());
                assertEquals(expectedMemberEmailDto.getMemberEmailSK(), actualMemberEmailDto.getMemberEmailSK());
            }
            if(expectedMemberEmailDto.getChanged() != null){
//                log.info("Member Email code:{}", expectedMemberEmailDto.getMemberEmailCode());
                assertNotNull(actualMemberEmailDto.getChanged());
                assertEquals(expectedMemberEmailDto.getChanged().get(),
                        actualMemberEmailDto.getChanged().get());
            }else{
                assertNull(actualMemberEmailDto.getChanged());
            }
            assertEquals(expectedMemberEmailDto.getEmailTypeCode(), actualMemberEmailDto.getEmailTypeCode());
            assertEquals(expectedMemberEmailDto.getEmail(), actualMemberEmailDto.getEmail());
            assertEquals(expectedMemberEmailDto.isPrimary(), actualMemberEmailDto.isPrimary());
            assertEquals(expectedMemberEmailDto.getStartDate(), actualMemberEmailDto.getStartDate());
            if(expectedMemberEmailDto.getEndDate() == null){
                assertNull(actualMemberEmailDto.getEndDate());
            }else {
                assertNotNull(actualMemberEmailDto.getEndDate());
                assertEquals(expectedMemberEmailDto.getEndDate(), actualMemberEmailDto.getEndDate());
            }
        });
    }

    /**
     * Validate of the ZTCNs are equal
     * @param expectedZtcn
     * @param actualZtcn
     */
    private void assertZtcn(String expectedZtcn, String actualZtcn){
        log.info("Expected Ztcn:{}", expectedZtcn);
        log.info("Actual Ztcn:{}", actualZtcn);
        if(expectedZtcn == null){
            assertNull(actualZtcn);
        }else{
            assertNotNull(actualZtcn);
            assertEquals(expectedZtcn, actualZtcn);
        }
    }

    /**
     * Validate if the source is equal
     * @param expectedSource
     * @param actualSource
     */
    private void assertSource(String expectedSource, String actualSource){
        if(expectedSource == null){
            assertNull(actualSource);
        }else{
            assertNotNull(actualSource);
            assertEquals(expectedSource, actualSource);
        }
    }


    /**
     * Method to print data that is being compared
     * @param actualString
     * @param expectedString
     * @param comparedData
     */
    private void printComparedValues(String actualString, String expectedString, String comparedData){
        log.info("Data being compared:{}", comparedData);
        log.info("Actual " + comparedData + ":" + actualString);
        log.info("Expected " + comparedData + ":" + expectedString);
    }
}
