package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise3;

class PaintingApplication {
    public static void main(String[] args) {
        Derek derek = new Derek();
        derek.hangPainting();
        Tool tool = new Tool("hammer");
        derek.setTool(tool);
        derek.hangPainting();



    }

}
