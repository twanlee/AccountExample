public class AccountExampleTest {
    public static void main(String[] args) {
        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
        String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
        AccountExample accountExample = new AccountExample();
        for (String x : validAccount){
            boolean isValid = accountExample.validate(x);
            System.out.println("Account : " + x + " is valid "+ isValid);
        }
        for (String x : invalidAccount){
            boolean isValid = accountExample.validate(x);
            System.out.println("Account : " + x + " is valid "+ isValid);
        }
    }
}
