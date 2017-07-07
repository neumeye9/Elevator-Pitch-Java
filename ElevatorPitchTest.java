class ElevatorPitchTest{
    public static void main(String[] args){
        ElevatorPitch one = new ElevatorPitch();
        one.setName("Gordie Howe International Bridge");
        one.setDescription("New bridge between Detroit and Canada");
        String pitchName = one.getName();
        String pitchDescription = one.getDescription();
        System.out.println("Elevator Pitch object - Name: " + pitchName + ", Description: " + pitchDescription);

        ElevatorPitch two = new ElevatorPitch("Gordie Howe International Bridge");
        
        two.setDescription("New bridge between Detroit and Canada");
        String pitchName = two.getName();
        String pitchDescription = two.getDescription();

        System.out.println("Elevator Pitch object - Name:" + pitchName + ", Description:" + pitchDescription);

        ElevatorPitch three = new ElevatorPitch("Gordie Howe International Bridge", "New bridge between Detroit and Canada");
        String pitchName = three.getName();
        String pitchDescription = three.getDescription();

        System.out.println("Elevator Pitch object - Name:" + pitchName + ", Description:" + pitchDescription);
        

        
    }
}