package com.brihaspathee.zeus.test.validator;

import com.brihaspathee.zeus.dto.transaction.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, January 2024
 * Time: 9:26 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.test.validator
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Setter
@Getter
public class TransactionValidator {

    /**
     * Validate the details of the transaction
     * @param expectedTransactionDto
     * @param actualTransactionDto
     */
    public void assertTransaction(TransactionDto expectedTransactionDto,
                                  TransactionDto actualTransactionDto) {
        log.info("Expected Transaction:{}", expectedTransactionDto);
        log.info("Actual Transaction:{}", actualTransactionDto);
        assertEquals(expectedTransactionDto.getZtcn(), actualTransactionDto.getZtcn());
        assertEquals(expectedTransactionDto.getSource(), actualTransactionDto.getSource());
        assertEquals(expectedTransactionDto.getTransactionReceivedDate(),
                actualTransactionDto.getTransactionReceivedDate());
        assertTransactionDetail(expectedTransactionDto.getTransactionDetail(),
                actualTransactionDto.getTransactionDetail());
        assertTransactionStatus(expectedTransactionDto.getTransactionStatus(),
                actualTransactionDto.getTransactionStatus());
        assertTradingPartner(expectedTransactionDto.getTradingPartnerDto(),
                actualTransactionDto.getTradingPartnerDto());
        assertSponsor(expectedTransactionDto.getSponsor(),
                actualTransactionDto.getSponsor());
        assertPayer(expectedTransactionDto.getPayer(),
                actualTransactionDto.getPayer());
        assertBroker(expectedTransactionDto.getBroker(),
                actualTransactionDto.getBroker());
        assertTransactionAttributeList(expectedTransactionDto.getTransactionAttributes(),
                actualTransactionDto.getTransactionAttributes());
        assertRates(expectedTransactionDto.getTransactionRates(),
                actualTransactionDto.getTransactionRates());
        assertMembers(expectedTransactionDto.getMembers(),
                actualTransactionDto.getMembers());
        assertTransactionRules(expectedTransactionDto.getTransactionRules(),
                actualTransactionDto.getTransactionRules());

    }

    /**
     * Asserts the values in the transaction detail dto
     * @param expectedTransactionDetailDto
     * @param actualTransactionDetailDto
     */
    private void assertTransactionDetail(TransactionDetailDto expectedTransactionDetailDto,
                                        TransactionDetailDto actualTransactionDetailDto){
        assertEquals(expectedTransactionDetailDto.getTransactionTypeCode(),
                actualTransactionDetailDto.getTransactionTypeCode());
        assertEquals(expectedTransactionDetailDto.getCoverageTypeCode(),
                actualTransactionDetailDto.getCoverageTypeCode());
        assertEquals(expectedTransactionDetailDto.getPlanId(),
                actualTransactionDetailDto.getPlanId());
        assertEquals(expectedTransactionDetailDto.getGroupPolicyId(),
                actualTransactionDetailDto.getGroupPolicyId());
        assertEquals(expectedTransactionDetailDto.getCsrVariant(),
                actualTransactionDetailDto.getCsrVariant());
        assertEquals(expectedTransactionDetailDto.getMaintenanceReasonCode(),
                actualTransactionDetailDto.getMaintenanceReasonCode());
        assertEquals(expectedTransactionDetailDto.getEffectiveDate(),
                actualTransactionDetailDto.getEffectiveDate());
        if(expectedTransactionDetailDto.getEndDate() != null){
            assertNotNull(actualTransactionDetailDto.getEndDate());
            assertEquals(expectedTransactionDetailDto.getEndDate(),
                    actualTransactionDetailDto.getEndDate());
        }else{
            assertNull(actualTransactionDetailDto.getEndDate());
        }

        if(expectedTransactionDetailDto.getMaintenanceEffectiveDate()!=null){
            assertNotNull(actualTransactionDetailDto.getMaintenanceEffectiveDate());
            assertEquals(expectedTransactionDetailDto.getMaintenanceEffectiveDate(),
                    actualTransactionDetailDto.getMaintenanceEffectiveDate());
        }else{
            assertNull(actualTransactionDetailDto.getMaintenanceEffectiveDate());
        }
    }

