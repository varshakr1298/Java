package networking;

//Java Networking is a concept of connecting two or more computing devices together so that we can share resources.
//Java socket programming provides facility to share data between different computing devices.

//Advantage of Java Networking 1)sharing resources 2)centralize software management

//What all we can do with networking
//To perform connection-oriented Socket Programming in networking 
//To display the data of any online web page ?
//To get the IP address of any host name e.g. www.google.com ?
//To perform connection-less socket programming in networking ?

//Networking Terms
//1) IP ADDRESS: IP address is a unique number assigned to a node of a network e.g. 192.168.0.1 . It is composed of octets that range from 0 to 255.
//It is a logical address that can be changed.

//2) Protocol: A protocol is a set of rules basically that is followed for communication. For example:
//TCP
//FTP
//Telnet
//SMTP
//POP etc.

//3) Post Number: The port number is used to uniquely identify different applications. It acts as a communication endpoint between applications.
//The port number is associated with the IP address for communication between two applications.

//4) MAC Address: MAC (Media Access Control) Address is a unique identifier of NIC (Network Interface Controller). A network node can have multiple NIC but each with unique MAC.

//5)Connection-oriented and connection-less protocol
//In connection-oriented protocol, acknowledgement is sent by the receiver. So it is reliable but slow. The example of connection-oriented protocol is TCP.
//Example is an conversion over phone call where the reciever acknowledges
//But, in connection-less protocol, acknowledgement is not sent by the receiver. So it is not reliable but fast. The example of connection-less protocol is UDP.
//Example is Whatsapp message, we don't know whether the reciever has recieved the message or not

//6) Socket: A socket is an endpoint between two way communication.

//CONNECTION ORIENTED SOCKET PROGRAMMING: We use Socket and ServerSocket classes
//CONNECTION-LESS SOCKET PROGRAMMING: We use DatagramSocket and DatagramPacket classes