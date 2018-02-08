package ali;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {


    private Integer id;
    private List<BuddyInfo> buddies;


    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }
    @Id
    public Integer getId() {
        return this.id;
    }
    public void setId(int i){
        id=i;
    }
    @OneToMany(cascade = CascadeType.ALL)
    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public boolean Equals(AddressBook a){
        boolean t;
        t=a.getBuddies().size()==this.getBuddies().size();
        for(int i=0;i<buddies.size();i++){
            t&=buddies.get(i).equals(a.getBuddies().get(i));
        }
        return t;
    }








    public void addBuddy(BuddyInfo b){

        buddies.add(b);
    }
    public void remove(BuddyInfo b){
        buddies.remove(b);
    }










}
