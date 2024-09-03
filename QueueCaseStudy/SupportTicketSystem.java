package com.evergent.corejava.ganesh.casestudyqueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class SupportTicketSystem
{
    private Deque<String> ticketQueue;
    // Constructor
    public SupportTicketSystem()
    {
        ticketQueue = new ArrayDeque<>();
    }
    public static void main(String[] args)
    {
        SupportTicketSystem system = new SupportTicketSystem();
        
        // Adding tickets
        system.addTicket("Ticket 1: Issue with login");
        system.addTicket("Ticket 2: Password reset needed");
        system.addTicket("Ticket 3: Error during checkout");

        // Displaying all tickets
        system.displayQueue();
        
        // Processing tickets
        system.processNextTicket();
        system.peekNextTicket();

        // Display remaining tickets
        system.displayQueue();
        
        // Processing remaining tickets
        system.processNextTicket();
        system.processNextTicket();
        system.processNextTicket();  // Handling empty queue gracefully
    }

    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
    }

    // Method to process the next ticket
    public void processNextTicket() {
        String ticket = ticketQueue.poll();
        if (ticket != null) {
            System.out.println("Processed: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Method to peek at the next ticket without removing it
    public void peekNextTicket() {
        String ticket = ticketQueue.peek();
        if (ticket != null) {
            System.out.println("Next ticket: " + ticket);
        } else {
            System.out.println("No tickets in the queue.");
        }
    }

    // Method to display all tickets currently in the queue
    public void displayQueue() {
        System.out.println("Current queue: " + ticketQueue);
    }
}