    /**
     * Assert the data in status dto
     * @param expectedTransactionStatusDto
     * @param actualTransactionStatusDto
     */
    private void assertTransactionStatus(TransactionStatusDto expectedTransactionStatusDto,
                                        TransactionStatusDto actualTransactionStatusDto){
        assertEquals(expectedTransactionStatusDto.getProcessingStatusTypeCode(),
                actualTransactionStatusDto.getProcessingStatusTypeCode());
        assertEquals(expectedTransactionStatusDto.getTransactionStatusTypeCode(),
                actualTransactionStatusDto.getTransactionStatusTypeCode());
    }

    /**
     * Assert trading partner details
     * @param expectedTP
     * @param actualTP
     */
    private void assertTradingPartner(TransactionTradingPartnerDto expectedTP,
                                     TransactionTradingPartnerDto actualTP){
        assertEquals(expectedTP.getTradingPartnerId(),
                actualTP.getTradingPartnerId());
        assertEquals(expectedTP.getLineOfBusinessTypeCode(),
                actualTP.getLineOfBusinessTypeCode());
        assertEquals(expectedTP.getBusinessTypeCode(),
                actualTP.getBusinessTypeCode());
        assertEquals(expectedTP.getMarketplaceTypeCode(),
                actualTP.getMarketplaceTypeCode());
        assertEquals(expectedTP.getStateTypeCode(),
                actualTP.getStateTypeCode());
    }

    /**
     * Assert the details of the sponsor
     * @param expectedSponsor
     * @param actualSponsor
     */
    private void assertSponsor(TransactionSponsorDto expectedSponsor,
                              TransactionSponsorDto actualSponsor){
        assertEquals(expectedSponsor.getSponsorName(),
                actualSponsor.getSponsorName());
        assertEquals(expectedSponsor.getSponsorId(),
                actualSponsor.getSponsorId());
        assertEquals(expectedSponsor.getReceivedDate(),
                actualSponsor.getReceivedDate());

    }

    /**
     * Assert the details of the payer
     * @param expectedPayer
     * @param actualPayer
     */
    private void assertPayer(TransactionPayerDto expectedPayer,
                            TransactionPayerDto actualPayer){
        assertEquals(expectedPayer.getPayerId(),
                actualPayer.getPayerId());
        assertEquals(expectedPayer.getPayerName(),
                actualPayer.getPayerName());
        assertEquals(expectedPayer.getReceivedDate(),
                actualPayer.getReceivedDate());

    }

    /**
     * Assert the details of the broker
     * @param expectedBroker
     * @param actualBroker
     */
    private void assertBroker(TransactionBrokerDto expectedBroker,
                             TransactionBrokerDto actualBroker){
        if(expectedBroker == null){
            assertNull(actualBroker);
            return;
        }
        assertEquals(expectedBroker.getBrokerName(),
                actualBroker.getBrokerName());
        assertEquals(expectedBroker.getBrokerId(),
                actualBroker.getBrokerId());
        assertEquals(expectedBroker.getAgencyId(),
                actualBroker.getAgencyId());
        assertEquals(expectedBroker.getAgencyName(),
                actualBroker.getAgencyName());
        assertEquals(expectedBroker.getAccountNumber1(),
                actualBroker.getAccountNumber1());
        assertEquals(expectedBroker.getAccountNumber2(),
                actualBroker.getAccountNumber2());
        assertEquals(expectedBroker.getReceivedDate(),
                actualBroker.getReceivedDate());

    }

    /**
     * Assert the rate values
     * @param expectedRates
     * @param actualRates
     */
    private void assertRates(List<TransactionRateDto> expectedRates,
                            List<TransactionRateDto> actualRates){
        if(expectedRates!=null){
            expectedRates.forEach(expectedRateDto -> {
                log.info("Expected Rate Type:{}", expectedRateDto.getRateTypeCode());
                log.info("Expected Rate Start Date:{}", expectedRateDto.getRateStartDate());
                Optional<TransactionRateDto> optionalRateDto =
                        actualRates.stream()
                                .filter(actualRateDto ->
                                        actualRateDto.getRateTypeCode()
                                                .equals(expectedRateDto.getRateTypeCode()) &&
                                                actualRateDto.getRateStartDate().equals(expectedRateDto.getRateStartDate())
                                )
                                .findFirst();
                assertTrue(optionalRateDto.isPresent());
                assertRate(expectedRateDto, optionalRateDto.get());
            });
        }else{
            assertNull(actualRates);
        }
    }

