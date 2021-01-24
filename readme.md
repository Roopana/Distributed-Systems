# Distributed-Systems

A distributed system in its most simplest definition is a group of computers working together as to appear as a single computer to the end-user.

These machines have a shared state, operate concurrently and can fail independently without affecting the whole system’s uptime. [Ref](https://www.freecodecamp.org/news/a-thorough-introduction-to-distributed-systems-3b91562c9b3c/)

In this repository I have shared three examples of distributed systems.

## 1. Pub Sub System
A simple publish subscribe system (PubSub) using two forms of communication: basic messaging using __UDP__ and an __RPC__(Remote Procedure Call) system using Java RMI. The PubSub system will allow the publishing of simple formatted “articles”. This project teaches about distributed computing and communication protocols. It is assumed that UDP communication is reliable.

## 2. Bulletin Board
A simple Bulletin Board (BB) system (like UMN Canvas discussion forum) in which clients can __post, reply,__ and __read__ articles stored in the BB. The BB is maintained by a group of replicated servers that offer __sequential consistency, quorum consistency,__ and __read-your-Write consistency__. Unlike the PubSub system, the server(s) will store and remember all articles. __UDP and TCP__ protocols are used to establish communication between coordinator, replicated servers and clients. The project focusses on how to implement various forms of consistency and their tradeoffs. The desired consistency mechanism is supplied as a parameter at runtime.

## 3. File Sharing System
A simple __“serverless”__ file system based on the classic xFS paper [1] in which peer nodes can share their files directly with other peers. Using this system, a user can store files in their local storage (a specific directory, e.g. ~you/5105/share/machID) to share with other users. The machID is a unique name that refers to a unique peer. At any point in time, a file may be stored at a number of peers. When a node wishes to download a file, it learns about the possible locations of the file (from the server) and makes a decision based on the latency and load (to be described). This system will also support basic __fault tolerance__: any nodes or the server can go down and then recover. __UDP, TCP__ communication protocols are used to cummincate between peer nodes and clients. This project focusses on how to implement a simple xFS with failure handling.
