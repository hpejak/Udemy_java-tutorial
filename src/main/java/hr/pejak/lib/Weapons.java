package hr.pejak.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Weapons implements Iterable<String>{
    private static final Logger log = LoggerFactory.getLogger(Weapons.class);

    LinkedList<String> weaponOffer = new LinkedList<>();

    public Weapons(){
        weaponOffer.add("Knife");
        weaponOffer.add("Saw");
    }

    @Override
    public Iterator<String> iterator() {
        return new WeaponsIterator();
    }

    public void addToWeapons(String weapon){
        weaponOffer.add(weapon);
    }

    public String getWeapon(int index){
        return weaponOffer.get(index);
    }

    private class WeaponsIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return  index < weaponOffer.size();
        }


        @Override
        public String next() {

            StringBuilder weaponItem = new StringBuilder();

            try {
                Weapons weapon = new Weapons();
                weaponItem.append(weapon.getWeapon(index));
                weaponItem.append(" Piece");

            } catch (NoSuchElementException e){
                log.error("ERROR {}",(Object) e.getStackTrace());
            }
            index++;

            return weaponItem.toString();
        }

        @Override
        public void remove() {
            weaponOffer.remove(index);
        }
    }

}
