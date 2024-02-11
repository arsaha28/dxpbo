package com.dxp.bo.application.batch.directdebit.processor;

import com.dxp.bo.application.batch.directdebit.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class SepaDirectDebitXmlGenerator {

    public static void main(String[] args) {
        SepaDirectDebitBatch sepaDirectDebitBatch = createSampleSepaDirectDebitBatch();
        String xml = convertObjectToXml(sepaDirectDebitBatch);
        System.out.println(xml);
    }

    private static SepaDirectDebitBatch createSampleSepaDirectDebitBatch() {
        SepaDirectDebitBatch sepaDirectDebitBatch = new SepaDirectDebitBatch();

        // Create Group Header
        GroupHeader groupHeader = new GroupHeader();
        groupHeader.setMessageId("YOUR_MESSAGE_ID");
        groupHeader.setCreationDateTime("2024-02-09T12:00:00");
        groupHeader.setNumberOfTransactions(2);
        groupHeader.setControlSum("200.00");
        InitiatingParty initiatingParty = new InitiatingParty();
        initiatingParty.setName("YOUR_COMPANY_NAME");
        groupHeader.setInitiatingParty(initiatingParty);

        // Create Payment Information
        PaymentInformation paymentInformation = new PaymentInformation();
        paymentInformation.setPaymentInformationId("YOUR_PAYMENT_INFORMATION_ID");
        paymentInformation.setPaymentMethod("DD");
        paymentInformation.setBatchBooking(false);
        paymentInformation.setNumberOfTransactions(2);
        paymentInformation.setControlSum("200.00");

        PaymentTypeInformation paymentTypeInformation = new PaymentTypeInformation();
        ServiceLevel serviceLevel = new ServiceLevel();
        serviceLevel.setCode("SEPA");
        paymentTypeInformation.setServiceLevel(serviceLevel);
        LocalInstrument localInstrument = new LocalInstrument();
        localInstrument.setCode("CORE");
        paymentTypeInformation.setLocalInstrument(localInstrument);
        paymentTypeInformation.setSequenceType("RCUR");

        paymentInformation.setPaymentTypeInformation(paymentTypeInformation);
        paymentInformation.setRequiredCollectionDate("2024-02-15");

        Creditor creditor = new Creditor();
        creditor.setName("YOUR_COMPANY_NAME");
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.setCountry("YOUR_COUNTRY");
        postalAddress.setAddressLine("YOUR_ADDRESS");
        creditor.setPostalAddress(postalAddress);
        paymentInformation.setCreditor(creditor);

        CreditorAccount creditorAccount = new CreditorAccount();
        Identification creditorId = new Identification();
        creditorId.setIban("YOUR_COMPANY_IBAN");
        creditorAccount.setIdentification(creditorId);
        paymentInformation.setCreditorAccount(creditorAccount);

        CreditorAgent creditorAgent = new CreditorAgent();
        FinancialInstitutionIdentification financialInstitutionIdentification = new FinancialInstitutionIdentification();
        financialInstitutionIdentification.setBic("YOUR_BANK_BIC");
        creditorAgent.setFinancialInstitutionIdentification(financialInstitutionIdentification);
        paymentInformation.setCreditorAgent(creditorAgent);

        paymentInformation.setChargeBearer("SLEV");

        CreditorSchemeIdentification creditorSchemeIdentification = new CreditorSchemeIdentification();
        creditorSchemeIdentification.setIdentification(creditorId);
        paymentInformation.setCreditorSchemeIdentification(creditorSchemeIdentification);

        List<DirectDebitTransactionInformation> transactionInformationList = new ArrayList<>();

        // Create first Direct Debit Transaction Information
        DirectDebitTransactionInformation transactionInfo1 = new DirectDebitTransactionInformation();
        PaymentId paymentId1 = new PaymentId();
        paymentId1.setEndToEndId("YOUR_TRANSACTION_ID_1");
        transactionInfo1.setPaymentId(paymentId1);
        InstructedAmount instructedAmount1 = new InstructedAmount();
        instructedAmount1.setCurrency("EUR");
        instructedAmount1.setValue("100.00");
        transactionInfo1.setInstructedAmount(instructedAmount1);

        DirectDebitTransaction directDebitTransaction1 = new DirectDebitTransaction();
        MandateRelatedInformation mandateRelatedInformation1 = new MandateRelatedInformation();
        mandateRelatedInformation1.setMandateId("YOUR_MANDATE_ID_1");
        mandateRelatedInformation1.setDateOfSignature("2023-01-01");
        directDebitTransaction1.setMandateRelatedInformation(mandateRelatedInformation1);
        transactionInfo1.setDirectDebitTransaction(directDebitTransaction1);

        DebtorAgent debtorAgent1 = new DebtorAgent();
        debtorAgent1.setFinancialInstitutionIdentification(financialInstitutionIdentification);
        transactionInfo1.setDebtorAgent(debtorAgent1);

        Debtor debtor1 = new Debtor();
        debtor1.setName("DEBTOR_NAME_1");
        transactionInfo1.setDebtor(debtor1);

        DebtorAccount debtorAccount1 = new DebtorAccount();
        debtorAccount1.getIdentification().setIban("DEBTOR_IBAN_1");
        //debtorAccount1.setIdentification(debtorId);
        transactionInfo1.setDebtorAccount(debtorAccount1);

        RemittanceInformation remittanceInformation1 = new RemittanceInformation();
        remittanceInformation1.setUnstructured("Invoice Payment 1");
        transactionInfo1.setRemittanceInformation(remittanceInformation1);

        transactionInformationList.add(transactionInfo1);

        // Create second Direct Debit Transaction Information
        DirectDebitTransactionInformation transactionInfo2 = new DirectDebitTransactionInformation();
        PaymentId paymentId2 = new PaymentId();
        paymentId2.setEndToEndId("YOUR_TRANSACTION_ID_2");
        transactionInfo2.setPaymentId(paymentId2);
        InstructedAmount instructedAmount2 = new InstructedAmount();
        instructedAmount2.setCurrency("EUR");
        instructedAmount2.setValue("100.00");
        transactionInfo2.setInstructedAmount(instructedAmount2);

        DirectDebitTransaction directDebitTransaction2 = new DirectDebitTransaction();
        MandateRelatedInformation mandateRelatedInformation2 = new MandateRelatedInformation();
        mandateRelatedInformation2.setMandateId("YOUR_MANDATE_ID_2");
        mandateRelatedInformation2.setDateOfSignature("2023-01-01");
        directDebitTransaction2.setMandateRelatedInformation(mandateRelatedInformation2);
        transactionInfo2.setDirectDebitTransaction(directDebitTransaction2);

        DebtorAgent debtorAgent2 = new DebtorAgent();
        debtorAgent2.setFinancialInstitutionIdentification(financialInstitutionIdentification);
        transactionInfo2.setDebtorAgent(debtorAgent2);

        Debtor debtor2 = new Debtor();
        debtor2.setName("DEBTOR_NAME_2");
        transactionInfo2.setDebtor(debtor2);

        DebtorAccount debtorAccount2 = new DebtorAccount();
        debtorAccount2.getIdentification().setIban("DEBTOR_IBAN_2");
        transactionInfo2.setDebtorAccount(debtorAccount2);

        RemittanceInformation remittanceInformation2 = new RemittanceInformation();
        remittanceInformation2.setUnstructured("Invoice Payment 2");
        transactionInfo2.setRemittanceInformation(remittanceInformation2);

        transactionInformationList.add(transactionInfo2);

        paymentInformation.setDirectDebitTransactionInformationList(transactionInformationList);

        sepaDirectDebitBatch.setCustomerDirectDebitInitiation(new CustomerDirectDebitInitiation());
        sepaDirectDebitBatch.getCustomerDirectDebitInitiation().setGroupHeader(groupHeader);
        sepaDirectDebitBatch.getCustomerDirectDebitInitiation().setPaymentInformation(paymentInformation);

        return sepaDirectDebitBatch;
    }

    private static String convertObjectToXml(SepaDirectDebitBatch sepaDirectDebitBatch) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(sepaDirectDebitBatch.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            JAXBElement<SepaDirectDebitBatch> jaxbElement =
                    new JAXBElement<SepaDirectDebitBatch>( new QName("", "Document"),
                            SepaDirectDebitBatch.class,
                            sepaDirectDebitBatch);

            marshaller.marshal(jaxbElement, sw);
            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
