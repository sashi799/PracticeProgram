package sas.java.practice.ds;

public interface IQueue <Item> extends Iterable<Item>
{
  Item delete(); // removes an item from the front of the queue
  void insert(Item item); // adds an item to the rear end of the queue
  boolean isEmpty(); // returns true if queue is empty, false otherwise
  int size();  // returns the number of items in the queue right now
}
