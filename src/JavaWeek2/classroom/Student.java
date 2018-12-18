package JavaWeek2.classroom;

public class Student {

    public class student {
        private  String name;
        public student(String name){
            this.name = name;

        }
        public void paint (Marker marker){

            System.out.println(name + " paints");
            marker.paint();

        }

    }
}
