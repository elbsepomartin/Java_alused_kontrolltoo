public class numbriArvutus {
    public void Numbrid() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 9 ; j >= 0; j--) {
                int reaNumbrid = 10 - i;

                System.out.print(Math.min(reaNumbrid, j) + " ");

            }
            System.out.print('\n');
        }
    }
}
