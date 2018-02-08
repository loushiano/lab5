package ali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BuddyInfos")
public class BuddyController {

    @Autowired
    BuddyInfoRepository br ;

    @GetMapping()
    public BuddyInfo createBuddy(@RequestParam("cname") String name,@RequestParam("caddress") String address ) {
        BuddyInfo b= new BuddyInfo(name,address);
        br.save(b);
        return b;
    }
    @GetMapping(value="/getBuddy")
    public BuddyInfo getBuddy(@RequestParam("address") String name ) {


        for (BuddyInfo kim : br.findByAddress(name)) {
            return kim;

        }
        return null;

    }

}
