CREATE TABLE Addresses (
    AddressID INT AUTO_INCREMENT PRIMARY KEY,
    AddressType VARCHAR(50), -- Billing, Shipping, etc.
    CountryCode VARCHAR(10),
    FirstName VARCHAR(100),
    LastName VARCHAR(100),
    Company VARCHAR(255),
    AddressOne VARCHAR(255),
    AddressTwo VARCHAR(255),
    City VARCHAR(100),
    StateOrProvince VARCHAR(100),
    PostalCode VARCHAR(20),
    PhoneNumber VARCHAR(50),
    EmailAddress VARCHAR(255),
    OrderID VARCHAR(255),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID) ON DELETE CASCADE
);
