class Volume {

int volume(int side) {
return side * side * side;
}

int volume(int length, int width, int height) { return length * width * height;
}

double volume(double radius, int height) { return 3.14 * radius * radius * height;
}
}
public class ooplab {
public static void main(String[] args) { Volume obj = new Volume();

System.out.println("Volume of Cube: " + obj.volume(3));
System.out.println("Volume of Cuboid: " + obj.volume(4, 5, 6));
System.out.println("Volume of Cylinder: " + obj.volume(3.5, 7));
}
}
