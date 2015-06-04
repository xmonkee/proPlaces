package gerber.uchicago.edu;

import java.util.ArrayList;
import java.util.List;

public class YelpResultsData {

    public List<Business> businesses;
    public class Business {

        public String name;
        public String url;
        public String phone;
        public Location location;
        public String rating_img_url;
        public List<List<String>> categories;
        public class Location {
            public List<String> address;
        }
    }

    public ArrayList<String> getSimpleValues() {
        ArrayList<String> simpleValues = new ArrayList<String>();
        for (Business biz : businesses) {
            try { simpleValues.add(biz.name + " | " + biz.location.address.get(0));
            } catch (Exception e) { }
        }
        return simpleValues;
    }
}