    /**
     * Assert the details of the rate
     * @param expectedRate
     * @param actualRate
     */
    private void assertRate(TransactionRateDto expectedRate, TransactionRateDto actualRate){
        assertEquals(expectedRate.getRateTypeCode(),
                actualRate.getRateTypeCode());
//        assertEquals(expectedRate.getTransactionRate(),
//                actualRate.getTransactionRate());
        assertEquals(0, expectedRate.getTransactionRate().compareTo(actualRate.getTransactionRate()));
        assertEquals(expectedRate.getRateStartDate(),
                actualRate.getRateStartDate());
        assertEquals(expectedRate.getCsrVariant(),
                actualRate.getCsrVariant());
        if(expectedRate.getRateEndDate() != null){
            assertNotNull(actualRate.getRateEndDate());
            assertEquals(expectedRate.getRateEndDate(),
                    actualRate.getRateEndDate());
        }else{
            assertNull(actualRate.getRateEndDate());
        }
    }

    /**
     * Assert the details of the transaction attributes
     * @param expectedTransactionAttributes
     * @param actualTransactionAttributes
     */
    private void assertTransactionAttributeList(List<TransactionAttributeDto> expectedTransactionAttributes,
                                            List<TransactionAttributeDto> actualTransactionAttributes){
        if(expectedTransactionAttributes!=null){
            expectedTransactionAttributes.forEach(expectedAttributeDto -> {
                Optional<TransactionAttributeDto> optionalAttributeDto =
                        actualTransactionAttributes.stream()
                                .filter(actualAttributeDto ->
                                        actualAttributeDto.getTransactionAttributeTypeCode()
                                                .equals(expectedAttributeDto.getTransactionAttributeTypeCode()))
                                .findFirst();
                assertTrue(optionalAttributeDto.isPresent());
                assertTransactionAttribute(expectedAttributeDto,
                        optionalAttributeDto.get());
            });
        }else{
            assertNull(actualTransactionAttributes);
        }

    }

    /**
     * Assert the details of the transaction attribute
     * @param expectedAttributeDto
     * @param actualAttributeDto
     */
    private void assertTransactionAttribute(TransactionAttributeDto expectedAttributeDto,
                                            TransactionAttributeDto actualAttributeDto){
        assertEquals(expectedAttributeDto.getTransactionAttributeTypeCode(),
                actualAttributeDto.getTransactionAttributeTypeCode());
        assertEquals(expectedAttributeDto.getTransactionAttributeValue(),
                actualAttributeDto.getTransactionAttributeValue());
    }

    /**
     * Assert the values of the expected and actual member
     * @param expectedMembers
     * @param actualMembers
     */
    private void assertMembers(List<TransactionMemberDto> expectedMembers,
                              List<TransactionMemberDto> actualMembers){
        log.info("Expected Members :{}", expectedMembers);
        log.info("Actual Members :{}", actualMembers);
        if(expectedMembers!=null){
            expectedMembers.forEach(expectedMember -> {
                String expectedExchangeMemberId = getExchangeMemberId(expectedMember);
                log.info("Expected Exchange member id:{}", expectedExchangeMemberId);
                Optional<TransactionMemberDto> optionalActualMember = actualMembers.stream().filter(actualMember -> {

                    String actualExchangeMemberId = getExchangeMemberId(actualMember);
                    log.info("Actual Exchange member id:{}", actualExchangeMemberId);
                    return expectedExchangeMemberId.equals(actualExchangeMemberId);
                }).findFirst();
                assertTrue(optionalActualMember.isPresent());
                TransactionMemberDto actualMember = optionalActualMember.get();

                assertMember(expectedMember, actualMember);
            });
        }else{
            assertNull(actualMembers);
        }

    }

