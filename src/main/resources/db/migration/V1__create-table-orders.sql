CREATE TABLE Orders (
    OrderID VARCHAR(255) PRIMARY KEY,
    CurrencyCode VARCHAR(10),
    MerchandiseTotal DECIMAL(10, 2),
    AdditionalFeesTotal DECIMAL(10, 2),
    OrderTotal DECIMAL(10, 2),
    OrderType VARCHAR(50),
    CartGUID VARCHAR(255),
    TaxAmount DECIMAL(10, 2),
    TaxCertificateId VARCHAR(255),
    IECCode VARCHAR(255),
    LanguageCode VARCHAR(10),
    SubmitOrder BOOLEAN NOT NULL
);
