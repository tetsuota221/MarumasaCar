package marumasa.marumasa_car.vehicle.machine;

import marumasa.marumasa_car.vehicle.Vehicle;
import marumasa.marumasa_car.vehicle.parts.Body;
import marumasa.marumasa_car.vehicle.parts.MainSeat;
import marumasa.marumasa_car.vehicle.parts.Part;
import marumasa.marumasa_car.vehicle.parts.Seat;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.List;

public class KeiTruck extends Vehicle {

    public KeiTruck(ArmorStand stand, JavaPlugin pl) {
        super(stand, pl);
    }

    @Override
    public List<Part> generateParts() {
        return new ArrayList<>() {{
            add(new MainSeat(new Vector(0, 0.5, 1.48), 0.8f, 1));
            add(new Seat(new Vector(0, 1, -0.48), 0.8f, 1));
            add(new Seat(new Vector(0, 0, -0.48), 0.8f, 1));
            add(new Seat(new Vector(0, 1, -1.48), 0.8f, 1));
            add(new Seat(new Vector(0, 0, -1.48), 0.8f, 1));
            add(new Seat(new Vector(0, 1, -2.48), 0.8f, 1));
            add(new Seat(new Vector(0, 0, -2.48), 0.8f, 1));
            add(new Body(
                    Material.DISC_FRAGMENT_5,
                    new Vector3f(0f, 0f, 0f),
                    new Vector3f(10f),
                    2
            ));
        }};
    }
}