    /**
     * Assert member details
     * @param expectedMember
     * @param actualMember
     */
    private void assertMember(TransactionMemberDto expectedMember,
                              TransactionMemberDto actualMember){
        log.info("Expected Member:{}", expectedMember);
        log.info("Actual Member:{}", actualMember);
        assertEquals(expectedMember.getTransactionTypeCode(),
                actualMember.getTransactionTypeCode());
        assertEquals(expectedMember.getEffectiveDate(),
                actualMember.getEffectiveDate());
        if(expectedMember.getEndDate()!=null){
            assertNotNull(actualMember.getEndDate());
            assertEquals(expectedMember.getEndDate(),
                    actualMember.getEndDate());
        }else {
            assertNull(actualMember.getEndDate());
        }
        assertEquals(expectedMember.getRelationshipTypeCode(),
                actualMember.getRelationshipTypeCode());
        assertEquals(expectedMember.getReasonTypeCode(),
                actualMember.getReasonTypeCode());
        assertEquals(expectedMember.getFirstName(),
                actualMember.getFirstName());
        assertEquals(expectedMember.getMiddleName(),
                actualMember.getMiddleName());
        assertEquals(expectedMember.getLastName(),
                actualMember.getLastName());
        assertEquals(expectedMember.getTobaccoIndicator(),
                actualMember.getTobaccoIndicator());
        assertEquals(expectedMember.getDateOfBirth(),
                actualMember.getDateOfBirth());
        assertEquals(expectedMember.getGenderTypeCode(),
                actualMember.getGenderTypeCode());
//        assertEquals(expectedMember.getMemberRate(),
//                actualMember.getMemberRate());
        if(expectedMember.getMemberRate()!=null){
            assertNotNull(actualMember.getMemberRate());
            log.info("Expected Member Rate:{}", expectedMember.getMemberRate());
            log.info("Actual Member  Rate:{}", actualMember.getMemberRate());
            assertEquals(0, expectedMember.getMemberRate()
                    .compareTo(actualMember.getMemberRate()));
        }
        assertEquals(expectedMember.getHeight(),
                actualMember.getHeight());
        assertEquals(expectedMember.getWeight(),
                actualMember.getWeight());
//        assertEquals(expectedMember.getProductCatalogRate(),
//                actualMember.getProductCatalogRate());
        log.info("Expected Member Product Catalog Rate:{}", expectedMember.getProductCatalogRate());
        log.info("Actual Member Product Catalog Rate:{}", actualMember.getProductCatalogRate());
        if(expectedMember.getProductCatalogRate()!=null){
            assertNotNull(actualMember.getProductCatalogRate());
            assertEquals(0, expectedMember.getProductCatalogRate()
                    .compareTo(actualMember.getProductCatalogRate()));
        }
        assertMemberPhones(expectedMember.getMemberPhones(),
                actualMember.getMemberPhones());
        assertMemberAddresses(expectedMember.getMemberAddresses(),
                actualMember.getMemberAddresses());
        assertMemberIdentifiers(expectedMember.getIdentifiers(),
                actualMember.getIdentifiers());
        assertMemberEmails(expectedMember.getEmails(),
                actualMember.getEmails());
        assertMemberLanguages(expectedMember.getLanguages(),
                actualMember.getLanguages());
        assertMemberAlternateContacts(expectedMember.getAlternateContacts(),
                actualMember.getAlternateContacts());
        
    }

    /**
     * Assert the values of the member phone
     * @param expectedMemberPhones
     * @param actualMemberPhones
     */
    private void assertMemberPhones(List<TransactionMemberPhoneDto> expectedMemberPhones,
                                   List<TransactionMemberPhoneDto> actualMemberPhones){
        {
            {
                if(expectedMemberPhones!=null && expectedMemberPhones.size() > 0){
                    assertTrue(actualMemberPhones.size() > 0);
                    expectedMemberPhones.forEach(expected -> {
                        Optional<TransactionMemberPhoneDto> optionalActual =
                                actualMemberPhones.stream()
                                        .filter(actual ->
                                                actual.getPhoneTypeCode()
                                                        .equals(expected.getPhoneTypeCode()))
                                        .findFirst();
                        assertTrue(optionalActual.isPresent());
                        assertMemberPhone(expected, optionalActual.get());
                    });

                }else {
                    assertNull(actualMemberPhones);
                }

            }

        }

    }

