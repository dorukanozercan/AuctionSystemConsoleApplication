# Auction System Console Application

Data Structures and Algorithms Project 

# AIM
Auction System is the controlling and observing panel for auction's coordinator and purpose is selling and tracking items in a faster and accurate way.  Auction System tracks participants that attends auction, stores the addresses and their bid information for the given item.

# MODULES AND EXPLANATIONS
This project is a console application and developed using Java. Data Structures used in this project are linked list, queue and heap. 
Linked List stores bidder’s personal information such as name, address and bid value. Queue is to queing items that are going to be sold and heap is used for taking the maximum bid.
Users will bid numbers to buy the item and numbers will be inserted into the heap. Greatest bid will taken as the root of the maximum heap. The item user bought will be added to linked list's node, next to the user's personal information so that auction's coordinator can check the sold items and buyers of the specific item. Within the information of address and the item, coordinator can send items to customers at the end of auction.

Program first asks the number of participants and their names. Names are stored in linked list.
Program’s main structure built on a switch structure so coordinator types the actions. Coordinator can access 6 different commands from the control panel. additem queues the items that going to be sold, address takes the address and inserts it next to the name of the participant in linked list, bid takes the bid value and inserts into linked list next to address and name. Bid value also used for creating the max heap, end is for ending the auction for that specific item, nextitem deques current item and shows next item that going to be sold and exit quits from the program.

# Dorukan Özercan
