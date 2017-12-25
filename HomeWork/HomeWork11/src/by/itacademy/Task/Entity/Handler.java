package by.itacademy.Task.Entity;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class Handler extends DefaultHandler{

    People people = null;
    Root root = null;
    private  List<People> peoples = new ArrayList<>();
    String element = "";
    String str = "";
    Boolean inPeopleSection = false;


    public List<People> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<People> peoples) {
        this.peoples = peoples;
    }

    @Override
    public void startDocument()throws SAXException {
        System.out.println("Start pars..... ");
    }

    @Override
    public void startElement(String nameSpace, String localName, String qName, Attributes attributes) throws SAXException {


     element = qName;
     if(element.equals("root")){
         root = new Root();
         root.setPeople(peoples);

     }
     if(element.equals("people")){
         people = new People();
         peoples.add(people);
         inPeopleSection = true;
     }


    }

    @Override
    public void characters(char[] ch, int start, int end) throws SAXException {
         str = new String(ch, start, end);

    }

    @Override
    public void endElement(String nameSpace, String localName, String qName)throws SAXException {

            if (element.equals("name")) {
                if (inPeopleSection) {
                    people.setName(str);
                 //   System.out.println(str);
                } else {
                    root.setName(str);
                 //   System.out.println(str);
                }
            }


            if (element.equals("surname")) {
                people.setSurname(str);
              //System.out.println(str);

            }
            if (element.equals("id")) {
                people.setId(Integer.valueOf(str));
              //  System.out.println(str);

            }
            if (element.equals("age")) {
                people.setAge(Integer.valueOf(str));
               // System.out.println(str);

            }
            if (element.equals("isDegree")) {
                people.setDegree(Boolean.valueOf(str));
              //  System.out.println(str);

            }

    }

    @Override
    public void endDocument()throws SAXException {
        System.out.println("End pars..... ");
    }


}
