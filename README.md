# business-rule-engine
This business rule engine is implemented using Factory design pattern and SOLID principles; wherein for each product we have a separate rule engine.

The business rule engine factory will return the product rule engine dynamically based on the product type.

The implementation is open for extension as the Strategy pattern is being used to pass the product-rule-engine dynamically based on the product type.
