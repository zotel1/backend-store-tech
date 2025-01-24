CREATE TABLE Errors (
    ErrorID INT AUTO_INCREMENT PRIMARY KEY,
    ContextType VARCHAR(50), -- Indica si es de Order, OrderLine, etc.
    ContextID INT,           -- ID del contexto (puede ser OrderID, OrderLineID, etc.)
    Code VARCHAR(50),
    Message TEXT,
    ResourceKey VARCHAR(100),
    PropertyName VARCHAR(100)
);
