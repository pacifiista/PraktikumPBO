package JOBSHEET1;

public class roadBike extends bike19 {
    private int tireWidth;

        public void setTireWidth(int width) {
            this.tireWidth = width;
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Tire Width: " + tireWidth + " mm");
            System.out.println("Bike Type: Road Bike");
        }   

        public int getTireWidth() {
            return tireWidth;
        }
    
}
