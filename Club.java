/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Club
{
    // Define any necessary fields here ...
    public ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    { members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    } 

    public int joinedInMonth(int month){
        if (month<=0 || month>12){
            System.out.println("Invalid month: " + month);
            return 0;
        } else {
            int count = 0;
            for (Membership m : members){
                if (m.getMonth()==month){
                    count++;
                        
                }
            
            }
            return count;
        }
    
    }
    

public ArrayList<Membership> purge (int month, int year){
 if (month<=0 || month>12){   
    System.out.println("Invalid month: " + month);
    return null; 
} else if (year<=1900 || year>2026) { 
    System.out.println("Invalid year: " + year);
    return null;
} else {
    ArrayList<Membership> removals = new ArrayList();
    
    Iterator<Membership> it = members.iterator();
    while (it.hasNext()){
        Membership m = it.next();
        if (m.getMonth()==month && m.getYear()==year){
            System.out.println("Membership found in " + month + "/" + year);
            removals.add(m);
            it.remove();
        }
        }
    return removals;
    }
}
}