CREATE TABLE OrderLines (
    OrderLineID INT AUTO_INCREMENT PRIMARY KEY,
    OrderID VARCHAR(255) NOT NULL,
    MouserPartNumber VARCHAR(255),
    MfrPartNumber VARCHAR(255),
    Description VARCHAR(500),
    Quantity INT,
    UnitPrice DECIMAL(10, 2),
    ExtendedPrice DECIMAL(10, 2),
    LifeCycle VARCHAR(100),
    Manufacturer VARCHAR(255),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID) ON DELETE CASCADE
);