    /**
     * Assert the values of the member phone
     * @param expectedMemberPhone
     * @param actualMemberPhone
     */
    private void assertMemberPhone(TransactionMemberPhoneDto expectedMemberPhone,
                                   TransactionMemberPhoneDto actualMemberPhone){
        assertEquals(expectedMemberPhone.getPhoneTypeCode(),
                actualMemberPhone.getPhoneTypeCode());
        assertEquals(expectedMemberPhone.getPhoneNumber(),
                actualMemberPhone.getPhoneNumber());
        assertEquals(expectedMemberPhone.getReceivedDate(),
                actualMemberPhone.getReceivedDate());
    }

    /**
     * Assert Member Addresses
     * @param expectedMemberAddresses
     * @param actualMemberAddresses
     */
    private void assertMemberAddresses(List<TransactionMemberAddressDto> expectedMemberAddresses,
                                    List<TransactionMemberAddressDto> actualMemberAddresses){
        if(expectedMemberAddresses!=null && expectedMemberAddresses.size() > 0){
            assertTrue(actualMemberAddresses.size() > 0);
            expectedMemberAddresses.forEach(expectedAddress -> {
                Optional<TransactionMemberAddressDto> optionalActualAddress =
                        actualMemberAddresses.stream()
                                .filter(actualAddress ->
                                        actualAddress.getAddressTypeCode()
                                                .equals(expectedAddress.getAddressTypeCode()))
                                .findFirst();
                assertTrue(optionalActualAddress.isPresent());
                assertMemberAddress(expectedAddress, optionalActualAddress.get());
            });

        }else {
            assertNull(actualMemberAddresses);
        }

    }

    /**
     * Assert member address
     * @param expectedMemberAddress
     * @param actualMemberAddress
     */
    private void assertMemberAddress(TransactionMemberAddressDto expectedMemberAddress,
                                     TransactionMemberAddressDto actualMemberAddress){
        assertEquals(expectedMemberAddress.getAddressTypeCode(),
                actualMemberAddress.getAddressTypeCode());
        assertEquals(expectedMemberAddress.getAddressLine1(),
                actualMemberAddress.getAddressLine1());
        assertEquals(expectedMemberAddress.getAddressLine2(),
                actualMemberAddress.getAddressLine2());
        assertEquals(expectedMemberAddress.getCity(),
                actualMemberAddress.getCity());
        assertEquals(expectedMemberAddress.getStateTypeCode(),
                actualMemberAddress.getStateTypeCode());
        assertEquals(expectedMemberAddress.getZipCode(),
                actualMemberAddress.getZipCode());
        assertEquals(expectedMemberAddress.getCountyCode(),
                actualMemberAddress.getCountyCode());
        assertEquals(expectedMemberAddress.getReceivedDate(),
                actualMemberAddress.getReceivedDate());

    }

    private void assertMemberIdentifiers(List<TransactionMemberIdentifierDto> expectedMemberIdentifiers,
                                        List<TransactionMemberIdentifierDto> actualMemberIdentifiers){
        {
            if(expectedMemberIdentifiers!=null && expectedMemberIdentifiers.size() > 0){
                assertTrue(actualMemberIdentifiers.size() > 0);
                expectedMemberIdentifiers.forEach(expected -> {
                    Optional<TransactionMemberIdentifierDto> optionalActual =
                            actualMemberIdentifiers.stream()
                                    .filter(actual ->
                                            actual.getIdentifierTypeCode()
                                                    .equals(expected.getIdentifierTypeCode()))
                                    .findFirst();
                    assertTrue(optionalActual.isPresent());
                    assertMemberIdentifier(expected, optionalActual.get());
                });

            }else {
                assertNull(actualMemberIdentifiers);
            }

        }

    }

    /**
     * Assert the value of member identifier
     * @param expectedMemberIdentifier
     * @param actualMemberIdentifier
     */
    private void assertMemberIdentifier(TransactionMemberIdentifierDto expectedMemberIdentifier,
                                        TransactionMemberIdentifierDto actualMemberIdentifier){
        assertEquals(expectedMemberIdentifier.getIdentifierTypeCode(),
                actualMemberIdentifier.getIdentifierTypeCode());
        assertEquals(expectedMemberIdentifier.getIdentifierValue(),
                actualMemberIdentifier.getIdentifierValue());

    }

