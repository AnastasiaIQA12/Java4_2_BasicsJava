public class BmiService {
    public float calculate (int weight_in_kg, int height_in_sm){
       float height = (float) height_in_sm/100;
       float body_mass_index = (float) weight_in_kg / (height*height);
       return body_mass_index;
    }
}
