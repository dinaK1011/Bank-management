# Bank management software system (Java OOP)

An object-oriented Java application modeling a banking system with hierarchical bank structures, polymorphic customer validation, and financial tracking.

## What's in the project?
- **BankIsrael (Abstract Superclass):** Manages shared bank data (employees, revenue, expenses, and customer list) along with core methods like payment processing and calculations.
- **BankDiscont:** A subclass representing Bank Discont with custom overrides (such as allowing company customers and a custom revenue calculation).
- **Customer Management:** Separation between regular customers (`Customer`) and company clients (`CompanyCustomer`) under a shared interface (`CustomerBank`).
- **Validation:** Automatic checks to see if a specific bank is allowed to accept companies (`acceptsCompanies` and `validateCustomers`).
- **Financial Reports:** Calculating and printing the bank's financial summary status (`printBankCalculationMoney`).


## Example Usage

```java
// Creating a company customer assigned to Bank Leomi.
CustomerBank HBO = new CompanyCustomer(320, "HBO", "Bank Leomi", 10000);

// Validating whether the bank can accept this type of customer.
// (Will trigger a validation error if the bank does not support company customers)
```