    /**
     * Assert Member Email
     * @param expectedMemberEmails
     * @param actualMemberEmails
     */
    private void assertMemberEmails(List<TransactionMemberEmailDto> expectedMemberEmails,
                                   List<TransactionMemberEmailDto> actualMemberEmails){
        if(expectedMemberEmails!=null && expectedMemberEmails.size() > 0){
            assertNotNull(actualMemberEmails);
            assertEquals(1, actualMemberEmails.size());
            TransactionMemberEmailDto expectedMemberEmail = expectedMemberEmails.get(0);
            TransactionMemberEmailDto actualMemberEmail = actualMemberEmails.get(0);
            assertEquals(expectedMemberEmail.getEmail(), actualMemberEmail.getEmail());
            assertEquals(expectedMemberEmail.getReceivedDate(), actualMemberEmail.getReceivedDate());

        }else{
            assertNull(actualMemberEmails);
        }

    }

    private void assertMemberLanguages(List<TransactionMemberLanguageDto> expectedMemberLanguages,
                                     List<TransactionMemberLanguageDto> actualMemberLanguages){
        {
            {
                if(expectedMemberLanguages!=null && expectedMemberLanguages.size() > 0){
                    assertTrue(actualMemberLanguages.size() > 0);
                    expectedMemberLanguages.forEach(expected -> {
                        Optional<TransactionMemberLanguageDto> optionalActual =
                                actualMemberLanguages.stream()
                                        .filter(actual ->
                                                actual.getLanguageTypeCode()
                                                        .equals(expected.getLanguageTypeCode()))
                                        .findFirst();
                        assertTrue(optionalActual.isPresent());
                        assertMemberLanguage(expected, optionalActual.get());
                    });

                }else {
                    assertNull(actualMemberLanguages);
                }

            }

        }

    }

    /**
     * Assert Member language
     * @param expectedMemberLanguage
     * @param actualMemberLanguage
     */
    private void assertMemberLanguage(TransactionMemberLanguageDto expectedMemberLanguage,
                                      TransactionMemberLanguageDto actualMemberLanguage){
        assertEquals(expectedMemberLanguage.getLanguageTypeCode(),
                actualMemberLanguage.getLanguageTypeCode());
        assertEquals(expectedMemberLanguage.getLanguageCode(),
                actualMemberLanguage.getLanguageCode());
        assertEquals(expectedMemberLanguage.getReceivedDate(),
                actualMemberLanguage.getReceivedDate());

    }

    /**
     * Assert details of alternate contacts
     * @param expectedMemberAlternateContacts
     * @param actualMemberAlternateContacts
     */
    private void assertMemberAlternateContacts(List<TransactionAlternateContactDto> expectedMemberAlternateContacts,
                                              List<TransactionAlternateContactDto> actualMemberAlternateContacts){
        {
            {
                {
                    if(expectedMemberAlternateContacts!=null && expectedMemberAlternateContacts.size() > 0){
                        assertTrue(actualMemberAlternateContacts.size() > 0);
                        expectedMemberAlternateContacts.forEach(expected -> {
                            Optional<TransactionAlternateContactDto> optionalActual =
                                    actualMemberAlternateContacts.stream()
                                            .filter(actual ->
                                                    actual.getAlternateContactTypeCode()
                                                            .equals(expected.getAlternateContactTypeCode()))
                                            .findFirst();
                            assertTrue(optionalActual.isPresent());
                            assertMemberAlternateContact(expected, optionalActual.get());
                        });

                    }else {
                        assertNull(actualMemberAlternateContacts);
                    }

                }

            }

        }
    }

