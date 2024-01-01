package ProblemsOnRecursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String dest, String helper)
    {
        if(n == 1) {
            System.out.println("Move disk 1 from "+src+" tower to "+dest+" tower");
            return;
        }

        towerOfHanoi(n-1, src, helper, dest);
        System.out.println("Move disk "+n+" from "+src+" tower to "+dest+" tower");
        towerOfHanoi(n-1, helper, dest, src);
    }

    public static void main(String[] args) {
        towerOfHanoi(10, "Source", "Destination", "Helper");
    }
}
