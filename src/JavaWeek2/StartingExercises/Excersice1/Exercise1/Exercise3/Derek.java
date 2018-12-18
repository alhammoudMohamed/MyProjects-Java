package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise3;

public class Derek {
    private Tool tool = new Tool(" ");

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public boolean canHangPainting() {

        return tool.getName().equals("hammer");


    }


    public void hangPainting() {
        if (canHangPainting()) {
            System.out.println("I can hang the painting");
        } else {
            System.out.println("I am missing a hammer");


        }
    }

}