    /**
     * Assert the values of alternate contact
     * @param expectedMemberAlternateContact
     * @param actualMemberAlternateContact
     */
    private void assertMemberAlternateContact(TransactionAlternateContactDto expectedMemberAlternateContact,
                                              TransactionAlternateContactDto actualMemberAlternateContact){
        assertEquals(expectedMemberAlternateContact.getAlternateContactTypeCode(),
                actualMemberAlternateContact.getAlternateContactTypeCode());
        assertEquals(expectedMemberAlternateContact.getFirstName(),
                actualMemberAlternateContact.getFirstName());
        assertEquals(expectedMemberAlternateContact.getMiddleName(),
                actualMemberAlternateContact.getMiddleName());
        assertEquals(expectedMemberAlternateContact.getLastName(),
                actualMemberAlternateContact.getLastName());
        assertEquals(expectedMemberAlternateContact.getIdentifierTypeCode(),
                actualMemberAlternateContact.getIdentifierTypeCode());
        assertEquals(expectedMemberAlternateContact.getIdentifierValue(),
                actualMemberAlternateContact.getIdentifierValue());
        assertEquals(expectedMemberAlternateContact.getPhoneTypeCode(),
                actualMemberAlternateContact.getPhoneTypeCode());
        assertEquals(expectedMemberAlternateContact.getPhoneNumber(),
                actualMemberAlternateContact.getPhoneNumber());
        assertEquals(expectedMemberAlternateContact.getEmail(),
                actualMemberAlternateContact.getEmail());
        assertEquals(expectedMemberAlternateContact.getAddressLine1(),
                actualMemberAlternateContact.getAddressLine1());
        assertEquals(expectedMemberAlternateContact.getAddressLine2(),
                actualMemberAlternateContact.getAddressLine2());
        assertEquals(expectedMemberAlternateContact.getCity(),
                actualMemberAlternateContact.getCity());
        assertEquals(expectedMemberAlternateContact.getStateTypeCode(),
                actualMemberAlternateContact.getStateTypeCode());
        assertEquals(expectedMemberAlternateContact.getZipCode(),
                actualMemberAlternateContact.getZipCode());
        assertEquals(expectedMemberAlternateContact.getReceivedDate(),
                actualMemberAlternateContact.getReceivedDate());

    }

    /**
     * Get the exchange member id of the member
     * @param transactionMemberDto
     * @return
     */
    private String getExchangeMemberId(TransactionMemberDto transactionMemberDto){
        Optional<TransactionMemberIdentifierDto> exchangeMemberId =
                transactionMemberDto.getIdentifiers().stream().filter(
                        identifier -> identifier.getIdentifierTypeCode().equals("EXCHMEMID")).findFirst();
        return exchangeMemberId.map(TransactionMemberIdentifierDto::getIdentifierValue).orElse(null);
    }

