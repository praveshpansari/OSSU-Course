package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyProfile {

    private String name;
    private int age;
    private String currentLocation;
    private String workPlace;
    private List<MyProfile> friendsList;
    private List<Event> upcomingEvents;

    public MyProfile(String nm, int age, String locn, String work) {
        this.name = nm;
        this.age = age;
        this.currentLocation = locn;
        this.workPlace = work;
        this.friendsList = new ArrayList<>();
        this.upcomingEvents = new LinkedList<>();
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public String getWorkPlace() {
        return workPlace;

    }

    public int upcomingEventNum() {
        return upcomingEvents.size();

    }

    public List<MyProfile> getFriendsList() {
        return friendsList;
    }

    public List<Event> getEventList() {
        return upcomingEvents;
    }

    // REQUIRES: f is not already in friendsList
    // MODIFIES: this
    // EFFECTS: consumes a MyProfile object, a friend f, and adds it to the friendsList
    public void addFriend(MyProfile f) {
        if (!this.friendsList.contains(f)) {
            this.friendsList.add(f);
        }
    }

    // MODIFIES: this
    // EFFECTS: removes a friend with the given name from this. If removal is successful, return true, else
    //          return false
    public boolean unFriend(String nm) {
        for (MyProfile friend : friendsList) {
            if (friend.getName().equalsIgnoreCase(nm)) {
                friendsList.remove(friend);
                return true;
            }
        }
        return false;
    }

    // REQUIRES: ev is not in upcomingEvents
    // MODIFIES: this
    // EFFECTS: adds the given event to the list of upcoming events
    public void addEvent(Event ev) {
        if (!upcomingEvents.contains(ev))
            upcomingEvents.add(ev);
    }

    // MODIFIES: this
    // EFFECTS: removes an event with the given name. If removal is successful, return true, else return false
    public boolean removeEvent(String nm) {
        for (Event event : upcomingEvents) {
            if (event.getName().equalsIgnoreCase(nm)) {
                upcomingEvents.remove(event);
                return true;
            }
        }
        return false;
    }

    // EFFECTS: returns the number of events that are at the current location of this person
    public int eventNumNearMe() {
        int numEvents = 0;
        for (Event event : upcomingEvents) {
            if (event.getLocation().equals(currentLocation))
                numEvents++;
        }
        return numEvents;
    }

    // EFFECTS: returns the number of events of the given type et
    public int specificEventType(EventType et) {
        int numEvents = 0;
        for (Event event : upcomingEvents) {
            if (event.getEventType() == et)
                numEvents++;
        }
        return numEvents;
    }

    // EFFECTS: prints events of  type et to the console
    //          Hint: is there a method you have already written that you can use?
    public void printEventSchedule(EventType et) {
        System.out.println("\nThe " + et + " events are:");
        for (Event event : upcomingEvents)
            if (event.getEventType() == et)
                System.out.println(event.getName() + " @ " + event.getLocation());

    }

    // EFFECTS: prints out the list of friends that this MyProfile has
    public void printFriendNames() {
        System.out.println("\nFriends of " + getName() + ":");
        for (MyProfile friend : friendsList)
            System.out.println(friend.getName());
    }

    // EFFECTS: prints out the names of friends who live at the same location associated with this profile
    public void printFriendsNearMe() {
        System.out.println("\nFriends near you: ");
        for (MyProfile friend : friendsList)
            if (friend.getCurrentLocation().equals(currentLocation))
                System.out.println(friend.getName());
    }

    // EFFECTS: produces true if this profile has a friend with the given name,
    //          OR if any of this profile's friends has a friend with the given name
    //          Hint: use recursion!
    public boolean canFindPerson(String name) {
        if (this.friendsList.isEmpty()) return false;
        for (MyProfile friend : friendsList) {
            if (friend.getName().equals(name)) {
                return true;
            }
        }

        for (MyProfile friend : friendsList) {
            if (friend.canFindPerson(name))
                return true;
        }

        return false;
    }


}
