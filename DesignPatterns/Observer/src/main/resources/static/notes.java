/*
 * The observer design pattern is a behavioral design pattern that allows an 
 * object (known as the subject) to notify a set of objects (known as observers)
 * when its state changes. The observers are dependent on the subject and are 
 * notified whenever the subject’s state changes so that they can update 
 * themselves accordingly.
 * To implement the observer pattern in Java, you will need to:
 * 1. Define a subject interface that contains methods for attaching and 
 *    detaching observers, as well as a method for notifying observers of 
 *    state changes.
 * 2. Define an observer interface that contains a method for updating the 
 *    observer based on the subject’s state.
 * 3. Define a concrete subject class that implements the subject interface and 
 *    stores a list of observers. It should have methods for attaching and 
 *    detaching observers, as well as a method for notifying observers of state 
 *    changes.
 * 4. Define concrete observer classes that implement the observer interface and 
 *    define the behavior that should be performed when the observer is notified 
 *    of a state change.
 * 5. When the subject’s state changes, it should notify all of its observers by 
 *    calling the update method on each observer.
 *  
 * 
 * 
 * To use the observer pattern, you would create an instance of the StockPrice 
 * subject and attach StockBuyer observers to it. When the price of the stock 
 * changes, the StockPrice the subject would notify the StockBuyer observers, 
 * which would then update themselves based on the new price.
 */