    /**
     * Assert the rules that were executed for the transaction
     * @param expectedTransactionRules
     * @param actualTransactionRules
     */
    private void assertTransactionRules(List<TransactionRuleDto> expectedTransactionRules,
                                        List<TransactionRuleDto> actualTransactionRules){
        if(expectedTransactionRules != null && !expectedTransactionRules.isEmpty()){
            assertNotNull(actualTransactionRules);
            assertEquals(expectedTransactionRules.size(),
                    actualTransactionRules.size());
            // Todo validate transaction level rules
            List<TransactionRuleDto> transactionLevelRules = expectedTransactionRules.stream()
                    .filter(transactionRuleDto ->
                            transactionRuleDto.getTransactionMemberCode() == null)
                    .toList();
            transactionLevelRules.forEach(expectedTransactionRule -> {
                Optional<TransactionRuleDto> optionalActualTransactionRule = actualTransactionRules.stream()
                        .filter(transactionRule ->
                                transactionRule.getRuleId().equals(expectedTransactionRule.getRuleId()))
                        .findFirst();
                assertTrue(optionalActualTransactionRule.isPresent());
                TransactionRuleDto actualTransactionRule = optionalActualTransactionRule.get();
                assertEquals(expectedTransactionRule.getRuleName(), actualTransactionRule.getRuleName());
                assertEquals(expectedTransactionRule.isRulePassed(), actualTransactionRule.isRulePassed());
                assertNull(actualTransactionRule.getTransactionMemberCode());
                assertTransactionRuleMessages(expectedTransactionRule.getTransactionRuleMessages(),
                        actualTransactionRule.getTransactionRuleMessages());
            });
            // Identify all member level rules that have member code and exchange member id present
            List<TransactionRuleDto> memberLevelRules = expectedTransactionRules.stream()
                    .filter(transactionRuleDto ->
                            transactionRuleDto.getTransactionMemberCode() != null &&
                            transactionRuleDto.getExchangeMemberId() != null)
                    .toList();
            // Identify all expected member level rules that have member code but does not have exchange member id
            List<TransactionRuleDto> expectedExchangeMemIdMissingRules = expectedTransactionRules.stream()
                    .filter(transactionRuleDto ->
                            transactionRuleDto.getTransactionMemberCode() != null &&
                                    transactionRuleDto.getExchangeMemberId() == null)
                    .toList();
            // Identify all actual member level rules that have member code but does not have exchange member id
            List<TransactionRuleDto> actualExchangeMemIdMissingRules = actualTransactionRules.stream()
                    .filter(transactionRuleDto ->
                            transactionRuleDto.getTransactionMemberCode() != null &&
                                    transactionRuleDto.getExchangeMemberId() == null)
                    .toList();
            // Validate all member level rules for which the exchange member id is not present
            if(!expectedExchangeMemIdMissingRules.isEmpty()){
                assertNotNull(actualExchangeMemIdMissingRules);
                assertEquals(expectedExchangeMemIdMissingRules.size(), actualExchangeMemIdMissingRules.size());
            }
            // Validate all member level rules for members in the transaction that have exchange member id present
            memberLevelRules.forEach(expectedMemberLevelRule -> {
                log.info("Expected Member level rule:{}", expectedMemberLevelRule);
                log.info("Actual Transaction Rules:{}", actualTransactionRules);
                Optional<TransactionRuleDto> optionalActualMemberLevelRule = actualTransactionRules.stream()
                        .filter(transactionRule ->
                                transactionRule.getRuleId().equals(expectedMemberLevelRule.getRuleId()) &&
                                        transactionRule.getExchangeMemberId().equals(expectedMemberLevelRule.getExchangeMemberId()))
                        .findFirst();
                assertTrue(optionalActualMemberLevelRule.isPresent());
                TransactionRuleDto actualMemberLevelRule = optionalActualMemberLevelRule.get();
                assertEquals(expectedMemberLevelRule.getRuleName(), actualMemberLevelRule.getRuleName());
                assertEquals(expectedMemberLevelRule.isRulePassed(), actualMemberLevelRule.isRulePassed());
                assertEquals(expectedMemberLevelRule.getExchangeMemberId(), actualMemberLevelRule.getExchangeMemberId());
                assertTransactionRuleMessages(expectedMemberLevelRule.getTransactionRuleMessages(),
                        actualMemberLevelRule.getTransactionRuleMessages());
            });
        }
    }

    /**
     * Assert rule messages present for each rule
     * @param expectedRuleMessages
     * @param actualRuleMessages
     */
    private void assertTransactionRuleMessages(List<TransactionRuleMessageDto> expectedRuleMessages,
                                               List<TransactionRuleMessageDto> actualRuleMessages){
        if(expectedRuleMessages == null || expectedRuleMessages.isEmpty()){
            assertNull(actualRuleMessages);
        }else{
            assertNotNull(actualRuleMessages);
            assertFalse(actualRuleMessages.isEmpty());
            expectedRuleMessages.forEach(expectedRuleMessage -> {
                Optional<TransactionRuleMessageDto> optionalActualRuleMessage =
                        actualRuleMessages
                                .stream()
                                .filter(ruleMessage ->
                                        ruleMessage.getMessageCode().equals(expectedRuleMessage.getMessageCode()))
                                .findFirst();
                assertTrue(optionalActualRuleMessage.isPresent());
                TransactionRuleMessageDto actualRuleMessage = optionalActualRuleMessage.get();
                assertEquals(expectedRuleMessage.getMessageCode(), actualRuleMessage.getMessageCode());
                assertEquals(expectedRuleMessage.getMessageTypeCode(), actualRuleMessage.getMessageTypeCode());
                assertEquals(expectedRuleMessage.getMessageDesc(), actualRuleMessage.getMessageDesc());
            });
        }
    }
}
