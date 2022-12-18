# Class-Diagram

[Help Mermaid](https://mermaid-js.github.io/mermaid/syntax/classDiagram.html)

Note to myself UML:

public (+)

protected (#)

private (-)

```mermaid
classDiagram
    Customer <|-- Adresse

    class Adresse{
        -String strasseNr
        -String strassename
        -String ort
        -String plz
        -String land
        +Adresse()
        +void setStrassename()
        +String getStrassename()
        +String getort()
        +void setOrt()
        +String getPlz()
        +void setPLZ()
        +String getLand()
        +void setLand()
    }

    class CLI {

    }

    class Customer{

    }

    class CustomerManager{

    }

    class Functions{

    }

    class GUI{

    }

    class Log{

    }

    class Main{

    }

    class Startup{

    }
```