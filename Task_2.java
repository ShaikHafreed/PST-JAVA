import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] sensor = new String[n];
        double[] temp = new double[n];

        
        for (int i = 0; i < n; i++) {
            sensor[i] = sc.next();
            temp[i] = sc.nextDouble();
        }

        String[] uniqueSensor = new String[n];
        double[] sum = new double[n];
        int[] count = new int[n];
        int size = 0;

   
        for (int i = 0; i < n; i++) {

            if (temp[i] > 50) {

                int index = -1;

                for (int j = 0; j < size; j++) {

                    if (uniqueSensor[j].equals(sensor[i])) {
                        index = j;
                        break;
                    }
                }

                if (index == -1) {

                    uniqueSensor[size] = sensor[i];
                    sum[size] = temp[i];
                    count[size] = 1;
                    size++;

                } else {

                    sum[index] += temp[i];
                    count[index]++;
                }
            }
        }

        
        double[] average = new double[size];

        for (int i = 0; i < size; i++) {
            average[i] = sum[i] / count[i];
        }

      
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (average[i] < average[j]) {

                    double tempAvg = average[i];
                    average[i] = average[j];
                    average[j] = tempAvg;

                    String tempSensor = uniqueSensor[i];
                    uniqueSensor[i] = uniqueSensor[j];
                    uniqueSensor[j] = tempSensor;
                }
            }
        }

        
        System.out.println("Sensor Average Temperature:");

        for (int i = 0; i < size; i++) {
            System.out.println(uniqueSensor[i] + " " + average[i]);
        }

        sc.close();
    }
}