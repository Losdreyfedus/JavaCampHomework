public class Main {
    public static void main(String[] args) {
        int number = -1; //istediğiniz bir numaranın asal mı değil mi olduğunu gösteren bir proje.
        boolean asalMi = false;
        if (number == 1 || number<0){
            System.out.println("Asal Değildir!");
            return;
        }
        if (number == 0){
            System.out.println("Geçersiz numara");
            return;
        }

        for (int i = 2; i<number;i++){
            if(number%i == 0){
                asalMi = true;
            }
        }
        if (asalMi == true){
            System.out.println("Asal Değildir!");
        }
        else{
            System.out.println("Asaldır!");
        }
    }
}
