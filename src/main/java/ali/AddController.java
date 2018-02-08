package ali;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddressBook")
public class AddController {

    @Autowired
    AddressBookRepository ar ;

    @GetMapping()
    public AddressBook createAddress(@RequestParam("id") int id) {

        AddressBook add =new AddressBook();
        add.setId(id);
        ar.save(add);

        return add;
    }
    @GetMapping(value="/addtoAddress")
    public AddressBook addBuddy(@RequestParam("addId") Integer Id,@RequestParam("cname") String name,@RequestParam("caddress") String address){
        AddressBook ad=ar.findOne(Id);
        ad.addBuddy(new BuddyInfo(name,address));
        ar.save(ad);
        return ad;
    }
    //hello
}
