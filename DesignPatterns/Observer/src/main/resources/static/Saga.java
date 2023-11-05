/*
SAGA Design pattern (Microservice Pattern)

The SAGA design pattern is a way to handle long-lived transactions that 
involve multiple microservices. A SAGA is a sequence of local transactions 
that are coordinated to achieve a larger business goal. If any of the local 
transactions fail, the SAGA ensures that compensating transactions are 
executed to revert the changes made by the previous transactions.

The SAGA design pattern in Microservices consists of three main components:

A saga coordinator is responsible for coordinating the execution of local 
transactions and compensating transactions. Local transactions are the 
individual microservices that perform their part of the larger business goal.
Compensating transactions, which are executed by the local transactions to 
revert any changes made if a previous local transaction fails.
Here is an example of how the SAGA design pattern could be implemented in a 
distributed system:

A client sends a request to the saga coordinator to book a hotel room and a 
flight for a vacation. The saga coordinator sends a request to the hotel 
microservice to book a room. The hotel microservice books the room and sends 
a confirmation to the saga coordinator. The saga coordinator sends a request 
to the flight microservice to book a flight. The flight microservice books the 
flight and sends a confirmation to the saga coordinator. The saga coordinator 
sends a confirmation to the client that the hotel room and flight have been 
booked. If any of the local transactions fail, the saga coordinator executes 
the compensating transactions to revert the changes made by the previous 
transactions. The SAGA design pattern is useful for ensuring that long-lived 
transactions are executed correctly in a distributed system. It ensures that 
the system remains consistent even if individual microservices fail, by using 
compensating transactions to revert any changes made by the failed transactions. 
However, it can be complex to implement and maintain, as it requires careful 
coordination of the local transactions and compensating transactions.
 */